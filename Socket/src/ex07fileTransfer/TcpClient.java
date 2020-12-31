package ex07fileTransfer;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 9999);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		
		//file 길이, 내용 받아서 byte배열로 만듬
		int size = dis.readInt(); //파일 길이 받아오기
		byte[] byteArr = new byte[size];
		dis.readFully(byteArr); //내용 받아서 바이트 배열에 넣기
		
		//byte배열 -> file
		FileOutputStream fos = new FileOutputStream("d:/bb.jpg");
		fos.write(byteArr);
		
		System.out.println("파일 전송 완료");

	}

}
