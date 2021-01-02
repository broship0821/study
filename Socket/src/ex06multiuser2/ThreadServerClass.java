package ex06multiuser2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

class ThreadServerClass extends Thread {
	private Socket socket;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	private ArrayList<ThreadServerClass> threadList;
	
	public ThreadServerClass(Socket s, ArrayList<ThreadServerClass> threadList) throws IOException {
		socket = s;
		inputStream = new DataInputStream(s.getInputStream());
		outputStream = new DataOutputStream(s.getOutputStream());
		this.threadList = threadList;
	}
	
	public void sendChat(String chat) throws IOException {
		for(int i=0;i<threadList.size();i++) {
			threadList.get(i).outputStream.writeUTF(chat);
		}
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
//			e.printStackTrace(); //주석시키면 에러메세지 안나옴
		} finally {//try문에서는 절대 finally로 안넘어옴, catch문에서만 finally로 옴
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