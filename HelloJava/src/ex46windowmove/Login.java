package ex46windowmove;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtID; //이거 팀원들이랑 맞춰줘야됨
	private JTextField txtPW;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(44, 62, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(44, 102, 82, 18);
		contentPane.add(lblNewLabel_1);
		
		txtID = new JTextField();
		txtID.setBounds(140, 59, 116, 24);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtPW = new JTextField();
		txtPW.setBounds(140, 99, 116, 24);
		contentPane.add(txtPW);
		txtPW.setColumns(10);
		
		JButton btnNewButton = new JButton("인자 갖고 가자");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); //지금창 해제, 프레임을 닫는 것(메모리에서 해제)
				setVisible(false); //지금창 안보이게
				String id = txtID.getText();
				String pw = txtPW.getText();
				new Bb(id,pw).setVisible(true);
				//그 Bb.java로 가는거랑 똑같은데 인자있는 생성자로 만들어서 가면
				//인자 갖고가는 효과 얻을 수 있음, 지금 없어서 오류남
			}
		});
		btnNewButton.setBounds(44, 154, 239, 48);
		contentPane.add(btnNewButton);
	}

}
