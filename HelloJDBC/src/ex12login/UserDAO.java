package ex12login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private Connection conn;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public UserDAO() {
		conn = new ConnectionUtil().getConn();
	}
	
	public void getAllInfoClose() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
	}
	
	//아이디 체크
	public boolean checkId(String id) {
		String sql = "SELECT id FROM logintable WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return false;//중복된 아이디 있음
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("로그인 exception");
			return false;
		}
		return true; //중복된 아이디 없음
	}
	//회원가입
	public boolean sign_up(UserVO vo) {
		String sql = "INSERT INTO logintable VALUES(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert exception");
			return false;
		}
		return true;
	}
	//아이디 비번 체크
	public int check(String id, String pw) {
		String sql = "SELECT pw FROM logintable WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {//아이디 있음
				if(rs.getString("pw").equals(pw)) //비번같음
					return 1; //로그인 성공
				else 
					return 0; //비번틀림
			} else {
				return -1;//아이디 없음
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;// db오류
	}
	//회원정보 가져오기
	public UserVO getUserInfo(String id) {
		String sql = "SELECT name, tel FROM logintable WHERE id=?";
		UserVO vo = new UserVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	//회원탈퇴
	public boolean deleteUser(String id) {
		String sql = "DELETE FROM logintable WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert exception");
			return false;
		}
		return true;
	}
	
}
