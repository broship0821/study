package ex06multiuser2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//GUI로 멀티 유저 채팅 프로그램
import java.net.Socket;

public class TcpMulClient {

	public static void main(String[] args) {
		if(args.length!=3) {
			System.out.println("사용법: java [패키지명].[파일명] [ip주소] [포트번호] [닉네임]");
			System.exit(1);
		}
		
		try {
			//                    ip 주소                                 포트번호
			Socket s = new Socket(args[0], Integer.parseInt(args[1])); //해당 ip주소에 해당 포트번호로 연결하겠다
			System.out.println("서버에 연결");//connect
			
			//i/o network stream: readUTF(), writeUTF() 사용을 위해 준비
			DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s.getInputStream());
			outputStream.writeUTF("##" + args[2]);
			//gui를 담당하는 .java 파일 하나 만들기, 거기에 보낼 인자를 준비
			
			new ClientGUI(outputStream, inputStream, args[2]); 
			
		} catch (Exception e) {
			e.printStackTrace(); //주석을 달아야 에러가 화면에 안나타남
		}
		
		
		
	}

}
