<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- only jsp로만 작성 -->
${param.name }님의 학점은
<%
	int num = Integer.parseInt(request.getParameter("num"));
	switch(num/10){
	case 10:
	case 9:
		out.println("A");
		break;
	case 8:
		out.println("B");
		break;
	case 7:
		out.println("C");
		break;
	case 6:
		out.println("D");
		break;
	default :
		out.println("F");
		break;
	}
%>
입니다.
</body>
</html>