<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>������</title>
</head>
<body>
	<h1>��� ���</h1>
	<form action="sawonInsert.do" method="post">
		<table border="2">
			<tr>
				<td>���</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>��ȭ��ȣ</td>
				<td><input type="text" name="tel"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="�߰�"></td>
			</tr>
		</table>
	</form>
</body>
</html>
