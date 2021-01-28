<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] fruits = {"사과","배","감"};
	session.setAttribute("fruits", fruits);
%>
	<a href="JSTLforEach_get.jsp">일단 forEach 개념인 for(:) 사용</a>
</body>
</html>