package project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GameAction {
	
	public GameAction(int idx) {
		ArrayList<QuestionVO> list = new ArrayList<>();
		
		String[] buttons0 = {"딸", "기", "시", "럽", "희", "릭", "쇼", "마", "깡", "콩", "교", "그"};
		QuestionVO q0 = new QuestionVO("딸기가 회사에서 잘리면?", buttons0, "딸기시럽");
		list.add(q0);
		
		String[] buttons1 = {"탄", "소", "장", "칙", "굼", "튼", "펜", "털", "능", "표", "멩", "룸"};
		QuestionVO q1 = new QuestionVO("소가 불에 타면?", buttons1, "탄소");
		list.add(q1);
		
		String[] buttons2 = {"백", "조", "품", "릴", "봉", "띠", "음", "붓", "유", "텁", "퇴", "잡"};
		QuestionVO q2 = new QuestionVO("세상에서 가장 비싼 새는?", buttons2, "백조");
		list.add(q2);
		
		if(idx==list.size()) {
			JOptionPane.showMessageDialog(null, "끝!");
			System.exit(0);
		} else {
			Game frame = new Game(list.get(idx), idx);
			frame.setVisible(true);
		}
	}
	
}
