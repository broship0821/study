<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//String name = request.getParameter("name");
	//pageContext.setAttribute("name", name); //el쓸려면 setAttribute 써야만 되네
	

%>
request.getParameter 만 써도 가능: <%-- <%=name %> --%>
pageContext.setAttribute 써야만 가능: ${name}

아 그냥 바로 쓸려면 param. 을 붙여야 되는 구나 ${param.name}