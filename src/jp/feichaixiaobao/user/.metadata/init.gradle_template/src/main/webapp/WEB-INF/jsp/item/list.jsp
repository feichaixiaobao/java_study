<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/css/bootstrap.min.css">
<title>JSP の場合 (一覧画面)</title>
</head>
<body class="bg-dark bg-gradient text-light vh-100">
<%-- ========== ヘッダー ========== --%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-1">
	<div class="container">
		<a class="navbar-brand" href="${ctx}">CRUD サンプル</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active" href="${ctx}/item/list">JSP</a></li>
				<li class="nav-item"><a class="nav-link" href="${ctx}/spa/react.html">React</a></li>
				<li class="nav-item"><a class="nav-link" href="${ctx}/spa/vue.html">Vue</a></li>
			</ul>
			<div class="navbar-text d-flex ${empty USER.username ? 'd-none' : ''}">
				<span class="me-3">${fn:escapeXml(USER.username)}</span>
				<a class="nav-link active" href="${ctx}/logout">ログアウト</a>
			</div>
		</div>
	</div>
</nav>
<%-- ========== メイン ========== --%>
<div class="container">
	<div class="alert mb-0" id="id_message" style="min-height:4rem">${fn:escapeXml(MESSAGE)}</div>
	<form id="id_form" method="get" class="d-sm-flex flex-wrap align-items-end">
		<label class="form-label me-sm-3">製品名</label>
		<div class="me-sm-4">
			<input class="form-control" type="search" name="name" value="${fn:escapeXml(param.name)}"
				oninput="handleChange()" autofocus onfocus="this.setSelectionRange(99,99)">
		</div>
		<label class="form-label me-sm-3">発売日</label>
		<div class="me-sm-4">
			<input class="form-control w-auto mb-3 mb-sm-0" type="date" name="releaseDate"
				onchange="handleChange()" value="${fn:escapeXml(param.releaseDate)}">
		</div>
		<button formaction="list" class="btn btn-secondary px-5">検索</button>
		<button formaction="create" class="btn btn-secondary px-5 ms-auto">新規登録</button>
	</form>
	<p class="text-end mt-4 me-1 mb-2">検索結果 ${itemList.size()} 件</p>
	<table class="table table-striped table-dark">
		<thead>
			<tr class="${empty itemList ? 'd-none' : ''}">
				<th>製品名</th>
				<th>発売日</th>
				<th class="text-center">顔認証</th>
				<th>メーカー</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
		<tbody>
	<c:forEach var="item" items="${itemList}">
			<tr>
				<td>${fn:escapeXml(item.name)}</td>
				<td>${fn:escapeXml(item.releaseDate)}</td>
				<td class="text-center">${item.faceAuth ? '○' : ''}</td>
				<td>${fn:escapeXml(item.companyName)}</td>
				<td class="text-center">
					<a href="update?id=${item.id}" class="btn btn-secondary">変更</a>
					<%-- 削除は状態変更操作のため post (_csrf hidden が自動追加される) --%>
					<form method="post" action="delete?id=${item.id}" class="d-inline">
						<button class="btn btn-warning">削除</button>
					</form>
				</td>
			</tr>
	</c:forEach>
		</tbody>
	</table>
</div>
<%-- ========== フッター ========== --%>
<footer class="footer fixed-bottom py-3 text-center bg-dark">
	<div class="container">
		<span class="text-muted">New Gradle Project Wizard (c) Pleiades MIT</span>
	</div>
</footer>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios@1/dist/axios.min.js"></script>
<script src="${ctx}/static/axios-common-interceptor.js"></script>
<script>
<%-- 検索結果件数取得 API get (_csrf 無し、検索条件入力中の結果件数 JSON 取得) --%>
const handleChange = async() => {
	const { data } = await axios.get('api?' + params(id_form));
	id_message.textContent = data.countMessage || data; <%-- 正常時は json、例外時は文字列 --%>
};
</script>
</html>
