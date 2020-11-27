package ex41hellopkg;
//SWING 사용
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWB extends JFrame {

	private JPanel contentPane;
	
	JLabel questionLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWB frame = new HelloWB();
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
	public HelloWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNooler = new JButton("눌러");
		btnNooler.addActionListener(new ActionListener() { //Listener가 들어가면 이벤트 생성
			public void actionPerformed(ActionEvent e) { //이벤트가 가동되면 이 안의 문장이 실행
				//이벤트할 내용이 들어갈 자리
				questionLabel.setText("안녕 방가방가");
			}
		});
		btnNooler.setBackground(Color.PINK);
		btnNooler.setFont(new Font("궁서체", Font.BOLD, 22));
		btnNooler.setBounds(90, 93, 176, 89);
		contentPane.add(btnNooler);
		
		questionLabel = new JLabel("");
		questionLabel.setBackground(Color.DARK_GRAY);
		questionLabel.setFont(new Font("함초롬바탕", Font.BOLD, 15));
		questionLabel.setBounds(117, 24, 113, 59);
		contentPane.add(questionLabel);
	}
}
