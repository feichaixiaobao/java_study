package jp.example.filter;

import static java.lang.Runtime.*;
import static jp.example.filter.AutoTransactionFilter.*;
import static jp.example.filter.RequestContextFilter.*;

import java.nio.charset.StandardCharsets;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * ログイン認証フィルターです。
 * <pre>
 * Spring Security などのセキュリティフレームワークを使用できる場合は、それを使用してください。
 * このフィルターは Spring などを使用しない Servlet プロジェクトのための単純な認証フィルターで、認可機能はありません。
 * </pre>
 * <pre>
 * このフィルターはセキュリティに関するもので必須ではありません。web.xml からコメントアウトすることで無効にできます。
 * AJAX の場合は HTTP ステータス 401、それ以外の場合はログイン画面にリダイレクトします。
 * ログインに成功した場合、web.xml に指定した userEntityClass のインスタンスがセッションに "USER" として格納されます。
 * この実装では DB のユーザーテーブルに username と password カラムが必要です。
 * このフィルターより前に AutoCsrfFilter を設定することで、ログイン時に CSRF チェックされます。
 * </pre>
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
@Slf4j
public class LoginAuthFilter extends HttpFilter {
	
	//-------------------------------------------------------------------------
	// グローバルに使用する public static メソッド
	//-------------------------------------------------------------------------
	
	/**
	 * パスワードをハッシュ化します。
	 * <pre>
	 * 開発環境など https でない場合は、開発しやすいように引数のパスワードを平文のまま返します (DB も平文にしておく)。
	 * レインボー攻撃対策としてソルト、ペッパーを付加してハッシュ化します。
	 * username をソルトとして使用するため、username を変更した場合は、パスワードを再設定する必要があります。
	 * サイドチャネル攻撃耐性を持つ Argon2 (2015 年ハッシュコンペ優勝) を使用します。
	 * ハッシュ化は 10 回反復、メモリ 64MB 使用、CPU 論理コア数で並列実行します。
	 * </pre>
	 * @param isSecure https の場合は true を指定 (プロキシ経由は x-forwarded-proto が必要)
	 * @param salt ソルト (username)
	 * @param password パスワード
	 * @return ハッシュ化したパスワード (isSecure が false の場合は引数のまま)
	 */
	public static String hashPassword(boolean isSecure, String salt, String password) {
		final String pepper = LoginAuthFilter.class.getSimpleName();
		byte[] data = (salt + password + pepper).getBytes(StandardCharsets.UTF_8);
		String hash = argon2.hash(10, 65536, getRuntime().availableProcessors(), data);
		log.debug("パスワードハッシュ (length={}) {}", hash.length(), hash);
		return isSecure ? hash : password;
	}
	
	//-------------------------------------------------------------------------
	// Servlet フィルター処理
	//-------------------------------------------------------------------------

	private static final String USER = "USER";
	private static final String LOGIN_SAVED_URL = "LOGIN_SAVED_URL";
	private static final Argon2 argon2 = Argon2Factory.create();

	@Override @SneakyThrows
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
		String path = req.getRequestURI().substring(req.getContextPath().length());
		HttpSession session = req.getSession();

		if (path.equals("/logout")) {
			session.invalidate();
			res.sendRedirect(req.getContextPath());
		}
		else if (path.equals("/login") && req.getMethod().equals("POST")) {
			login(req, res);
		}
		else if (path.equals("/static") || session.getAttribute(USER) != null) {
			super.doFilter(req, res, chain);
		}
		
		// 未認証 (AJAX: HTTP 401、画面: ログイン画面にフォワード)
		else if (isAjax()) {
			res.sendError(HttpServletResponse.SC_UNAUTHORIZED);
		} else {
			if (req.getMethod().equals("GET")) {
				session.setAttribute(LOGIN_SAVED_URL, getQueryUri());
			}
			req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, res);
		}
	}
	
	@SneakyThrows
	private void login(HttpServletRequest req, HttpServletResponse res) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Object user = dao()
				.query(Class.forName(getInitParameter("userEntityClass")))
				.equal("username", username)
				.equal("password", hashPassword(req.isSecure(), username, password))
				.first().orElse(null);
		
		if (user == null) {
			req.setAttribute("MESSAGE", "正しいログイン情報を入力してください。");
			req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, res);
		} else {
			req.changeSessionId(); // セッション固定化攻撃対策
			req.getSession().setAttribute(USER, user);
			res.sendRedirect($(LOGIN_SAVED_URL, req::getContextPath));
		}
	}
}
