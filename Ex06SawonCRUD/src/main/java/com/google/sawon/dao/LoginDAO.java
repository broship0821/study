package com.google.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.google.sawon.dbconn.TelInfoDBConn;
import com.google.sawon.vo.LoginVO;

@Repository
public class LoginDAO {
//테이블은 loginTel
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public LoginDAO() throws ClassNotFoundException, SQLException{
		con = new TelInfoDBConn().getConnection();
	}
	public void getAllInfoClose() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	public void signUp(LoginVO vo) throws SQLException {
		String sql = "insert into loginTel values(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPw());
		pstmt.executeUpdate();
	}
	
	public int login(LoginVO vo) throws SQLException {
		int result = 0;
		String sql = "select pw from loginTel where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			String password = rs.getString(1);
			if(vo.getPw().equals(password)) result = 1;
		}
		return result;//1일때만 성공
	}
	
	public void signOut(LoginVO vo) throws SQLException {
		String sql = "delete loginTel where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.executeUpdate();
	}
}
