package ex05threadtcp;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		if(args.length!=2) {
			System.out.println("사용법: java [패키지명].[파일명] [ip주소] [포트번호]");
			System.exit(1);
		}
		
		Socket s = new Socket(args[0], Integer.parseInt(args[1]));
		
		ThreadSend sendCli = new ThreadSend(s);
		ThreadRcv rcvCli = new ThreadRcv(s);
		sendCli.start();
		rcvCli.start();

	}

}
