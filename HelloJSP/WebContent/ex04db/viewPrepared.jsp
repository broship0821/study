<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");			
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		
		String sql = "select * from teltable7 where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			int readId = rs.getInt("id");
			String name = rs.getString("bigo");
%>
			<textarea name="textarea" id="ta" cols="50" rows="10"><%=name %></textarea><br />
<% //textarea에써서 db에 저장한걸 textarea에다가 집어넣으면 형식 그대로 출력됨
//근대 다른곳에다 쓸때는 replace로 \r\n -> <br> 이렇게 해줘야됨
		}
		rs.close();
		pstmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
%>

</body>
</html>