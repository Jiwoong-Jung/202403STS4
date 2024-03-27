<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="fragments/header.jsp" />
</head>
<body>
<div class="container">

    <jsp:include page="fragments/bodyHeader.jsp" />

    <h1>HELLO SHOP</h1>
    <p class="lead">회원 기능</p>
    <p>
        <a class="btn btn-lg btn-secondary" href="/members/new">회원 가입</a>
        <a class="btn btn-lg btn-secondary" href="/members">회원 목록</a>
    </p>
    <p class="lead">상품 기능</p>
    <p>
        <a class="btn btn-lg btn-dark" href="/items/new">상품 등록</a>
        <a class="btn btn-lg btn-dark" href="/items">상품 목록</a>
    </p>
    <p class="lead">주문 기능</p>
    <p>
        <a class="btn btn-lg btn-info" href="/order">상품 주문</a>
        <a class="btn btn-lg btn-info" href="/orders">주문 내역</a>
    </p>

    <jsp:include page="fragments/footer.jsp" />

</div> <!-- /container -->
</body>
</html>