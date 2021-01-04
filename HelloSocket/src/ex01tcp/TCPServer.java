package ex01tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	//전화 받는쪽
	public static void main(String[] args) throws IOException {
		//1024이하의 포트 번호는 고정 포트기 때문에 사용X, 그외 아무 포트 사용 가능
		ServerSocket ss = new ServerSocket(7777); //listen, 해당 포트로 오는 모든 연결을 열어놈
		System.out.println("전화 준비 완료");
		
		while(true) {
			System.out.println("전화 기다리는중...");
			Socket s = ss.accept(); //accept, s에는 전화온 사람의 소켓이 들어있음
			System.out.println(s.getInetAddress()+ "로 부터 전화가 옴");
			
			//byte단위로 보내는 파일 전송
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("여보세요~");
			//getOutputStream 상대방쪽으로 보냄
			
			dos.close();
			s.close();
		}

	}

}
