<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!-- 에러페이지에서는 isErrorPage="true" 쓰면 exception.getMessage() 사용가능 이페이지는 에러페이지라는뜻  -->
<% response.setStatus(200); %><!-- 간혹 이 페이지를 500 에러 처리할수도 있음, 이거 써주는 것이 좋음 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
다음과 같은 에러가 발생하였습니다
계속 에러가 계속되면 상담원에게 연락주시기 바랍니다.
전화번호: 02-1234-1234
</pre>
<hr>
에러 내용: 
<h3><%=exception.getMessage() %></h3>
</body>
</html>