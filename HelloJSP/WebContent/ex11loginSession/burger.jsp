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
	if("peter".equals((String)session.getAttribute("id")) &&
			"0821".equals((String)session.getAttribute("pw"))){
		//아이디 비번 맞음
%>
		<img alt="햄버거" src="aa.jpg" width="300"><br>
		환영합니다	
<%	
	} else{ //아이디 비번 틀림
%>
		<h1>아이디 혹은 비밀번호가 틀립니다</h1>
		로그인 화면으로 돌아갈려면
		<a href="index.html">여기</a>
		를 클릭하세요	
<%
	}
%>
</body>
</html>