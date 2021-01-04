package ex08project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientMain extends JFrame {

	private JPanel contentPane;
	private JTextField ip;
	private JTextField port;
	private JTextField nickname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMain frame = new ClientMain();
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
	public ClientMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연결할 ip 주소 입력:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(14, 169, 209, 39);
		contentPane.add(lblNewLabel);
		
		ip = new JTextField();
		ip.setBounds(242, 169, 226, 39);
		contentPane.add(ip);
		ip.setColumns(10);
		
		JLabel lblPort = new JLabel("연결할 port 입력:");
		lblPort.setFont(new Font("굴림", Font.BOLD, 22));
		lblPort.setBounds(14, 247, 209, 39);
		contentPane.add(lblPort);
		
		JLabel label_1 = new JLabel("사용할 닉네임 입력:");
		label_1.setFont(new Font("굴림", Font.BOLD, 22));
		label_1.setBounds(14, 337, 209, 39);
		contentPane.add(label_1);
		
		port = new JTextField();
		port.setColumns(10);
		port.setBounds(242, 247, 226, 39);
		contentPane.add(port);
		
		nickname = new JTextField();
		nickname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					connect();
			}
		});
		nickname.setColumns(10);
		nickname.setBounds(242, 337, 226, 39);
		contentPane.add(nickname);
		
		JButton btnNewButton = new JButton("입장하기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				connect();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton.setBounds(119, 429, 245, 57);
		contentPane.add(btnNewButton);
	}
	
	public void connect() {
		try {
			Socket s = new Socket(ip.getText(), Integer.parseInt(port.getText()));
			
			DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s.getInputStream());
			outputStream.writeUTF("##" + nickname.getText());
			
			new Client(outputStream, inputStream, nickname.getText());
			setVisible(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
