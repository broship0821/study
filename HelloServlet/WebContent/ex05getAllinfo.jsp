<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	MVC2 하는 방법
	페이지 방식으로 구분:
	1. input --- servlet --- output
	2. input,output 한 파일로 처리
	
	servlet 방식으로 구분:
	1. 모두 하나의 servlet으로 처리(프론트 디스패쳐, 결국은 이거 사용)
	2. 서블릿(컨트롤러)을 여러개 만들어서 각각 jsp에 매핑(일단 이걸로 시작)
 -->
<table border="2">
	<tr>
		<td colspan="4">
			<form action="Telallview">
				<input type="submit" value="모두보기" />
			</form>
		</td>
	</tr>
</table>
</body>
</html>