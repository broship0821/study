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
	//일단 선택한 사이즈, 갯수 가져오기
	String size = request.getParameter("size");
	int num = Integer.parseInt(request.getParameter("num"));
	//표시할 목록 먼저 생성
	int xl = (session.getAttribute("xl")!=null)?(int)session.getAttribute("xl"):0;
	int l = (session.getAttribute("l")!=null)?(int)session.getAttribute("l"):0;
	int m = (session.getAttribute("m")!=null)?(int)session.getAttribute("m"):0;
	//방금 들어온 사이즈에 수량 누적하기
	if(size.equals("XL")){
		 xl += num;
		 session.setAttribute("xl", xl);
	} else if(size.equals("L")){
		l += num;
		 session.setAttribute("l", l);
	} else{
		m += num;
		 session.setAttribute("m", m);
	}
	//화면에 표시
	if(xl!=0){
		out.println("XL 사이즈: " + xl + "<br>");
	}
	if(l!=0){
		out.println("L 사이즈: " + l + "<br>");
	}
	if(m!=0){
		out.println("M 사이즈: " + m + "<br>");
	}
%>
<br><br>
<a href="index.html">더 구매하시겠습니까?</a><br><br><br>
<a href="reset.jsp">[모두 취소]</a><br><br><br>
<a href="pay.jsp">결제하러가기</a><br>
</body>
</html>