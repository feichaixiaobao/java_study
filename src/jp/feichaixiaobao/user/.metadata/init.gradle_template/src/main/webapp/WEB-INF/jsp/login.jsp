<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5/dist/css/bootstrap.min.css">
<title>タイトル</title>
</head>
<body class="bg-dark bg-gradient vh-100">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container">
		<a class="navbar-brand" href="${ctx}">CRUD サンプル</a>
	</div>
</nav>
<div class="container text-center d-flex align-items-center justify-content-center h-50">
	<div class="">
		<div class="alert mb-0 text-light" style="min-height:4rem">${MESSAGE}</div>
		<%-- post form には _csrf hidden が自動追加される --%>
		<form method="post" action="${ctx}/login" class="d-inline-block">
			<div class="form-floating">
				<input type="text" class="form-control" name="username" required
					value="${empty param.username ? 'demouser' : param.username}"
					autofocus onfocus="this.setSelectionRange(99,99)">
				<label>ユーザー名</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" name="password" required value="demo1234@">
				<label>パスワード</label>
			</div>
			<button class="w-100 btn btn-lg btn-secondary" type="submit">ログイン</button>
		</form>
	</div>
</div>
<footer class="footer fixed-bottom py-3 text-center bg-dark">
	<div class="container">
		<span class="text-muted">New Gradle Project Wizard (c) Pleiades MIT</span>
	</div>
</footer>
</body>
</html>
