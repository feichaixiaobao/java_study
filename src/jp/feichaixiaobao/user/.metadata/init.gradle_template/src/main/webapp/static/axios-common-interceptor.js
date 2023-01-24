//-----------------------------------------------------------------------------
// JSP、React、Vue 共通
//-----------------------------------------------------------------------------

/**
 * axios 2xx 以外の共通エラー処理をインターセプターに設定します。
 */
axios.interceptors.response.use(
	res => res,
	error => {
		id_message.textContent = (error.response?.status == 401)
			? `❌ セッションが切れました。ページを更新してください。`
			: `❌ 処理できませんでした。 [${error.message}] ${error.config?.url}`;
		return Promise.reject(error);
	}
);

/**
 * HTML form からサーバーに送信する URLSearchParams を作成します。
 * @param {object} htmlForm HTML form 要素
 * @return {URLSearchParams}
 *	サーバーに送信するパラメーターオブジェクト。
 *	axios get の場合は第 1 引数の URL に + で連結、post の場合はそのまま第 2 引数に渡します。
 */
const params = htmlForm => new URLSearchParams(new FormData(htmlForm));
