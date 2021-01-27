<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 페이지 저장소에 있는 값 가져오기 -->
${pageScope.page}<br>
<!-- request -->
${requestScope.req}<br>
<!-- 세션 -->
${sessionScope.ses}<br>
<!-- 어플리케이션 -->
${applicationScope.app}<br>
<!-- default -->
${page}<br>
${req}<br>
${ses}<br>
${app}<br>
<!-- scope 안붙여도 저장소에 있는건 바로 꺼낼수 있네, 만약 변수명이 중복되면 세션꺼됨  -->
</body>
</html>