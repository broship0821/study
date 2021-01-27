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
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	String[] coffees = request.getParameterValues("coffee");
	int money = Integer.parseInt(request.getParameter("money"));//낸돈
	int sum = 0; //내야할돈
	//일단 내야할 돈 계산
	for(String coffee : coffees){
		switch(coffee){
		case "흑당커피": sum+=2700; break;
		case "카페라떼": sum+=1700; break;
		case "카페모카": sum+=2000; break;
		case "아메리카노": sum+=900; break;
		case "에스프레소": sum+=3000; break;
		case "카푸치노": sum+=2500; break;
		}
	}
	//지불한 돈보다 지불해야할 돈이 많으면 계산 불가
	if(sum>money){
		out.println("<h1>잔액이 부족합니다.</h1>");
	} else{
		out.println("<h1>잔액 반환 "+(money-sum)+"원 입니다</h1>");
		for(String coffee : coffees){
			out.println(coffee+" 구매하셨군요<br>");
		}
	}
	out.println("<br><a href='index.html'>다시 주문하기.</a>");
	
%>
</body>
</html>