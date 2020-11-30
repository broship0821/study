package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project.util.DAO;

import javax.swing.JPasswordField;

public class IdCheckPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	
	public IdCheckPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(98, 84, 91, 30);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("비밀번호");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(98, 121, 91, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("로그인이 필요합니다");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBounds(0, 42, 432, 30);
		contentPane.add(label_1);
		
		JTextField idField = new JTextField();
		idField.setBounds(203, 89, 116, 24);
		contentPane.add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 126, 116, 24);
		contentPane.add(passwordField);
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DAO dao = new DAO();
				int result = dao.checkAdminUser(idField.getText(), passwordField.getText());
				switch(result) {
				case 1: //로그인 성공
					new AdminPage1().setVisible(true);
					dispose();
					setVisible(false);
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "해당 아이디는 없는 아이디입니다."); break;
				case -1:
					JOptionPane.showMessageDialog(null, "잘못된 비밀번호입니다."); break;
				case -2:
					JOptionPane.showMessageDialog(null, "잘못된 입력입니다."); break;
				}
			}
		});
		btnNewButton.setBounds(151, 178, 105, 27);
		contentPane.add(btnNewButton);
		
		
	}
}
