package project;

import java.util.List;

import javax.swing.JOptionPane;

import project.util.DAO;

public class GameAction {
	
	public GameAction(int idx, int correctCount) {
		DAO dao = new DAO();
		List<QuestionVO> list = dao.getQuestionList();
		
		if(idx==list.size()) {
			JOptionPane.showMessageDialog(null, "끝!");
			ResultPage p = new ResultPage(correctCount);
			p.setVisible(true);
		} else {
			Game frame = new Game(list.get(idx), idx, correctCount);
			frame.setVisible(true);
		}
	}
	
}
