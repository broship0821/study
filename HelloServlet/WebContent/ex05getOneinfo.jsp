<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>한명 출력</h1>
<form action="Telupdate">
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<td>사번</td>
			<td>이름</td>
			<td>전화</td>
			<td>입사일</td>
		</tr>
		<tr>
			<td> <input type="text" value="${tv1.id}" name="id" /></td>
			<td> <input type="text" value="${tv1.name}" name="name" /></td>
			<td> <input type="text" value="${tv1.tel}" name="tel" /></td>
			<td> <input type="text" value="${tv1.d}" name="d" /></td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="submit" value="수정하기" />
				<input type="reset" value="수정취소" />
			</td>
		</tr>
	</table>
	<input type="hidden" value="${tv1.name }" name="name2" /><!-- 바뀌기 전 원래 이름 -->
</form>
<a href="Telallview">[모두보기]</a>
<a href="TelDelete?name=${tv1.name}">[삭제]</a>
</body>
</html>