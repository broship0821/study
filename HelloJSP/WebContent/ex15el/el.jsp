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
	double value = 37.8;
	String value2 = null;
%>
<%="온달" %>
${"온달"}

<br><br><br>
${100 } <br>
${100+200 } <br>
${100>2 } <br>
${200.35 } <br>
${10%3 } <br>
${false } <br>
${empty value2 } <br>
${empty ""}<!-- 얘도 널임 --> <br><br>
${empty "a" } <br>
${null }<!-- 자바에서 null나면 널포인터에러 나오는데 여긴 그냥 무시 --> <br>
<br><br><br>
문자형*숫자<br>
<%=Integer.parseInt("100")+200 %><br>
<!-- el은 연산할때 다 숫자로 바꿔줌 -->
${"100"+200}<br><!-- 300 -->
${"100"+"200"}<br><!-- 300 -->

${50==50}<br><!-- true -->
${50 eq 50}<br><!-- true -->
${(100>3)?"커":"작아" }<br><!-- 커 -->

<!-- 나머지 연산자 -->
${10%3 } <br><!-- 1 -->
${10 mod 3 } <br><!-- 1 -->
</body>
</html>