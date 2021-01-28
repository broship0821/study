<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>여기는 관리자 페이지 입니다</h1>
비밀번호 ${param.pw }를 입력해야 들어올 수 있습니다
<h2>특1: 파라미터 값이 여기까지 전달됨</h2>
<h2>특2: url이 바뀌지 않음</h2>
${test }
<h2>특3: request 속성값도 전달됨</h2>
<h2>결론: request가 다 전달됨</h2>
${param.qqq }
</body>
</html>