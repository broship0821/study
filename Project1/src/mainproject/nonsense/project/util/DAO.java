package mainproject.nonsense.project.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mainproject.nonsense.project.QuestionVO;

public class DAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private final String QUESTION_LIST = "SELECT * FROM questions ORDER BY questionNum";
	private final String QUESTION_UPDATE = "UPDATE questions SET question=?, rightAnswer=?, "
			+ "button00=?, button01=?, button02=?, button03=?, button04=?, button05=?, button06=?, "
			+ "button07=?, button08=?, button09=?, button10=?, button11=? WHERE questionNum=?";
	
	private final String ADMIN_CHECK = "SELECT pw FROM admin_user WHERE id=?";
	
	public List<QuestionVO> getQuestionList(){
		List<QuestionVO> list = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(QUESTION_LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				QuestionVO q = new QuestionVO();
				String[] buttons = {rs.getString("button00"),rs.getString("button01"),rs.getString("button02"),
						rs.getString("button03"),rs.getString("button04"),rs.getString("button05"),
						rs.getString("button06"),rs.getString("button07"),rs.getString("button08"),
						rs.getString("button09"),rs.getString("button10"),rs.getString("button11")};
				q.setQuestion(rs.getString("question"));
				q.setButtons(buttons);
				q.setRightAnswer(rs.getString("rightAnswer"));
				list.add(q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}
	
	public int updateQuestion(int num, QuestionVO vo){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(QUESTION_UPDATE);
			pstmt.setString(1, vo.getQuestion());
			pstmt.setString(2, vo.getRightAnswer());
			pstmt.setString(3, vo.getButtons()[0]);
			pstmt.setString(4, vo.getButtons()[1]);
			pstmt.setString(5, vo.getButtons()[2]);
			pstmt.setString(6, vo.getButtons()[3]);
			pstmt.setString(7, vo.getButtons()[4]);
			pstmt.setString(8, vo.getButtons()[5]);
			pstmt.setString(9, vo.getButtons()[6]);
			pstmt.setString(10, vo.getButtons()[7]);
			pstmt.setString(11, vo.getButtons()[8]);
			pstmt.setString(12, vo.getButtons()[9]);
			pstmt.setString(13, vo.getButtons()[10]);
			pstmt.setString(14, vo.getButtons()[11]);
			pstmt.setInt(15, num);
			pstmt.executeUpdate();
			return 1; //성공
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		return -1; //db오류
	}
	
	public int checkAdminUser(String id, String pw){
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(ADMIN_CHECK);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(pw.equals(rs.getString("pw")))
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
		return -2; //db오류, 비밀번호 안적음
	}
	
}
