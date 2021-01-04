package ex05threadtcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


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
