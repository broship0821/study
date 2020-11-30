package mainproject.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mainproject.nonsense.project.QuestionVO;
import mainproject.nonsense.project.util.JDBCUtil;

public class UserDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private final String LOGIN_SQL = "SELECT password FROM member WHERE id=?";
	private final String NAME_SQL = "SELECT name FROM member WHERE id=?";
	private final String ID_CHECK_SQL = "SELECT id FROM member";
	private final String SIGN_UP_SQL = "INSERT INTO member VALUES(?, ?, ?)";
	
	
	//로그인 메소드
	public int login(String id, String password){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(LOGIN_SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(password.equals(rs.getString("password")))
						return 1; //로그인 성공
				else
					return -1; //비밀번호 틀림
			} else {
				return 0; //아이디 없음
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return -2; //db오류
	}
	
	//로그인 성공시 이름 확인
	public String getName(String id){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(NAME_SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString("name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return ""; //db오류
	}
	
	//이미 존재하는 아이디인지 확인
	public int checkID(String id){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(ID_CHECK_SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(id.equals(rs.getString("id")))
						return -1; //이미 존재하는 아이디
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return 1; //중복되는 아이디 없음
	}

	
	//회원가입 메소드
	public int signUp(UserVO vo){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(SIGN_UP_SQL);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.executeUpdate();
			return 1; //성공
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return -1; //db오류
	}
	
	
}
