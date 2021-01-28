<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>삭제할 이름 선택</h1>
<%
	request.setCharacterEncoding("utf-8");
	TelInfoDAO tidao = new TelInfoDAO();
	ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
%>
<table border="2">
	<tr>
		<th>사번</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>입사일</th>
	</tr>
	<%
	for(TelInfoVO imsi : tiArray){
	%>
		<tr>
			<td><%=imsi.getId() %></td>
			<td>
				<a href="SawonDeleteForm.jsp?name=<%= imsi.getName() %>">
					<%=imsi.getName() %>
				</a>
			</td>
			<td><%=imsi.getTel() %></td>
			<td><%=imsi.getD() %></td>
		</tr>
	<%
	}
	%>
</table>
<table>
	<tr>
		<td><a href="SawonInsertForm.jsp">[입력]</a></td>
		<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
		<td><a href="SawonAllforDelete.jsp">[삭제]</a></td>
	</tr>
</table>
</body>
</html>