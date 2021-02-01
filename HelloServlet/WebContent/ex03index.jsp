<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 확장자가 없으니 서블릿 -->
<form action="Sungjuk" method="post">
	이름: <input type="text" name="name" /><br />
	점수: <input type="text" name="num" /><br />
	<input type="submit" value="서버로 이동" />
</form>
</body>
</html>