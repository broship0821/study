package ex05threadtcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
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

class ThreadRcv extends Thread {
	Socket s;
	DataInputStream dis;
	//what은 보내는 쪽이 처리할 것이므로 사용하지 않음

	public ThreadRcv(Socket s) throws IOException {
		this.s = s;
		dis = new DataInputStream(s.getInputStream()); //read
	}
	
	@Override
	public void run() {
		while(dis!=null) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class TCPServer {

	public static void main(String[] args) throws IOException {
		if(args.length!=1) {
			System.out.println("사용법: java [패키지명].[파일명] [포트번호]");
			System.exit(1);
		}
		
		//listen 상태
		ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 준비 완료");
		
		while(true) { //connect가 하나만 들어오는게 아니라 계속 들어올 수 있으니 열어놓는 느낌
			System.out.println("대화 기다리는중..");
			Socket s = ss.accept(); //connect 받기
			
			//receive / send 를 쓰레드로 처리
			ThreadSend sendSer = new ThreadSend(s); //보내는쪽 쓰레드
			ThreadRcv rcvSer = new ThreadRcv(s); //받는쪽 쓰레드
			sendSer.start();
			rcvSer.start();
		}

	}

}
