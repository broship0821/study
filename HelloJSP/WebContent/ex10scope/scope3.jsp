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
	//아래 4개는 전부 object로 옴

	out.println((String)pageContext.getAttribute("page"));
	String page2 = (String)pageContext.getAttribute("page");
	
	//forward, include 등 요청을 연결시킬 근거가 있어야됨
	out.println((String)request.getAttribute("req"));
	String req2 = (String)request.getAttribute("req");
	
	out.println((String)session.getAttribute("ses"));
	String ses2 = (String)session.getAttribute("ses");
	
	out.println((String)application.getAttribute("app"));
	String app2 = (String)application.getAttribute("app");
%>
<br><br>
<!-- 저장소 이용 -->
<%=page %><br><!-- org.apache.jsp.ex10scope.scope2_jsp@6ddd90d2 얜 뭐지.. -->
<%=req2 %><br><!-- null -->
<%=ses2 %><br><!-- sesScope -->
<%=app2 %><br><!-- appScope -->
${page2}<br>
<!-- form 태그로 보낸거 -->
${param.test}<br><!-- scope3까지는 안가네 -->
<br><br>
<a href="./scope3.jsp">
	여기서 브라우저 모두 닫고 scope3.jsp 재수행!!<br>
	이어서 WAS 내리고 scope3.jsp 재수행
</a>
<!-- 
	새로 파이어폭스 열어서 scope3.jsp 실행 -> session null 됨
	서버 restart 하고 url 복사해서 scope3.jsp 실행 -> app까지 null 됨
 -->
</body>
</html>