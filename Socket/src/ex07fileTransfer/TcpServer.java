package ex07fileTransfer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버 준비됨");
		
		while(true) {
			System.out.println("기다리는 중..");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress() + "에서 접속함");
			/*
			 지금 하려는건 파일을 전송하는 소켓팅
			 그림파일, 음악파일, docx파일 등은 바이트 단위로 전송해야 제대로 감
			 이때 사용되는 것이 DataInput, DataOutput
			 이 두개는 바이트 단위로 보내면서 문자열은 따로 보낼 수 있음
			 */
			
			File file = new File("d:/aa.jpg");//그림 파일
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			//이미지 파일을 입력받아 네트워크로 전송을 위해 준비
			
			byte[] byteArr = new byte[(int)file.length()]; //파일의 길이만큼 바이트 배열 잡음
			System.out.println("file -> byte");
			dis.readFully(byteArr); //파일내용 -> 바이트 배열
			
			//길이를 먼저 전송 후 내용을 전송
			dos.writeInt(byteArr.length);
			dos.write(byteArr);
			System.out.println("전송 완료");
			
		}

	}

}
