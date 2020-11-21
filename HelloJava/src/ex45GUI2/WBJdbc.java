package ex45GUI2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WBJdbc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBJdbc frame = new WBJdbc();
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
	public WBJdbc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("검색할이름");
		lblNewLabel.setBounds(14, 12, 89, 18);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER ) { ///enter 이면
		      		try {
						kaja();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	}
			}
		});
		textField.setBounds(131, 9, 116, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {//만약 이버튼이 눌러졌으면
					try {
						kaja();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e2) {
						e2.printStackTrace();
					}
				}
			}

			
			public void keyPressed(KeyEvent e1) throws ClassNotFoundException, SQLException{//3개 추가(Key event)    	
		    	if( e1.getKeyCode() == KeyEvent.VK_ENTER ) { ///enter 이면
		      		kaja();
		    	}
		    }
		    public void keyReleased(KeyEvent e1) {//3개 추가(Key event)
		    	 
		    }
		    public void keyTyped(KeyEvent e1) {  //3개 추가(Key event)
		    	 
		    }
		});
		btnNewButton.setBounds(313, 8, 105, 27);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 42, 408, 351);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(14, 419, 404, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

	
	protected void kaja() throws ClassNotFoundException, SQLException {
		textArea.setText(""); //내용 지우기
		textField_1.setText(""); //내용 지우기
		Connection con = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		textField_1.setText("db에 접속되었습니다");
		
		String sql = "SELECT first_name, last_name, phone_number"
				+ " from employees"
				+ " where first_name = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, textField.getText());
		ResultSet rs = pstmt.executeQuery();
		
		String str1 = String.format("%20s\t%25s\n\n", "[이  름]", "[전 화 번 호]");
		if(rs.next()) {
			do {
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String phone = rs.getString(3);
				//str1 += fname+ " " + lname + "\t" +phone+"\n";
				str1 += String.format("%-20s%-20s%-20s\n",fname,lname,phone);
				
			} while(rs.next());
			textArea.setText(str1);
		} else
			textArea.setText("그런 이름은 없습니다.");
		rs.close();
		pstmt.close();
		con.close();
		
	}
		
	
}
