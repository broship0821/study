package ex08project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	ArrayList<ThreadServerClass> threadList = new ArrayList<>();
	Socket socket;
	DataOutputStream outputStream;
	
	public Server(int port) throws IOException  {
		Socket s = null;
		ServerSocket ss = new ServerSocket(port);
		System.out.println("서버 가동");
		
		while(true) {
			s = ss.accept();
			System.out.println("접속주소: "+s.getInetAddress()+", 접속포트: "+s.getPort());
			ThreadServerClass tServer = new ThreadServerClass(s);
			tServer.start();
			
			threadList.add(tServer);
			System.out.println("접속자 수: " + threadList.size());
		}
	}
	
	public void sendChat(String chat) throws IOException {
		for(int i=0;i<threadList.size();i++) {
			threadList.get(i).outputStream.writeUTF(chat);
		}
	}
	
	class ThreadServerClass extends Thread { //내부 클래스
		Socket socket;
		DataInputStream inputStream;
		DataOutputStream outputStream;
		
		public ThreadServerClass(Socket s) throws IOException {
			socket = s;
			inputStream = new DataInputStream(s.getInputStream());
			outputStream = new DataOutputStream(s.getOutputStream());
		}
		
		@Override
		public void run() {
			String nickname = "";
			try {
				if(inputStream != null) {
					nickname = inputStream.readUTF();
					sendChat(nickname + " 님이 채팅방에 입장하셨습니다.");
				}
				while(inputStream != null) {
					sendChat(inputStream.readUTF());
				}
			} catch (IOException e) {
//				e.printStackTrace();
			} finally {
				for(int i=0;i<threadList.size();i++) {
					if(socket.equals(threadList.get(i).socket)) {
						threadList.remove(i);
						try {
							sendChat(nickname + " 님이 채팅방에서 나가셨습니다.");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("접속자수: " + threadList.size() + " 명");
			}
		}
		
	}
}
