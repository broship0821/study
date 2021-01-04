package ex01tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("127.0.0.1", 7777); //127.0.0.1 이 ip 주소로 7777 포트로 접속
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		//getInputStream: 상대방으로부터 받음
		System.out.println("상대방이 한말: " + dis.readUTF());
		
		dis.close();
		s.close();
		System.out.println("전화 끊어짐");

	}

}
