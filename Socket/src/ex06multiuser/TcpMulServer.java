package ex06multiuser;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {
	ArrayList<ThreadServerClass> threadList = new ArrayList<>();
	Socket socket;
	DataOutputStream outputStream;
	
	public ServerClass(int port) throws IOException  {
		Socket s = null;
		ServerSocket ss = new ServerSocket(port);
		System.out.println("서버 가동");
		
		while(true) {
			s = ss.accept();
			System.out.println("접속주소: "+s.getInetAddress()+", 접속포트: "+s.getPort());
			ThreadServerClass tServer = new ThreadServerClass(s);
			tServer.start();
			
			threadList.add(tServer); //실행된 쓰레드를 리스트에 add
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
					//클라이언트가 보낸 채팅 내용을 접속한 모두에게 보냄
				}
				//while문 때문에 try문에서는 finally로 갈 일이 없음
			} catch (IOException e) { //에러가 생겼을때 -> 유저가 나갔을때
//				e.printStackTrace(); //주석시키면 에러메세지 안나옴
			} finally {//유저가 나갔을때
				//나간 쓰레드의 인덱스 찾기
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

public class TcpMulServer {

	public static void main(String[] args) throws IOException {
		if(args.length!=1) {
			System.out.println("사용법: java [패키지명].[파일명] [포트번호]");
			System.exit(1);
		}
		
		new ServerClass(Integer.parseInt(args[0]));
		//서버는 채팅하지 않고 들어오는 사람들에게 뿌려주는 역활만 수행

	}

}
