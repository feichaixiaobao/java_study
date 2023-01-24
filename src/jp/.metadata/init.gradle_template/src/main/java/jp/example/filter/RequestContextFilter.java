package jp.example.filter;

import java.util.Objects;
import java.util.function.Supplier;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

/**
 * リクエストコンテキストフィルターです。
 * <pre>
 * 各フィルターは基本的に独立していますが、このフィルターは唯一、他のフィルターから参照されています。
 * </pre>
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
public class RequestContextFilter extends HttpFilter {
	
	//-------------------------------------------------------------------------
	// Servlet から使用する public static メソッド
	//-------------------------------------------------------------------------
	
	/**
	 * JSP EL の ${name} のようにリクエスト、セッション、アプリケーションスコープから、最初に見つかった属性値を取得します。
	 * @param <T> 戻り値の型 (代入先があればキャスト不要)
	 * @param name 属性名
	 * @return 属性値。見つからない場合は null。
	 */
	@SuppressWarnings("unchecked")
	public static <T> T $(String name) {
		return (T) ObjectUtils.getFirstNonNull(
			() -> request().getAttribute(name),
			() -> request().getSession().getAttribute(name),
			() -> request().getServletContext().getAttribute(name));
	}
	
	/**
	 * JSP EL の ${name} のようにリクエスト、セッション、アプリケーションスコープから、最初に見つかった属性値を取得します。
	 * @param <T> 戻り値の型 (キャスト不要)
	 * @param name 属性名
	 * @param defaultValue 値が見つからなかった場合のデフォルト値
	 * @return 属性値。見つからない場合は defaultValue。
	 */
	public static <T> T $(String name, T defaultValue) {
		return Objects.requireNonNullElse($(name), defaultValue);
	}
	
	/**
	 * JSP EL の ${name} のようにリクエスト、セッション、アプリケーションスコープから、最初に見つかった属性値を取得します。
	 * @param <T> 戻り値の型 (キャスト不要)
	 * @param name 属性名
	 * @param defaultValueSupplier 値が見つからなかった場合のデフォルト値を生成する Supplier
	 * @return 属性値。見つからない場合は defaultValueSupplier から取得。
	 */
	public static <T> T $(String name, Supplier<T> defaultValueSupplier) {
		return Objects.requireNonNullElseGet($(name), defaultValueSupplier);
	}
	
	/**
	 * get パラメータを含むリクエスト URI を取得します。
	 * @return getRequestURI + "?" + getQueryString (パラメータが無い場合はリクエスト URI のみ)
	 */
	public static String getQueryUri() {
		String params = StringUtils.defaultIfBlank(request().getQueryString(), null);
		return request().getRequestURI() + (params == null ? "" : "?" + params);
	}
	
	//-------------------------------------------------------------------------
	// Filter から使用する static メソッド
	//-------------------------------------------------------------------------
	
	static HttpServletRequest request() {
		return contextThreadLocal.get().req;
	}
	
	static HttpServletResponse response() {
		return contextThreadLocal.get().res;
	}
	
	static void set(HttpServletRequest req, HttpServletResponse res) {
		contextThreadLocal.set(new RequestContext(req, res));
	}
	
	static boolean isAjax() {
		return "XMLHttpRequest".equals(request().getHeader("X-Requested-With")) || // jQuery、prototype.js
				StringUtils.contains(request().getHeader("Accept"), "/json"); // axios
	}
	
	//-------------------------------------------------------------------------
	// Servlet フィルター処理
	//-------------------------------------------------------------------------

	private static final ThreadLocal<RequestContext> contextThreadLocal = new ThreadLocal<>();
	
	private record RequestContext (
		HttpServletRequest req,
		HttpServletResponse res
	) {}

	@Override @SneakyThrows
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
		String uri = req.getRequestURI();
		if (uri.contains(".") && !uri.endsWith(".html")) { // css js など
			super.doFilter(req, res, chain); 
			return;
		}
		try {
			contextThreadLocal.set(new RequestContext(req, res));
			super.doFilter(req, res, chain);
		} finally {
			contextThreadLocal.remove();
		}
	}
}
