<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	String[] products = request.getParameterValues("product");
%>
</head>
<body>
구입내역 <br>
제품종류번호 및 제목: ${param.select } <br>
제품선택:   
<%
	if(products!=null) //null로 받아오면 배열자체가 생성 안되서 꺼내올때 오류남
	for(String product : products){
%>
		<%=product %><br>
<%
	}
%><br>
구입방법: ${param.payment } <br>
다시 구입하려면 <a href="shopping.html">여기</a> 를 누르세요
</body>
</html>