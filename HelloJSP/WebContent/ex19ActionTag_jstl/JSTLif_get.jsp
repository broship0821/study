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
	<!-- test 안에 조건식이 와야됨 -->
	<c:if test="${param.chimi=='tennis' }">
		<h2>테니스를 선택하셨군요</h2>
	</c:if>
	<c:if test="${param.chimi=='soccer' }">
		<h2>축구를 선택하셨군요</h2>
	</c:if>
	<c:if test="${param.chimi=='golf' }">
		<h2>골프를 선택하셨군요</h2>
	</c:if>
</body>
</html>