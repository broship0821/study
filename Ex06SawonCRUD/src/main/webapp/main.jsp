<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.do" method="post">
	<h1>로그인</h1>
	아디: <input type="text" name="id"><br>
	비번: <input type="password" name="pw"><br>
	<input type="submit" value="로그인"><br>
	<a href="signUp.do"><input type="button" value="회원가입"></a>
</form>
</body>
</html>