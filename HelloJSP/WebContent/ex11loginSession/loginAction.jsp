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
	//form으로 전달한것들
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//아이디, 비밀번호 세션에 저장
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
%>
입력한 정보 <br>
아이디: <%=id %><br>
비밀번호: <%=pw %><br>
el 표기법으로 하니까 저기 위에 정의한 id,pw가 되는게 아니라 session에 저장된걸 가져오네<br>

<br><br><br>

<a href="burger.jsp" >햄버거 먹으러 갈려면 여기 클릭</a>

</body>
</html>