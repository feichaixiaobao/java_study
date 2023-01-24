package jp.example.filter;

import static org.apache.commons.lang3.function.Failable.*;

import java.sql.DriverManager;
import java.util.Collections;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jp.co.future.uroborosql.SqlAgent;
import jp.co.future.uroborosql.UroboroSQL;
import jp.co.future.uroborosql.config.SqlConfig;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * 自動トランザクションフィルターです。
 * <pre>
 * スレッドローカルを使用した一般的なデータベーストランザクションのテンプレート実装です。
 * このフィルターでは uroboroSQL を使用して、データベースの初期データロード、トランザクションを制御します。
 * </pre>
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
@Slf4j
public class AutoTransactionFilter extends HttpFilter {
	
	//-------------------------------------------------------------------------
	// グローバルに使用する public static メソッド
	//-------------------------------------------------------------------------

	/**
	 * 汎用 DAO トランザクションマネージャーを取得します。<br>
	 * サンプルでは SLF4J の simplelogger.properties で SQL のログレベルを設定できます。
	 * (Logback を依存性に追加して使用する場合は logback.xml)
	 * <pre>
	 * SqlAgent の仕様 (uroboroSQL)
	 * 
	 * ・自動採番の主キーを持つテーブルは、id などのエンティティに関するアノテーションは不要です。
	 * ・スネークケース、キャメルケースは自動変換されます。ただし、バインドパラメータ名は変換されません。
	 * ・queryWith や query で使用する 2Way SQL の条件 (OGNL) は下記を参照してください。
	 * 　https://future-architect.github.io/uroborosql-doc/background/#条件分岐-if-elif-else-end
	 * 
	 * AutoTransactionFilter の制御
	 * 
	 * ・Servlet の処理が正常に終了した場合はコミット、例外が発生した場合はロールバックされます。
	 * ・ロールバックは、JTA や Spring のデフォルトと異なり単純にすべての例外が対象です。
	 * ・必要に応じて dao().commit() や dao().rollback() でマニュアル制御できます。
	 * ・トランザクション境界内に JSP も含まれているため、JSP EL から参照するフォームモデル内でも利用可能です。 
	 *   (分散モデルが不要な Web 単一層アーキテクチャ向け)
	 * 
	 * </pre>
	 * @return SqlAgent
	 */
	public static SqlAgent dao() {
		return daoThreadLocal.get();
	}
	
	//-------------------------------------------------------------------------
	// Servlet フィルター処理
	//-------------------------------------------------------------------------
	
	private static final ThreadLocal<SqlAgent> daoThreadLocal = new ThreadLocal<>();
	private SqlConfig daoConfig;

	/** データベース接続設定と初期データロード */
	@Override @SneakyThrows
	public void init() {
		try {
			DataSource dataSource = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/main"); // context.xml
			daoConfig = UroboroSQL.builder(dataSource).build();
			try (SqlAgent dao = daoConfig.agent()) {
				dao.update("create_table").count(); // ファイル実行 src/main/resources/sql/create_table.sql
			}
		} catch (Exception e) {
			log.error("{} 初期化エラー", getClass().getSimpleName(), e);
			throw e;
		}
	}
	
	/** JDBC ドライバー破棄 (無くても問題ないが Tomcat 警告抑止のため) */
	@Override
	public void destroy() {
		Collections.list(DriverManager.getDrivers()).forEach(asConsumer(DriverManager::deregisterDriver));
	}
	
	/** トランザクション開始、コミット、ロールバック */
	@Override @SneakyThrows
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
		
		// html css js などを除外 (ドットを含む Servlet マッピングはサポートしない)
		if (req.getRequestURI().contains(".")) {
			super.doFilter(req, res, chain);
			return;
		}
		
		// トランザクション制御ブロック
		try (SqlAgent dao = daoConfig.agent()) {
			try {
				daoThreadLocal.set(dao);
				super.doFilter(req, res, chain); // 次のフィルター呼び出し
				dao.commit();
				
			} catch (Throwable e) {
				dao.rollback();
				// 再スローしない (次のフィルターで例外ハンドリングが必須)
				
			} finally {
				daoThreadLocal.remove();
			}
		}
	}
}
