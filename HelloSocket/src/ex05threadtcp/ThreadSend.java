package ex05threadtcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread {
	Socket s;//from client
	DataOutputStream dos;
	String what; //채팅시 맨 앞에 나올 문자열
	
	public ThreadSend(Socket s) throws IOException {
		this.s = s;
		dos = new DataOutputStream(s.getOutputStream()); //send를 위한 i/o 스트림
		what = "상대방>>>";
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(dos!=null) { //chat 있으면
			try {
				dos.writeUTF(what + sc.nextLine());//io스트림을 통해 상대에게 chat 보내기
				/*
				 DataOutputStream는 원래 바이트 단위로 보내는 것인데
				 writeUTF쓰면 문자열 전송 가능해짐
				 그럼 바이트, 문자열 둘다 전송 가능한것임
				 */
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}