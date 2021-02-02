<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">
	<tr>
		<td colspan="4">
			<form action="getAllinfo.do">
				<input type="submit" value="모두보기" />
			</form>
		</td>
	</tr>
	<tr>
		<td>사번</td>
		<td>이름</td>
		<td>전화</td>
		<td>입사일</td>
	</tr>
	<c:forEach var="i" items="${alist1}">
		<tr>
			<td>${i.id}</td>
			<!-- 와 서블릿도 ?해서 뒤에 붙일수있넹 -->
			<td><a href="Telsearchone.do?name=${i.name}">${i.name}</a></td>
			<td>${i.tel}</td>
			<td>${i.d}</td>
		</tr>
	</c:forEach>
</table>
<a href="SawonInsert.jsp">[입력]</a>
</body>
</html>