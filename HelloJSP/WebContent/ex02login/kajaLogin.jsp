<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 받는 서버</h2>
<%
	//post로 올때 한글로 처리하는 방법, input 박스있으면 이거 무조건 있어야됨
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	//getParameter
	String id = request.getParameter("id"); //name이 id인것의 value가 담김
	String pw = request.getParameter("pw");
	int age = Integer.parseInt(request.getParameter("age"));
%>
입력한 아이디는 <%=id %> 이고 <br>
비밀번호는 <%=pw %> 입니다.<br>
<%=2021-age %>년생 이시군요 <br>
</body>
</html>