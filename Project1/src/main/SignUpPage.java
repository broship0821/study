package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 169, 722, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(171, 242, 127, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("비밀번호");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(171, 299, 127, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("비밀번호 확인");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(171, 358, 127, 36);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("이름");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(171, 412, 127, 36);
		contentPane.add(label_2);
		
		JTextField idField = new JTextField();
		idField.setBounds(318, 244, 210, 36);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JTextField passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(318, 301, 210, 36);
		contentPane.add(passwordField);
		
		JTextField passwordField_2 = new JTextField();
		passwordField_2.setColumns(10);
		passwordField_2.setBounds(318, 360, 210, 36);
		contentPane.add(passwordField_2);
		
		JTextField nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(318, 414, 210, 36);
		contentPane.add(nameField);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserDAO dao = new UserDAO();
				int check = dao.checkID(idField.getText());
				if(check==-1) {
					JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다.");
				} else if(check==1) {//아이디 체크 완료
					//비밀번호랑 비밀번호확인 체크
					if(passwordField.getText().equals(passwordField_2.getText())) {
						//확인성공
						UserVO vo = new UserVO(idField.getText(), passwordField.getText(), nameField.getText());
						int lastCheck = dao.signUp(vo);
						if(lastCheck==1) { //회원가입 성공
							JOptionPane.showMessageDialog(null, "회원가입 성공!");
							new LoginPage().setVisible(true);
							dispose();
							setVisible(false);
						} else { //회원가입 실패
							JOptionPane.showMessageDialog(null, "빈칸 없이 입력해주세요!");
						}
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요!");
					}
				} 
			}
		});
		btnNewButton.setBounds(259, 488, 157, 36);
		contentPane.add(btnNewButton);
		
	}

}
