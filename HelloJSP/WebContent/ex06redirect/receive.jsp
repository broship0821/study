<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect</title>
</head>
<body>
<pre>
원래는 이 화면이 출력되야 하는데
고의로 다른 화면이 출력되게 할수 있음
</pre>
<%
	response.sendRedirect("real.jsp");
%>
로그인 없이 url만 조작하는등으로 접속할 경우 이걸로 막을 수 있음
완전 새로운 페이지로 이동, 인자 가져갈 수 없음
</body>
</html>