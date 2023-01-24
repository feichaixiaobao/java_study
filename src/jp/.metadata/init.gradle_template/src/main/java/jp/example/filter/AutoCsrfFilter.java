package jp.example.filter;

import static java.lang.String.*;
import static jp.example.filter.RequestContextFilter.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.WriteListener;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import jakarta.servlet.http.HttpSession;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * 自動 CSRF フィルターです。
 * <pre>
 * このフィルターはセキュリティに関するもので必須ではありません。web.xml からコメントアウトしても動作します。
 * web.xml の dispatcher 要素に REQUEST, FORWARD を指定する必要があります。
 * 一般的な CSRF 攻撃への対策実装と比較して以下が自動化されているため、通常はフロントエンドで何もする必要はありません。
 * 
 * 1. Java コードや特別なタグ指定なしで、自動的に jsp と html に meta や form の hidden を埋め込み、Cookie にもセット。
 * 2. 画面遷移ごとにトークンが新しく生成されるため、同期トークンとしても機能する。
 *    ・AJAX アクセスの場合はトークンを更新しないため、AJAX 後の画面からの post でトークンエラーは発生しない。
 *    ・画面遷移と AJAX の順序が保証されない並行リクエストがある場合の動作は不定。
 * 3. ブラウザの戻るボタンでエラーにならずにブラウザ標準の操作が可能 (Chrome のような bfcache 無効化対応ブラウザのみ)。
 *    ・修正画面 → 完了画面 → ブラウザ戻る → 修正画面 (再修正)
 *    ・登録画面 → 完了画面 → ブラウザ戻る → 登録画面 (連続登録)
 * 
 * クライアントでのトークン手動操作
 * 
 * form サブミット、form 内容の JavaScript 送信、Angular、axios の場合は、自動的にトークンがリクエストに含まれます。
 * 自動 CSRF 送信をサポートしないプレーンな JavaScript などで手動 post する場合は、下記のいずれかで取得し、
 * post リクエストヘッダーの X-XSRF-TOKEN にセットする必要があります。
 * 
 *     // form の hidden から取得 (method="post" の form がある画面のみ)
 *     document.forms[0]._csrf.value
 *     
 *     // meta タグから取得する場合 (すべての画面)
 *     document.querySelector("meta[name='_csrf']").content
 *     
 *     // Cookie から取得する場合 (すべての画面、API クライアント)
 *     document.cookie.split('; ').find(e => e.startsWith('XSRF-TOKEN')).split('=')[1]
 * 
 * また、アップロード用の multipart post form の場合は、hidden が getParameter で取得できないため、action 属性に
 * クエリー文字列として指定する必要がありますが、今のところ、自動埋め込みには対応していません。
 * 下記のようにセッション属性値 ${_csrf} を明示的に指定してください。
 * 
 *     form タグ
 *     action="/upload?_csrf=${_csrf}" method="post" enctype="multipart/form-data"
 * 
 * </pre>
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
@Slf4j
public class AutoCsrfFilter extends HttpFilter {

	/** CSRF トークンのセッション、Cookie、リクエストパラメーターの name */
	private static final String _csrf = "_csrf";

	@Override @SneakyThrows
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
		
		// css js などを除外 (html や jsp は除外しない、ドットを含む Servlet マッピングはサポートしない)
		String uri = req.getRequestURI();
		boolean isHtml = StringUtils.endsWithAny(uri, ".jsp", ".html"); // .jsp は FORWARD 時
		if (!isHtml && uri.contains(".")) {
			super.doFilter(req, res, chain);
			return;
		}
		
		// [REQUEST] POST サブミット時のトークンチェック (Servlet を介さない html へのサブミット時も対象)
		if (req.getDispatcherType() == DispatcherType.REQUEST && notMatchToken(req, res)) {
			if (isAjax()) {
				res.sendError(HttpServletResponse.SC_FORBIDDEN);
			} else {
				// トップへリダイレクト (AutoFlashFilter で使えるフラッシュ属性 MESSAGE をセットしておく)
				String message = req.isSecure() ? "セッションが切れました。" : "CSRF トークンが不正です。";
				req.getSession().setAttribute("FLASH", Map.of("MESSAGE", message));
				res.sendRedirect(req.getContextPath());
				// 同期トークンチェックとしても機能する (bfcache 無効化により、戻るボタンからの送信は正常に機能する) ため、
				// 二重送信やリロード多重送信も検出できるが、事後検出ではユーザビリティが悪いため、事前に
				// JavaScript でのボタン二度押し防止、F5 POST を防ぐ PRG パターンを推奨。
			}
			return;
		}
		
		// [REQUEST, FORWARD] トークン埋め込み (html 直接アクセス、Servlet からの jsp フォワード)
		// ここで想定する文字列パターンに一致しない場合は、JSP に ${_csrf} を指定する必要がある
		if (isHtml) {
			StringResponseWrapper resWrapper = new StringResponseWrapper(res);
			super.doFilter(req, resWrapper, chain);
			String csrfToken = (String) req.getSession().getAttribute(_csrf);
			String html = resWrapper.getString()
				
				// meta タグ追加 (単一)
				.replaceFirst("(?i)(<head>)", format("""
					$1\n<meta name="_csrf" content="%s">""", csrfToken))
					
				// form post 内に hidden 追加 (複数)
				.replaceAll("(?is)([ \t]*)(<form[^>]+method=\"post[^>]+>)", format("""
					$1$2\n$1\t<input type="hidden" name="_csrf" value="%s">""", csrfToken));
					
			res.setContentLength(html.getBytes(resWrapper.getCharacterEncoding()).length);
			res.getWriter().print(html);
		} else {
			super.doFilter(req, res, chain);
		}
	}

	/**
	 * POST 時のトークンをチェックします。
	 * @return トークンが一致しない場合は true
	 */
	synchronized protected boolean notMatchToken(HttpServletRequest req, HttpServletResponse res) {
		
		// トークンチェック (リクエスト、ヘッダー、Cookie は標準的な名前を使用)
		HttpSession session = req.getSession();
		if (req.getMethod().matches("(POST|PUT|DELETE|PATCH)")) {
			String sesCsrf = (String) session.getAttribute(_csrf);
			String reqCsrf = StringUtils.firstNonEmpty(
				req.getParameter(_csrf), 		// form hidden "_csrf" → フォームサブミットやフォームベースの AJAX
				req.getHeader("X-CSRF-TOKEN"),	// meta "_csrf" → jQuery からの AJAX 送信でよく使われる名前
				req.getHeader("X-XSRF-TOKEN")	// Cookie "XSRF-TOKEN" → Angular、axios などで自動的に使用される名前
			);
			if (reqCsrf == null || !reqCsrf.equals(sesCsrf)) {
				log.debug("CSRF 不一致 (session:{} request:{})", sesCsrf, reqCsrf);
				return true; // エラー
			}
		}
		
		// 画面遷移の場合はトークンを生成し直し
		if (!isAjax() || session.getAttribute(_csrf) == null) {
			session.setAttribute(_csrf, UUID.randomUUID().toString());
		}
		
		// AJAX 参照用 Cookie 書き込み
		// * Secure: isSecure で判定。localhost では無視される。プロキシ経由は x-forwarded-proto が必要。
		// * SameSite: Strict (送信は同一サイトのみ)。ブラウザのデフォルトは Lax (別サイトから GET 可能、POST 不可)。
		// * HttpOnly: 指定なし。JavaScript から参照可能にするために指定しない。
		res.addHeader("Set-Cookie", format("XSRF-TOKEN=%s;%sSameSite=Strict;", 
				session.getAttribute(_csrf), req.isSecure() ? " Secure;" : ""));
		
		// Cache-Control no-store で bfcache 無効化 (ブラウザの種類やバージョンに依存)
		// * ブラウザ戻るボタンでできるだけエラーにならないようにする
		// * ブラウザ戻るボタンでの get ページ表示は、bfcache ではなくサーバから再取得される (トークンを一致させる)
		// * 登録 → ブラウザ戻るボタン → 登録: 不正ではなく連続登録できる
		// * 更新 → ブラウザ戻るボタン → 更新: 不正ではなく再修正できる
		// * 二重送信やリロードによる POST 多重送信はトークンエラーとなる
		// * 戻るボタン後のサブミットをエラーにしたい場合は、下記の bfcache を無効化しないようにする
		res.setHeader("Cache-Control", "max-age=0, must-revalidate, no-cache, no-store, private, post-check=0, pre-check=0");
		res.setDateHeader ("Expires", 0); // プロキシサーバのキャシュ抑止
		return false; // 正常
	}
	
	/**
	 * レスポンス処理後にコンテンツを文字列として取得するための HTTP レスポンスラッパークラスです。
	 */
	private static class StringResponseWrapper extends HttpServletResponseWrapper {
		
		private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		private final PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
		
		public StringResponseWrapper(HttpServletResponse res) {
			super(res);
		}
		
		public String getString() throws UnsupportedEncodingException {
			printWriter.flush();
			return byteArrayOutputStream.toString(getCharacterEncoding());
		}
		
		@Override public PrintWriter getWriter() { // jsp
			return printWriter;
		}
		
		@Override public ServletOutputStream getOutputStream() { // html
			return new ServletOutputStream() {
				
				@Override public void write(int b) {
					byteArrayOutputStream.write(b);
				}
				@Override public void setWriteListener(WriteListener writeListener) {
					throw new UnsupportedOperationException("このメソッドは拡張子が jsp、html の場合は使用できません。");
				}
				@Override public boolean isReady() {
					return false;
				}
			};
		}
	}
}
