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
	//저장소 scope
	pageContext.setAttribute("page", "pageScope");//페이지범위
	request.setAttribute("req", "reqScope");//요청범위
	session.setAttribute("ses", "sesScope");//브라우저 살아있는동안 (1브라우저 1세션)
	application.setAttribute("app", "appScope");//WAS가 계속 가동되는 동안 (1WAS 1어플리케이션)
	
	//response.sendRedirect("scope2.jsp");
%>
<a href="./scope2.jsp">이제 a태그를 이용해서 scope2.jsp로 가볼까!!!</a>

<br><br><br><br>

<form action="./scope2.jsp">
	<input type="text" name="test" ><br>
	<input type="submit" value="페이지이동" >
</form>

<!-- 
리다이랙트로 넘겨보고
a 태그로 넘겨보고
form으로 넘겨봤는데

저장소에 저장된 값을 다 똑같음
form 안에 input에 작성한 것만 form을 통해서 갈때만 전달됨

 -->
</body>
</html>