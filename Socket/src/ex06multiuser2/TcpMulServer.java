package ex06multiuser2;
//내부클래스 없애보기
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//tcp 서버 클래스
class ServerClass {
	private ArrayList<ThreadServerClass> threadList = new ArrayList<>();
	
	public ServerClass(int port) throws IOException  {
		Socket s = null;
		ServerSocket ss = new ServerSocket(port);
		System.out.println("서버 가동");
		
		while(true) {
			s = ss.accept();
			System.out.println("접속주소: "+s.getInetAddress()+", 접속포트: "+s.getPort());
			ThreadServerClass tServer = new ThreadServerClass(s, threadList);
			tServer.start();//새로운 클라이언트가 접속할때마다 서버쓰레드 생성 
			
			threadList.add(tServer); //실행된 쓰레드를 리스트에 add
			System.out.println("접속자 수: " + threadList.size());
		}
	}
	
	
	
	
}

//메인 클래스
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
