package project;

import java.util.List;

import javax.swing.JOptionPane;

import project.util.DAO;

public class GameAction {
	
	public GameAction(int idx, int correctCount) {
//		ArrayList<QuestionVO> list = new ArrayList<>();
//		//딱10문제만
//		String[] buttons0 = {"딸", "기", "시", "럽", "희", "릭", "쇼", "마", "깡", "콩", "교", "그"};
//		QuestionVO q0 = new QuestionVO("딸기가 회사에서 잘리면?", buttons0, "딸기시럽");
//		list.add(q0);
//		
//		String[] buttons1 = {"탄", "소", "장", "칙", "굼", "튼", "펜", "털", "능", "표", "멩", "룸"};
//		QuestionVO q1 = new QuestionVO("소가 불에 타면?", buttons1, "탄소");
//		list.add(q1);
//		
//		String[] buttons2 = {"백", "조", "품", "릴", "봉", "띠", "음", "붓", "유", "텁", "퇴", "잡"};
//		QuestionVO q2 = new QuestionVO("세상에서 가장 비싼 새는?", buttons2, "백조");
//		list.add(q2);
//		
//		String[] buttons3 = {"킹", "콩", "튜", "펑", "샛", "마", "갬", "건", "곰", "횡", "뱁", "반"};
//		QuestionVO q3 = new QuestionVO("왕이 넘어지면?", buttons3, "킹콩");
//		list.add(q3);
//		
//		String[] buttons4 = {"글", "로", "벌", "병", "회", "왱", "음", "좀", "행", "첨", "룩", "능"};
//		QuestionVO q4 = new QuestionVO("반성문을 영어로 하면?", buttons4, "글로벌");
//		list.add(q4);
//		
//		String[] buttons5 = {"언", "덕", "균", "똑", "칭", "왼", "퍼", "학", "뿌", "래", "박", "밀"};
//		QuestionVO q5 = new QuestionVO("오리가 얼면?", buttons5, "언덕");
//		list.add(q5);
//		
//		String[] buttons6 = {"카", "놀", "라", "유", "녀", "놀", "깽", "염", "택", "아", "왕", "첼"};
//		QuestionVO q6 = new QuestionVO("차를 발로 차면?", buttons6, "카놀라유");
//		list.add(q6);
//		
//		String[] buttons7 = {"궁", "시", "렁", "척", "영", "톤", "술", "멩", "벋", "닥", "꿈", "며"};
//		QuestionVO q7 = new QuestionVO("왕이 궁에 가기 싫을때 하는 말은?", buttons7, "궁시렁궁시렁");
//		list.add(q7);
		
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
