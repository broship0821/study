package mainproject.nonsense.project;

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
import java.awt.SystemColor;

public class ResultPage extends JFrame {

	private JPanel contentPane;
	
	public ResultPage(int correctCount) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel recordLabel = new JLabel(correctCount*10 + " 점!");
		recordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		recordLabel.setFont(new Font("휴먼편지체", Font.BOLD, 50));
		recordLabel.setBounds(0, 426, 732, 98);
		contentPane.add(recordLabel);
		
		//정답 개수에 따라 등급 나누기, 나중에 사진도 결과에 따라 바뀌게 하기
		String grade = "";
		String img = "";
		switch(correctCount) {
		case 10:
			grade = "당신은 진정한 아재왕!";
			img = "/img/no1.jpg";
			break;
		case 9: case 8: case 7:
			grade = "훌륭합니다!";
			img = "/img/no2.jpg";
			break;
		case 6: case 5: case 4:
			grade = "좀 하시는군요!";
			img = "/img/no3.jpg";
			break;
		case 3: case 2: case 1:
			grade = "아쉽군요!";
			img = "/img/no4.jpg";
			break;
		case 0:
			grade = "좀 더 연습하고 오세요!";
			img = "/img/no5.jpg";
			break;
		}
		JLabel gradeLabel = new JLabel(grade);
		gradeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gradeLabel.setFont(new Font("휴먼편지체", Font.BOLD, 50));
		gradeLabel.setBounds(0, 51, 732, 98);
		contentPane.add(gradeLabel);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setIcon(new ImageIcon(ResultPage.class.getResource(img)));
		imgLabel.setBounds(208, 146, 312, 284);
		contentPane.add(imgLabel);
		
		JButton backToMainButton = new JButton("첫화면으로");
		backToMainButton.setBackground(SystemColor.info);
		backToMainButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				dispose();
				Main frame = new Main();
				frame.setVisible(true);
			}
		});
		backToMainButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		backToMainButton.setBounds(200, 573, 320, 71);
		contentPane.add(backToMainButton);
	}
}
