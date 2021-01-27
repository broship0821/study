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
	
	//ArrayList 로 해도 OK
	Object obj1 = session.getAttribute("xl");
	Object obj2 = session.getAttribute("l");
	Object obj3 = session.getAttribute("m");
	
	//처음인가? 처음이면 집어넣고 처음 아니면 안집어넣음
	int xl = 0, l = 0, m = 0;
	if(obj1!=null)
		xl = (int)obj1;
	if(obj2!=null)
		l = (int)obj2;
	if(obj3!=null)
		m = (int)obj3;
	
	//분류작업, 누적시키기
	if(size.equals("XL")){
		 xl += num; //xl 선택시 xl에 개수 들어감
	} else if(size.equals("L")){
		l += num;
	} else{
		m += num;
	}
	
	//여기서부터 장바구니 만들기 시작
	
	//세션에 저장하기
	//없으면 초기치 0이 들어감, 있으면 누적되서 들어감
	session.setAttribute("xl", xl);
	session.setAttribute("l", l);
	session.setAttribute("m", m);
	//세션초기화: session.invalidate();
	//세션 하나만 삭제: session.removeAttribute("xl");
	
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
<a href="index.html">더 구매하시겠습니까?</a>
</body>
</html>