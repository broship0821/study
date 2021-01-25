<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
브라우저 알아내기
브라우저 엔진(크롬, opera-Blink, 애플의 사파리-webkit, 파폭-gecko(모질라,
IE - Trident, MAC IE에 탑재된것은 Tasman(ms의 레이아웃엔진))
Layout Engine : Rendering engine 이라고도 하며 html, css 정의 형태대로
화면에 보여주게 하는 sw
 -->
 getHeader : <%=request.getHeader("user-agent") %><br><br>
 <!-- 이 2개는 외우기 -->
 RequestURI : <%=request.getRequestURI() %><br><br>
 ServletPath : <%=request.getServletPath() %><br><br>
 
 ServerName : <%=request.getServerName() %><br><br>
 ServerPort : <%=request.getServerPort() %><br><br>
 Protocol : <%=request.getProtocol() %><br><br>
 Method : <%=request.getMethod() %><br><br>
</body>
</html>