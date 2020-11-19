package ex44wb;
/*
#### JTextarea에 스크롤바 생기게 하기

1) 먼저 JScrollpane을 올리고
2) 그 위에 JTextarea를 바로 올리면 viewport개념으로 크기가 일치한다
(이것이 잘 안되면 먼저 JTextarea를 만들고
왼쪽 Structure 창 JTextarea에 마우스 놓고 - 마오 - surround with -
scrollpane을 선택하면 조금 편리하다)
(소스참고) scrollPane.setViewportView(textArea);
3)실행 시에는 JTextare에 글자를 계속 넣어보고 한줄 길게 넣어보면 스크롤바가 both(가로줄 및 세로줄)로 생긴다
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextArea frame = new TextArea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 56, 198, 98);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("여기다 적는거 맞겠지...?\r\nㅇ\r\nㅇ\r\n\r\nㄴ\r\nㄴㅇㄹㄴㅁㅇㄻㄴㅇㄹ\r\nㄴㅁㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇ루ㅡㄴㅇㄹㅇㄴ믈ㄴ미ㅏ럼ㄴ이ㅏ럼ㄴ리ㅏㄴ머리ㅏㄴㅁ어리ㅏㅁㄴㅇ러ㅣ\r\nㅁㄴㅇㄹ낭런ㅇㄹ\r\nㅁㅇㄹㄴ어ㅏㄹ나일\r\nㅁㄹㄴ얼나ㅣㅇㄹ\r\nㅁㄹㅇ\r\nㅁㄴㄹ\r\nㅁ\r\nㄹㅇㄴㅁ\r\nㄻㄴㅇ\r\nㄹ\r\n");
		scrollPane.setViewportView(textArea);
	}

}
