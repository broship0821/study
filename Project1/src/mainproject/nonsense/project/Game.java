package mainproject.nonsense.project;

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
import java.awt.SystemColor;
import javax.swing.JLayeredPane;

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
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//버튼 배열 섞기
		randomButtons(buttons);
		
		//문제 들어갈 라벨
		JLabel questionLabel = new JLabel(question);
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setFont(new Font("휴먼편지체", Font.BOLD, 55));
		questionLabel.setForeground(Color.BLACK);
		questionLabel.setBackground(Color.WHITE);
		questionLabel.setBounds(0, 33, 732, 81);
		contentPane.add(questionLabel);
		//타이머 들어갈 라벨
		JLabel timerLabel = new JLabel("시작!");
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		timerLabel.setBounds(0, 112, 732, 57);
		contentPane.add(timerLabel);
		//타이머
		i = 30;//타이머 초기화
		startTimer(timerLabel, rightAnswer, idx, correctCount);
		
		//여기서부터 글자 버튼
		JButton button00 = new JButton(buttons[0]);
		button00.setBackground(new Color(210, 180, 140));
		button00.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button00);
				check(rightAnswer, idx, correctCount);
			}
		});
		button00.setBounds(133, 181, 90, 90);
		contentPane.add(button00);
		
		JButton button01 = new JButton(buttons[1]);
		button01.setBackground(new Color(210, 180, 140));
		button01.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button01);
				check(rightAnswer, idx, correctCount);
			}
		});
		button01.setBounds(250, 181, 90, 90);
		contentPane.add(button01);
		
		JButton button02 = new JButton(buttons[2]);
		button02.setBackground(new Color(210, 180, 140));
		button02.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button02);
				check(rightAnswer, idx, correctCount);
			}
		});
		button02.setBounds(366, 181, 90, 90);
		contentPane.add(button02);
		
		JButton button03 = new JButton(buttons[3]);
		button03.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button03.setBackground(new Color(210, 180, 140));
		button03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button03);
				check(rightAnswer, idx, correctCount);
			}
		});
		button03.setBounds(484, 181, 90, 90);
		contentPane.add(button03);
		
		JButton button04 = new JButton(buttons[4]);
		button04.setBackground(new Color(210, 180, 140));
		button04.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button04);
				check(rightAnswer, idx, correctCount);
			}
		});
		button04.setBounds(133, 283, 90, 90);
		contentPane.add(button04);
		
		JButton button05 = new JButton(buttons[5]);
		button05.setBackground(new Color(210, 180, 140));
		button05.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button05);
				check(rightAnswer, idx, correctCount);
			}
		});
		button05.setBounds(250, 283, 90, 90);
		contentPane.add(button05);
		
		JButton button06 = new JButton(buttons[6]);
		button06.setBackground(new Color(210, 180, 140));
		button06.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button06);
				check(rightAnswer, idx, correctCount);
			}
		});
		button06.setBounds(366, 283, 90, 90);
		contentPane.add(button06);
		
		JButton button07 = new JButton(buttons[7]);
		button07.setBackground(new Color(210, 180, 140));
		button07.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button07);
				check(rightAnswer, idx, correctCount);
			}
		});
		button07.setBounds(484, 283, 90, 90);
		contentPane.add(button07);
		
		JButton button08 = new JButton(buttons[8]);
		button08.setBackground(new Color(210, 180, 140));
		button08.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button08);
				check(rightAnswer, idx, correctCount);
			}
		});
		button08.setBounds(133, 385, 90, 90);
		contentPane.add(button08);
		
		JButton button09 = new JButton(buttons[9]);
		button09.setBackground(new Color(210, 180, 140));
		button09.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button09);
				check(rightAnswer, idx, correctCount);
			}
		});
		button09.setBounds(250, 385, 90, 90);
		contentPane.add(button09);
		
		JButton button10 = new JButton(buttons[10]);
		button10.setBackground(new Color(210, 180, 140));
		button10.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button10);
				check(rightAnswer, idx, correctCount);
			}
		});
		button10.setBounds(366, 385, 90, 90);
		contentPane.add(button10);
		
		JButton button11 = new JButton(buttons[11]);
		button11.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		button11.setBackground(new Color(210, 180, 140));
		button11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				insertString(button11);
				check(rightAnswer, idx, correctCount);
			}
		});
		button11.setBounds(484, 385, 90, 90);
		contentPane.add(button11);
		//여기까지 글자 버튼
		
		//버튼 누를때 마다 들어가는 자리
		answer = new JLabel(answerText.toString());
		answer.setBackground(SystemColor.info);
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("휴먼편지체", Font.BOLD, 45));
		answer.setBounds(133, 506, 445, 81);
		contentPane.add(answer);
		
		//한글자 지우기 버튼
		JButton deleteButton = new JButton("지우기");
		deleteButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		deleteButton.setBackground(SystemColor.info);
		deleteButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(answerText.length()!=0) {
					answerText.deleteCharAt(answerText.length()-1);
					answer.setText(answerText.toString());
				}
			}
		});
		deleteButton.setBounds(133, 599, 207, 50);
		contentPane.add(deleteButton);
		//전체 지우기 버튼
		JButton deleteAllButton = new JButton("전체 지우기");
		deleteAllButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		deleteAllButton.setBackground(SystemColor.info);
		deleteAllButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerText.delete(0, answerText.length());
				answer.setText(answerText.toString());
			}
		});
		deleteAllButton.setBounds(366, 599, 208, 50);
		contentPane.add(deleteAllButton);
		
		JLabel lblNewLabel = new JLabel((idx+1) + "/10");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblNewLabel.setBounds(665, 663, 67, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("메인으로");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				setVisible(false);
				dispose();
				Main frame = new Main();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 676, 105, 27);
		contentPane.add(btnNewButton);
		
	}
	
	//메소드들------------------------------------
	
	//버튼 랜덤으로 출력되는 메소드
	private void randomButtons(String[] buttons) {
		Arrays.sort(buttons, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (int)(Math.random()*2)-1;
			}
		});
	}
	//타이머 시작 메소드
	private void startTimer(JLabel timerLabel, String rightAnswer, int idx, int correctCount) {
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
	private void insertString(JButton button) {
		answerText.append(button.getText());
		answer.setText(answerText.toString());
	}
	//쓴 답을 정답과 확인하는 메소드
	private void check(String rightAnswer, int idx, int correctCount) {
		if(answer.getText().equals(rightAnswer)) {
			timer.stop();
			JOptionPane.showOptionDialog(null, String.format("정답입니다!\n정답: %s", rightAnswer), 
					"정답!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, box, box[0]);
			new GameAction(idx+1, correctCount+1);//정답일때 정답+1
			setVisible(false);
			dispose();
		}
	}
}
