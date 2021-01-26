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
	//강사님이 만든 장바구니
	String size = request.getParameter("size");
	int num = Integer.parseInt(request.getParameter("num"));
	
	//일단 사이즈와 개수가 넘어왔으므로
	//현재 session에 있는 사이즈별 갯수가 몇개인지를 알아야?
	//앞에 만일 XL이 3개가 장바구니에 있었다면 그리고 지금 XL이 5개가 넘어왔다면
	//세션에 있는 갯수 + 지금 수량
	//그러므로 세션을 먼저 읽어야~~
	//그 다음에 수량을 누적하기 위해서 무슨 상품이 넘어왔는지를 물어보면서 직업
	
%>
<br><br>
<a href="index.html">더 구매하시겠습니까?</a>
</body>
</html>