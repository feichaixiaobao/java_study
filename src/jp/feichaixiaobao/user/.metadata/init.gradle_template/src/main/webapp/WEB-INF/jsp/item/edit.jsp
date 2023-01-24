<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/css/bootstrap.min.css">
<title>JSP の場合 (編集画面)</title>
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
				<li class="nav-item"><a class="nav-link active" href="${ctx}/item/update?id=${form.id}">JSP</a></li>
				<li class="nav-item"><a class="nav-link" href="${ctx}/spa/react.html#/edit/${form.id}">React</a></li>
				<li class="nav-item"><a class="nav-link" href="${ctx}/spa/vue.html#/edit/${form.id}">Vue</a></li>
			</ul>
			<div class="navbar-text d-flex ms-auto ${empty USER.username ? 'd-none' : ''}">
				<span class="me-3">${fn:escapeXml(USER.username)}</span>
				<a class="nav-link active" href="${ctx}/logout">ログアウト</a>
			</div>
		</div>
	</div>
</nav>
<%-- ========== メイン ========== --%>
<div class="container">
 	<div class="alert mb-0" id="id_message" style="min-height:4rem">${fn:escapeXml(MESSAGE)}</div>
	<form id="id_form" method="post" onsubmit="id_submit_button.disabled = true">
		<input type="hidden" name="id" value="${form.id}"/>
		<div class="mb-3">
			<label class="form-label">製品名</label> <span class="badge bg-danger">必須</span>
			<input class="form-control" type="text" name="name" value="${fn:escapeXml(form.name)}"
				oninput="handleChange()" required autofocus onfocus="this.setSelectionRange(99,99)" size="40">
		</div>
		<div class="mb-3">
			<label class="form-label">発売日</label> <span class="badge bg-danger">必須</span>
			<input class="form-control w-auto" type="date" name="releaseDate" value="${fn:escapeXml(form.releaseDate)}"
				onchange="handleChange()" required>
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" name="faceAuth" id="faceAuth" class="form-check-input"
				onchange="handleChange()" ${form.faceAuth ? 'checked' : ''}>
			<label class="form-check-label" for="faceAuth">顔認証</label>
		</div>
		<div class="mb-5">
			<label class="form-label">メーカー</label>
			<select name="companyId" class="form-select w-auto">
	<c:forEach var="com" items="${form.companySelectOptions}">
				<option value="${com.id}" ${form.companyId == com.id ? 'selected' : ''}
					>${fn:escapeXml(com.companyName)}</option>
	</c:forEach>
			</select>
		</div>
		<a href="${lastQueryUri == null ? 'list' : lastQueryUri}" class="btn btn-secondary px-5">戻る</a>
		<input id="id_submit_button" type="submit" class="btn btn-warning px-5" value=
			${form.id == 0
				? '"登録" formaction="create"' 
				: '"更新" formaction="update"'
			}/>
	</form>
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
<%-- 入力チェック API post (_csrf 有り、入力中のチェック結果を文字列で取得) --%>
const handleChange = async() => {
	id_message.textContent = (await axios.post('api', params(id_form))).data;
};
</script>
</html>
