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
	String pw = request.getParameter("pw");

	//form 으로 보내는 파라미터는 값이 유지되는게 확인했으니
	//속성 유지되는지 확인해보자
	request.setAttribute("test", "손흥민짱짱맨");

	if("admin".equals(pw)) {
%>
	<jsp:forward page="admin.jsp" >
		<jsp:param value="bimil" name="qqq"/>
	</jsp:forward>
<%
	}
%>
<h1>로그인함</h1>
아이디: ${param.id }<br>
비번: ${param.pw }<br>
</body>
</html>