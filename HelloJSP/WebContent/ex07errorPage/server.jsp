<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorpage.jsp" %>
<!-- 위에 errorPage="errorpage.jsp" 이것만 추가해주면됨 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int age = Integer.parseInt(request.getParameter("age"));
%>
<h1>당신의 나이는 <%=age %> 이군요</h1>
</body>
</html>