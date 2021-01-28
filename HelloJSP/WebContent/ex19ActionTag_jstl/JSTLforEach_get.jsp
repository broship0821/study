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
<%
	//java의 for 향상문
	String[] fruits = (String[])session.getAttribute("fruits");
	for(String fruit : fruits){
		out.println(fruit+"<br>");
	}
%>
<hr>
<h2>jstl의 forEach</h2>
<c:forEach var="s" items="${fruits}">
	${s }<br>
</c:forEach>
</body>
</html>