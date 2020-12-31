package ex09test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Client extends JFrame implements Runnable, ActionListener {

	private JPanel contentPane;
	private DataOutputStream outputStream;
	private DataInputStream inputStream;
	private String nickname;
	
	JLabel label = new JLabel("*** 채팅창 ***");
	JTextArea area = new JTextArea();
	JTextField field = new JTextField();
	JScrollPane scroll = new JScrollPane(area);
	
	Toolkit tk = Toolkit.getDefaultToolkit();

	public Client(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		label.setFont(new Font("굴림", Font.BOLD, 22));
		getContentPane().add("North", label);
		
		area.setBackground(Color.yellow);
		area.setForeground(Color.BLUE);
		area.setFont(new Font("굴림", Font.BOLD, 22));
		area.setEditable(false); 
		getContentPane().add("Center", scroll);
		
		field.setBackground(Color.white);
		field.setForeground(Color.black);
		field.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add("South", field);
		field.addActionListener(this);//이벤트 등록
		
		setSize(500, 800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				setVisible(false);
			}
		});
		
		Thread th = new Thread(this);
		th.start();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == field) {
			try {
				outputStream.writeUTF(nickname + ">>> " + field.getText()); 
			} catch (IOException e2) {
//				e2.printStackTrace();
			}
			field.setText("");
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String strServer = inputStream.readUTF();
				if(strServer==null) {
					area.append("\n"+"종료");
					return;
				}
				area.append("\n" + strServer);
				
				
				int endText = area.getText().length();
				area.setCaretPosition(endText);
				
				tk.beep();
			}
		} catch (Exception e3) {
			area.append("\n" + e3);
		}
		
	}

}
