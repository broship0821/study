<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- jstl 쓰려면 taglib 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
jstl 사용하려면 jstl 라이브러리를 포함시켜야됨

http://tomcat.apache.org/taglibs/standard/

WebContent 아래 WEB-INF 아래 lib 방에 stand.jar 및 jstl.jar 넣는다
(ojdbc, cos 처럼)

 -->
 
 <!-- taglib 선언 없이 이 문장을 사용하면 그냥 무시하고 패스 -->
 <% out.println("자바로 쓰는법<br>"); %>
 <c:out value="Hello JSTL" /><br><!-- Hello JSTL 출력 -->
 
 <hr>
 
 <% String aa = "초기치"; %><!-- 선언 -->
 <%=aa %><br><!-- 사용 -->
 <c:set var="bb" value="jstl초기치" /><!-- 선언 -->
 ${bb}<br><!-- 사용 -->
 <c:set var="cc" >값을 여기다도 쓸수있음</c:set>  <!-- 선언 -->
 ${cc}<br><!-- 사용 -->
  
 <hr>
 
 
 
</body>
</html>