package project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.QuestionVO;

public class DAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private final String QUESTION_LIST = "SELECT * FROM questions";
	
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
	
}
