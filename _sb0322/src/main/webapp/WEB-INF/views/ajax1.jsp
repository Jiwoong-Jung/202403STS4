<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="here"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
$(function() {
	//alert("나온다");
	$.ajax({
		url : '/',
		method : 'GET',
		success : function(data) {
			$('#here').html(data);
		}
	});
});
</script>
</body>
</html>