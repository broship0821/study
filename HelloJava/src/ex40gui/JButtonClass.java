package ex40gui;

/*
 swing (4개의 pane) pane: 나무판
 JFrame
 		메뉴바
 	버튼, 글상자 -> component
 	(contentpane)
 
 jdk 1.5 이전에는 반드시 contentpane 사용
 이후 사용안하고 JFrame - 컴포넌트를 배치해도 됨
 (알아서 contentpane 인식)
 */

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonClass extends JFrame { //JButtonClass.java
	//창문은 기본으로 닫힘
//	int aa;
//	JButton jb1; //속성, 필드선언
	JButton jb1 = new JButton("사과"); //선언만 하는것이 아니라 생성까지 해버림
	JButton jb2 = new JButton("배");
	JButton jb6 = new JButton("감");
	JButton jb4 = new JButton("귤");
	JButton jb5 = new JButton("포도");
	JButton jb3 = new JButton("자두");
	
	public JButtonClass() {
		getContentPane().setBackground(Color.orange); //배경색
		getContentPane().setLayout(new FlowLayout()); //중앙정렬-가로로 배치
		getContentPane().add(jb1); //버튼 추가
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
	}

	public static void main(String[] args) {
		JButtonClass jbc1 = new JButtonClass(); //new 하면 제일 먼저 실행되는 것이 생성자
		
		jbc1.setTitle("버튼이야"); //객체.메소드()
		jbc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 jbc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 이것 안하면 x 버튼으로 창문을 닫아도 프레임은 종료되었지만
		 실행 프로그램은 아직 종료 전임
		 이걸 써주면 프레임 닫고 + 실행 프로그램 종료
		 */
		
		jbc1.setSize(300, 200); //가로 300 세로 200
		jbc1.setVisible(true); //시작하자마자 화면이 뜨게 하겠다
		
		/*
		 	WindowBuilder(swing)
		 	[windowBuilder란] <--> SceneBuilder(JavaFx)(.fxml)
		 	
		 	# UI를 편리하게 만들어 주는 TOOL
		 	# 디자인을 해주면 자바소스가 자동생성(gui의 swing이 중심)
		 		필요시 직접 입력 수정 가능하다
		 */

	}

}
