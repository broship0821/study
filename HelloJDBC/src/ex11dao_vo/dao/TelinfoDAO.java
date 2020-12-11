package ex11dao_vo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex11dao_vo.dbconn.TelinfoDBConn;

public class TelinfoDAO {
	private Connection conn;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public TelinfoDAO() throws ClassNotFoundException, SQLException {
		conn = new TelinfoDBConn().getConn();
	}
	
	public void pstmtClose() throws SQLException{
		if(pstmt!=null) pstmt.close();
	}
	
	public void getAllInfoClose() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
	}
	
}
