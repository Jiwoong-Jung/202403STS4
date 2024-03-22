<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<head>
<title>top page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style>
h1 {
	font-size: 18pt;
	font-weight: bold;
	color: gray;
}

body {
	font-size: 13pt;
	color: gray;
	margin: 5px 25px;
}

tr {
	margin: 5px;
}

th {
	padding: 5px;
	color: white;
	background: darkgray;
}

td {
	padding: 5px;
	color: black;
	background: #e0e0ff;
}

.err {
	color: red;
}
</style>
</head>
<body>
	<h1>부서-사원</h1>
	<hr />
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<c:forEach var="dept" items="${list}">
			<tr>
				<td><a href="selectEmp?deptno=${dept.deptno}">${dept.deptno}</a></td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>직무</th>
			<th>상급자사번</th>
			<th>입사일</th>
			<th>급여</th>
			<th>보너스</th>
		</tr>
		<c:forEach var="emp" items="${list2}">
			<tr>
				<td><a href="updateForm?id=${emp.empno}">${emp.empno}</a></td>
				<td><a href="updateForm?id=${emp.empno}">${emp.ename}</a></td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td>${emp.sal}</td>
				<td>${emp.comm}</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<table>
		<form method="post" action="input">
			<tr>
				<td><label for="empno">사번</label></td>
				<td><input type="text" name="empno" /></td>
			</tr>
			<tr>
				<td><label for="ename">이름</label></td>
				<td><input type="text" name="ename" /></td>
			</tr>
			<tr>
				<td><label for="job">직무</label></td>
				<td><input type="text" name="job" /></td>
			</tr>
			<tr>
				<td><label for="mgr">상급자 사번</label></td>
				<td><input type="text" name="mgr" /></td>
			</tr>
			<tr>
				<td><label for="sal">월급</label></td>
				<td><input type="text" name="sal" /></td>
			</tr>
			<tr>
				<td><label for="comm">보너스</label></td>
				<td><input type="text" name="comm" /></td>
			</tr>
			<tr>
				<td><label for="detpno">부서번호</label></td>
				<td><input type="text" name="detpno" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
		</form>
	</table>

</body>
</html>