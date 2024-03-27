<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/css/bootstrap.min.css" integrity="sha384ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href="/css/jumbotron-narrow.css" rel="stylesheet">
<title>Hello</title>

</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>HELLO SHOP</h1>
			<p class="lead">회원 기능</p>
			<p>
				<a class="btn btn-lg btn-secondary" href="/members/new">회원 가입</a> <a
					class="btn btn-lg btn-secondary" href="/members">회원 목록</a>
			</p>
			<p class="lead">상품 기능</p>
			<p>
				<a class="btn btn-lg btn-dark" href="/items/new">상품 등록</a> <a
					class="btn btn-lg btn-dark" href="/items">상품 목록</a>
			</p>
			<p class="lead">주문 기능</p>
			<p>
				<a class="btn btn-lg btn-info" href="/order">상품 주문</a> <a
					class="btn btn-lg btn-info" href="/orders">주문 내역</a>
			</p>
		</div>
	</div>
	<!-- /container -->
</body>
</html>