<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>구매가 취소되었습니다</h2>
<%
	session.invalidate();
%>
<a href="index.html">다시 구매하시겠습니까?</a><br>
</body>
</html>