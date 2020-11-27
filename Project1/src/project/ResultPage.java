package project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultPage extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public ResultPage(int correctCount) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel recordLabel = new JLabel(correctCount*10 + " 점!");
		recordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		recordLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		recordLabel.setBounds(276, 173, 159, 98);
		contentPane.add(recordLabel);
		
		//정답 개수에 따라 등급 나누기, 나중에 사진도 결과에 따라 바뀌게 하기
		String grade = "";
		switch(correctCount) {
		case 10:
			grade = "다 맞았네요! 당신은 진정한 아재왕입니다!";
			break;
		case 9: case 8: case 7:
			grade = "축하합니다! 당신은 아재병장 입니다!";
			break;
		case 6: case 5: case 4:
			grade = "훌륭합니다! 당신은 아재상병 입니다!";
			break;
		case 3: case 2: case 1:
			grade = "좋습니다! 당신은 아재이등병 입니다!";
			break;
		case 0:
			grade = "0점! ㅠㅠ 좀더 분발하세요!";
			break;
		}
		JLabel gradeLabel = new JLabel(grade);
		gradeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gradeLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		gradeLabel.setBounds(0, 79, 732, 70);
		contentPane.add(gradeLabel);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setIcon(new ImageIcon(ResultPage.class.getResource("/img/iconmonstr-party-5-120.png")));
		imgLabel.setBounds(238, 283, 239, 177);
		contentPane.add(imgLabel);
		
		JButton backToMainButton = new JButton("메인으로");
		backToMainButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				dispose();
				Main frame = new Main();
				frame.setVisible(true);
			}
		});
		backToMainButton.setFont(new Font("굴림", Font.PLAIN, 25));
		backToMainButton.setBounds(293, 579, 153, 42);
		contentPane.add(backToMainButton);
	}
}
