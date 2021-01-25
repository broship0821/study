<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- @가 붙으면 지시어라는 뜻, 
charset=UTF-8 은 웹클라이언트가 응답받는 페이지 인코딩 방식
pageEncoding="UTF-8"은 현재 페이지, jsp 자체의 인코딩 방식 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%! //선언문 declaration
	String aa = "ondal";
%>
</head>
<body>
자바문법을 script 하여 오늘 날짜 출력하기 <br>
<%
	Date date = new Date();
	out.println("<h1>오늘 날짜: "+ date +"</h1>");
	out.println(request.getRequestURI()+" 에서 요청함");
%>
 <br><br><br><br>
 <%
	out.println(aa);

	String aa2 = "babo";
	out.println(aa2);
%>
 
  <br> <br><br><br>
expression 형식으로 표현하기 <br>
<%=date %>

<!-- 
5개 스크립트 태그
comment(--) 주석, declaration(!) 선언, expression(=) 표현식, scriptlet, directive 지시어(@)
 
 jsp는 html 파일을 자동으로 .java로 만들어줌
 D:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\HelloJSP\org\apache\jsp
 
 -->
 <br><br><br><br>
 <%
 	//짝 홀수
 	int i = 34;
 	if(i%2==0){
 		out.println("짝수<br>");
 	} else
 		out.println("홀수<br>");
 	
 	//로또
 	Set lotto = new HashSet();
 	while(lotto.size()<6){
 		lotto.add(Math.floor(Math.random()*46+1));
 	}
 	out.println(lotto+ "<br>");
 %>
 <br><br><br><br>
 <h2>구구단 5단</h2>
 <%
 	for(int j=1;j<=9;j++){
 %>
 		5 X <%=j %> = <%=j*5 %><br>
 		
 <%
 	}
 %>
 
</body>
</html>