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
import javax.swing.SwingConstants;

public class Game extends JFrame {

	//타이머 관련
	private static int i; //타이머 표시
	private Timer timer;
	//정답체크 관련
	private JLabel answer;
	private StringBuffer answerText = new StringBuffer("");
	private String[] box = {"다음문제"};

	//생성되고 시작하는일-----------------------------------------
	public Game(QuestionVO q, int idx, int correctCount) {
		//인자로 받는 값들
		String question = q.getQuestion();
		String[] buttons = q.getButtons();
		String rightAnswer = q.getRightAnswer();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//버튼 배열 섞기
		randomButtons(buttons);
		
		//문제 들어갈 라벨
		JLabel questionLabel = new JLabel(question);
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		questionLabel.setForeground(Color.BLACK);
		questionLabel.setBackground(Color.BLACK);
		questionLabel.setBounds(0, 51, 732, 63);
		contentPane.add(questionLabel);
		//타이머 들어갈 라벨
		JLabel timerLabel = new JLabel("시작!");
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		timerLabel.setBounds(0, 112, 732, 50);
		contentPane.add(timerLabel);
		//타이머
		i = 10;//타이머 초기화
		startTimer(timerLabel, rightAnswer, idx, correctCount);
		
		//여기서부터 글자 버튼
		JButton button00 = new JButton(buttons[0]);
		button00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button00);
				check(rightAnswer, idx, correctCount);
			}
		});
		button00.setBounds(112, 217, 70, 50);
		contentPane.add(button00);
		
		JButton button01 = new JButton(buttons[1]);
		button01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button01);
				check(rightAnswer, idx, correctCount);
			}
		});
		button01.setBounds(207, 217, 70, 50);
		contentPane.add(button01);
		
		JButton button02 = new JButton(buttons[2]);
		button02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button02);
				check(rightAnswer, idx, correctCount);
			}
		});
		button02.setBounds(304, 217, 70, 50);
		contentPane.add(button02);
		
		JButton button03 = new JButton(buttons[3]);
		button03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button03);
				check(rightAnswer, idx, correctCount);
			}
		});
		button03.setBounds(406, 217, 70, 50);
		contentPane.add(button03);
		
		JButton button04 = new JButton(buttons[4]);
		button04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button04);
				check(rightAnswer, idx, correctCount);
			}
		});
		button04.setBounds(112, 287, 70, 50);
		contentPane.add(button04);
		
		JButton button05 = new JButton(buttons[5]);
		button05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button05);
				check(rightAnswer, idx, correctCount);
			}
		});
		button05.setBounds(207, 287, 70, 50);
		contentPane.add(button05);
		
		JButton button06 = new JButton(buttons[6]);
		button06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button06);
				check(rightAnswer, idx, correctCount);
			}
		});
		button06.setBounds(304, 287, 70, 50);
		contentPane.add(button06);
		
		JButton button07 = new JButton(buttons[7]);
		button07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button07);
				check(rightAnswer, idx, correctCount);
			}
		});
		button07.setBounds(406, 287, 70, 50);
		contentPane.add(button07);
		
		JButton button08 = new JButton(buttons[8]);
		button08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button08);
				check(rightAnswer, idx, correctCount);
			}
		});
		button08.setBounds(112, 357, 70, 50);
		contentPane.add(button08);
		
		JButton button09 = new JButton(buttons[9]);
		button09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button09);
				check(rightAnswer, idx, correctCount);
			}
		});
		button09.setBounds(207, 357, 70, 50);
		contentPane.add(button09);
		
		JButton button10 = new JButton(buttons[10]);
		button10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button10);
				check(rightAnswer, idx, correctCount);
			}
		});
		button10.setBounds(304, 357, 70, 50);
		contentPane.add(button10);
		
		JButton button11 = new JButton(buttons[11]);
		button11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button11);
				check(rightAnswer, idx, correctCount);
			}
		});
		button11.setBounds(406, 357, 70, 50);
		contentPane.add(button11);
		//여기까지 글자 버튼
		
		//버튼 누를때 마다 들어가는 자리
		answer = new JLabel(answerText.toString());
		answer.setFont(new Font("굴림", Font.PLAIN, 30));
		answer.setBounds(139, 463, 225, 81);
		contentPane.add(answer);
		//엔터버튼
//		JButton button00_1 = new JButton("엔터");
//		button00_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				timer.stop(); //이 버튼 클릭 되면 타이머 멈춤
//				if(answer.getText().equals(rightAnswer)) {
//					JOptionPane.showOptionDialog(answer, String.format("정답입니다!\n정답: %s", rightAnswer), "정답!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
//					GameAction action = new GameAction(idx+1, correctCount+1);//정답일때 정답+1
//				} else {
//					JOptionPane.showOptionDialog(answer, String.format("오답입니다.\n정답: %s", rightAnswer), "땡!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
//					GameAction action = new GameAction(idx+1, correctCount);
//				}
//				setVisible(false);
//				dispose();
//			}
//		});
//		button00_1.setBounds(371, 513, 105, 27);
//		contentPane.add(button00_1);
		
		//한글자 지우기 버튼
		JButton deleteButton = new JButton("지우기");
		deleteButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(answerText.length()!=0) {
					answerText.deleteCharAt(answerText.length()-1);
					answer.setText(answerText.toString());
				}
			}
		});
		deleteButton.setBounds(371, 474, 119, 27);
		contentPane.add(deleteButton);
		//전체 지우기 버튼
		JButton deleteAllButton = new JButton("전체 지우기");
		deleteAllButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.delete(0, answerText.length());
				answer.setText(answerText.toString());
			}
		});
		deleteAllButton.setBounds(371, 524, 119, 27);
		contentPane.add(deleteAllButton);
		
	}
	
	//메소드들------------------------------------
	
	//버튼 랜덤으로 출력되는 메소드
	public void randomButtons(String[] buttons) {
		Arrays.sort(buttons, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (int)(Math.random()*2)-1;
			}
		});
	}
	//타이머 시작 메소드
	public void startTimer(JLabel timerLabel, String rightAnswer, int idx, int correctCount) {
		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timerLabel.setText(Integer.toString(i--));
				if(i<0) {
					JOptionPane.showOptionDialog(null, String.format("시간 초과입니다.\n정답: %s", rightAnswer), 
							"땡!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
					setVisible(false);
					dispose();
					//여기에다도 새로운 문제
					new GameAction(idx+1, correctCount);
					timer.stop();
				}
				
			}
		});
        timer.setInitialDelay(2000);
        timer.start();
	}
	//버튼 클릭할때마다 글자 추가 되는 메소드
	public void insertString(JButton button) {
		answerText.append(button.getText());
		answer.setText(answerText.toString());
	}
	//쓴 답을 정답과 확인하는 메소드
	public void check(String rightAnswer, int idx, int correctCount) {
		if(answer.getText().equals(rightAnswer)) {
			timer.stop();
			JOptionPane.showOptionDialog(answer, String.format("정답입니다!\n정답: %s", rightAnswer), 
					"정답!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
			new GameAction(idx+1, correctCount+1);//정답일때 정답+1
			setVisible(false);
			dispose();
		}
	}
}
