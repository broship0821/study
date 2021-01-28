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
	//include로 가져올때 메인 페이지에 이거 해줘야되네
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>
<h2>include</h2>
<pre>
include directive : 내용을 그대로 include(포함되고 컴파일함)
include action tag : html, jsp 등의 처리 결과를 include(각자 컴파일 후 포함됨)
</pre>
<jsp:include page="includeSub.jsp" />
<br><br><br>
<jsp:include page="includeSubParam.jsp">
	<jsp:param value="메시" name="name1"/>
	<jsp:param value="손흥민" name="name2"/>
</jsp:include>
</body>
</html>