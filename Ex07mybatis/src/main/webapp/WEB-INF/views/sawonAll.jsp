<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 전체 명단</h1>
	<table border="2">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>전화</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" items="${alist}">
			<tr>
				<td>${i.id}</td>
				<td><a href="getTelinfo.do?id=${i.id}">${i.name}</a></td>
				<td>${i.tel}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
	<a href="<c:url value='/sawonInsert.do' />">[사원등록]</a>
	<a href="<c:url value='/sawonAll.do' />">[모두보기]</a>
	</div>
</body>
</html>