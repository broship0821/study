<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- MVC 1 방식, 여기는 컨트롤러 부분만 남기기 -->
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String grade = "";
	switch(num/10){
	case 10:
	case 9:
		grade = "A";
		break;
	case 8:
		grade = "B";
		break;
	case 7:
		grade = "C";
		break;
	case 6:
		grade = "D";
		break;
	default :
		grade = "F";
		break;
	}
	
	RequestDispatcher rd1 = request.getRequestDispatcher("view/"+grade+".jsp");
	rd1.forward(request, response);
	//포워딩 방식, request, response가 유지됨
%>