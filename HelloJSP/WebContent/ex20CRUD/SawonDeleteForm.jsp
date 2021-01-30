<%@page import="telinfoDAO.TelInfoDAO"%>
<%@page import="telinfoVO.TelInfoVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원 삭제 폼</h1>
<%
	request.setCharacterEncoding("utf-8");
	TelInfoDAO tidao = new TelInfoDAO();
	
	String oriName = request.getParameter("name");
	
	TelInfoVO tv2 = tidao.search_nametel(oriName);
%>
<form action="SawonDeleteProcess.jsp" method="post">
	<table border="2">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>입사일</th>
		</tr>
		<tr>
			<td><input type="text" name="id" value="<%=tv2.getId() %>" readonly="readonly" /></td>
			<td><input type="text" name="name" value="<%=tv2.getName() %>" readonly="readonly" /></td>
			<td><input type="text" name="tel" value="<%=tv2.getTel() %>" readonly="readonly" /></td>
			<td><input type="text" name="d" value="<%=tv2.getD() %>" readonly="readonly" /></td>
		</tr>
		<tr>
			<td colspan="4"><input type="submit" value="삭제하자"/></td>
		</tr>
	</table>
	<table>
	<tr>
		<td><a href="SawonInsertForm.jsp">[입력]</a></td>
		<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
		<td><a href="SawonAllView.jsp">[모두보기]</a></td>
	</tr>
	</table>
</form>
</body>
</html>