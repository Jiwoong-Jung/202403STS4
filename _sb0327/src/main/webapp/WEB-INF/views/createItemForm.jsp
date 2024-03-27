<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="fragments/header.jsp" />
</head>
<body>
<div class="container">

    <jsp:include page="fragments/bodyHeader.jsp" />

    <form action="${pageContext.request.contextPath}/items/new" method="post">
        <div class="form-group">
            <label for="name">상품명</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="이름을 입력하세요">
        </div>

        <div class="form-group">
            <label for="price">가격</label>
            <input type="number" id="price" name="price" class="form-control" placeholder="가격을 입력하세요">
        </div>

        <div class="form-group">
            <label for="stockQuantity">수량</label>
            <input type="number" id="stockQuantity" name="stockQuantity" class="form-control" placeholder="수량을 입력하세요">
        </div>

        <div class="form-group">
            <label for="author">저자</label>
            <input type="text" id="author" name="author" class="form-control" placeholder="저자를 입력하세요">
        </div>

        <div class="form-group">
            <label for="isbn">ISBN</label>
            <input type="text" id="isbn" name="isbn" class="form-control" placeholder="ISBN을 입력하세요">
        </div>

        <!-- Add other form fields as needed -->

        <input type="submit" value="Submit">
    </form>

</div>
</body>
</html>