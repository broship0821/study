package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class Game extends JFrame {

	
	private JPanel contentPane;
	static int i;
	Timer timer; 
	JLabel lblNewLabel_1;
	JLabel answer;
	StringBuffer answerText = new StringBuffer("");
	String[] box = {"다음문제"};

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		//창 띄우고 실행하는 것들
////		Game frame = new Game();
////		frame.setVisible(true);
////		//메인창에서만 실행되게끔함
//	}

	/**
	 * Create the frame.
	 */
	public Game(QuestionVO q, int idx) {
		//인자로 받는 값들
		String question = q.getQuestion();
		String[] buttons = q.getButtons();
		String rightAnswer = q.getRightAnswer();
		
		//버튼 배열 섞기
		Arrays.sort(buttons, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (int)(Math.random()*2)-1;
			}
		});
		
		//타이머 초기화
		i = 10;
		timer = new javax.swing.Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(Integer.toString(i--));
				if(i<0) {
					int selected = JOptionPane.showOptionDialog(null, String.format("시간 초과입니다.\n정답: %s", rightAnswer), "땡!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
					//selected : 0반환됨
					dispose();
					//여기에다도 새로운 문제
					GameAction action = new GameAction(idx+1);
//					System.exit(0);
				}
				
			}
		});
        timer.setInitialDelay(2000);
        timer.start();
        
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(question);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(183, 70, 363, 44);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("시작!");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(207, 112, 187, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton(buttons[0]);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(btnNewButton.getText());
				answer.setText(answerText.toString());
			}
		});
		btnNewButton.setBounds(112, 217, 70, 50);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(buttons[1]);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button.getText());
				answer.setText(answerText.toString());
			}
		});
		button.setBounds(207, 217, 70, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton(buttons[2]);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_1.getText());
				answer.setText(answerText.toString());
			}
		});
		button_1.setBounds(304, 217, 70, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton(buttons[3]);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_2.getText());
				answer.setText(answerText.toString());
			}
		});
		button_2.setBounds(406, 217, 70, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(buttons[4]);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_3.getText());
				answer.setText(answerText.toString());
			}
		});
		button_3.setBounds(112, 287, 70, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton(buttons[5]);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_4.getText());
				answer.setText(answerText.toString());
			}
		});
		button_4.setBounds(207, 287, 70, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton(buttons[6]);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_5.getText());
				answer.setText(answerText.toString());
			}
		});
		button_5.setBounds(304, 287, 70, 50);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton(buttons[7]);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_6.getText());
				answer.setText(answerText.toString());
			}
		});
		button_6.setBounds(406, 287, 70, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton(buttons[8]);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_7.getText());
				answer.setText(answerText.toString());
			}
		});
		button_7.setBounds(112, 357, 70, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton(buttons[9]);
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_8.getText());
				answer.setText(answerText.toString());
			}
		});
		button_8.setBounds(207, 357, 70, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton(buttons[10]);
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_9.getText());
				answer.setText(answerText.toString());
			}
		});
		button_9.setBounds(304, 357, 70, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton(buttons[11]);
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.append(button_10.getText());
				answer.setText(answerText.toString());
			}
		});
		button_10.setBounds(406, 357, 70, 50);
		contentPane.add(button_10);
		
		answer = new JLabel(answerText.toString());
		answer.setFont(new Font("굴림", Font.PLAIN, 30));
		answer.setBounds(139, 463, 225, 81);
		contentPane.add(answer);
		
		JButton btnNewButton_1 = new JButton("엔터");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				timer.stop(); //이 버튼 클릭 되면 타이머 멈춤
				if(answer.getText().equals(rightAnswer)) {
					JOptionPane.showOptionDialog(null, String.format("정답입니다!\n정답: %s", rightAnswer), "정답!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
					
				} else {
					JOptionPane.showOptionDialog(null, String.format("오답입니다.\n정답: %s", rightAnswer), "땡!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
					
				}
				//여기에 새로운 문제 생성되야됨
				GameAction action = new GameAction(idx+1);
				dispose();
//				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(371, 513, 105, 27);
		contentPane.add(btnNewButton_1);
		
		JButton button_11 = new JButton("지우기");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.delete(0, answerText.length());
				answer.setText(answerText.toString());
			}
		});
		button_11.setBounds(371, 474, 105, 27);
		contentPane.add(button_11);
		
		
	}
}
