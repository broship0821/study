package ex06multiuser2;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements Runnable, ActionListener {
	//넘어오는 io스트림이랑 닉네임을 받을 필드들
	DataOutputStream outputStream;
	DataInputStream inputStream;
	String nickname;
	
	//gui
	JLabel label1 = new JLabel("*** 채팅창 ***");
	JTextArea area1 = new JTextArea();
	JTextField field1 = new JTextField();
	JScrollPane scroll = new JScrollPane(area1);
	
	public ClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;
		
		setLayout(new BorderLayout());
		// North, South, West, East, Center
		
		//라벨
		label1.setFont(new Font("굴림", Font.BOLD, 22));
		add("North", label1);
		
		//채팅 문자열이 출력되는 곳
		area1.setBackground(Color.yellow);
		area1.setForeground(Color.BLUE);
		area1.setFont(new Font("굴림", Font.BOLD, 22));
		area1.setEditable(false); //편집 못하게 하기, 한번 올라간 텍스트는 수정할 수 없음
		add("Center", scroll); //scroll이랑 area1이랑 연결되어 있음
		
		//채팅 치는곳
		field1.setBackground(Color.white);
		field1.setForeground(Color.black);
		field1.setFont(new Font("굴림", Font.BOLD, 25));
		add("South", field1);
		field1.addActionListener(this);//이벤트 등록
		
		setSize(800, 800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);//이걸 해주어야 퇴장이 됨
				setVisible(false);
			}
		});
		
		Thread th = new Thread(this); //리시브 쓰레드, 메인 쓰레드는 보내는 용도
		th.start();
		
	}//생성자 end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == field1) {//field1에서 이벤트가 발생하면(채팅을 치면)
			try {
				outputStream.writeUTF(nickname + ">>> " + field1.getText()); //닉네임과 방금 친 메세지를 전송
			} catch (IOException e2) {
//				e2.printStackTrace();
			}
			field1.setText(""); //칸 비우기
		}
	}
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	//채팅 올때마다 소리 들리게 하는 것
	
	@Override
	public void run() {//출력용 쓰레드
		try {
			while(true) {
				String strServer = inputStream.readUTF();//서버로부터
				if(strServer==null) {
					area1.append("\n"+"종료");
					return;
				}
				area1.append("\n" + strServer); //서버가 전달해준 문자열 채팅창(area1)에 추가
				
				//커서를 맨 뒤로 나오게 하기
				int endText = area1.getText().length();
				area1.setCaretPosition(endText); //커서를 맨 뒤로(setCaretPosition: 커서 위치 변경)
				
				tk.beep(); //채팅 전달될 때마다 소리 울림
			}
		} catch (Exception e3) {
			area1.append("\n" + e3);
		}
		
	}
	
}
