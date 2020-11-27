package ex47prj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setForeground(Color.DARK_GRAY);
		layeredPane.setBackground(Color.GRAY);
		layeredPane.setBounds(293, 173, 399, 227);
		contentPane.add(layeredPane);
		
		JButton button00 = new JButton("로그인");
		button00.setBounds(97, 159, 156, 26);
		layeredPane.add(button00);
		
		JLabel questionLabel = new JLabel("Simple 게시판");
		questionLabel.setBounds(77, 26, 266, 55);
		layeredPane.add(questionLabel);
		questionLabel.setFont(new Font("굴림", Font.BOLD, 25));
		
		JLabel timerLabel = new JLabel("닉네임: ");
		timerLabel.setBounds(77, 81, 55, 26);
		layeredPane.add(timerLabel);
		
		JLabel questionLabel_2 = new JLabel("비밀번호: ");
		questionLabel_2.setBounds(77, 114, 66, 18);
		layeredPane.add(questionLabel_2);
		
		textField = new JTextField();
		textField.setBounds(155, 82, 116, 24);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 111, 116, 24);
		layeredPane.add(passwordField);
	}
}
