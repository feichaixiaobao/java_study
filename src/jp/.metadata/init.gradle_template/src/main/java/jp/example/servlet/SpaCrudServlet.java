package jp.example.servlet;

import static jp.example.filter.AutoFlashFilter.*;
import static jp.example.filter.RequestContextFilter.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jp.example.entity.LoginUser;
import jp.example.form.ItemForm;

/**
 * サンプルテーブル item の SPA CRUD API Servlet です。
 * <pre>
 * JSP 版と同じ機能を SPA (React や Vue などのシングルページアプリケーション) 向けの API として実装した Servlet です。
 * クライアント非依存の REST API のみで構成されているため、フロントエンド技術の差し替えが容易です。
 * JSP と異なり、コントローラーはクライアント側になり、サンプルでは React Router と Vue Router を使用しています。
 * レスポンスに書き込み無し (returns していない) かつ例外無しの場合は、レスポンス body は空で HTTP 200 になります。
 * Servlet でスローされた例外は AutoFlashFilter で例外メッセージがレスポンスに書き込まれ HTTP 200 または 202 になります。
 * </pre>
 * <p>
 * 本来 REST API は HTTP 動詞として get、post、put、delete などを使用し、エンドポイントは名詞を使用しますが、Servlet
 * のデフォルトでは put や delete が想定どおりに動作しないため、単純に get は冪等 (副作用を起こさない)、post
 * は冪等でないかリクエスト量が多い可能性がある処理としています。
 * </p>
 * @author New Gradle Project Wizard (c) Pleiades MIT
 */
public class SpaCrudServlet {

	@WebServlet("/spa/user-name")
	public static class UserNameServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) {
			returns($("USER", LoginUser::new).username); // ログインユーザー名 (web.xml で無効化した場合は null)
		}
	}

	@WebServlet("/spa/search")
	public static class SearchServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) {
			returns(new ItemForm(req).findFormList());
		}
	}

	@WebServlet("/spa/count")
	public static class CountServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) {
			returns("結果予想件数: " + new ItemForm(req).count() + " 件 (Enter または検索ボタンを押してください)");
		}
	}
	
	@WebServlet("/spa/delete")
	public static class DeleteServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse res) {
			new ItemForm(req).delete();
		}
	}
	
	@WebServlet("/spa/select")
	public static class SelectServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) {
			returns(new ItemForm(req).findFormById());
		}
	}
	
	@WebServlet("/spa/select-company")
	public static class SelectCompanyServlet extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) {
			returns(new ItemForm().getCompanySelectOptions());
		}
	}

	@WebServlet("/spa/validate")
	public static class ValidateServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse res) {
			new ItemForm(req).validate(req);
		}
	}
	
	@WebServlet("/spa/insert")
	public static class InsertServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse res) {
			new ItemForm(req).validate(req).insert();
		}
	}
	
	@WebServlet("/spa/update")
	public static class UpdateServlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse res) {
			new ItemForm(req).validate(req).update();
		}
	}
}
