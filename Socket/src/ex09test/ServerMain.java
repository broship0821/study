package ex09test;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		if(args.length!=1) {
			System.out.println("사용법: java [패키지명].[파일명] [포트번호]");
			System.exit(1);
		}
		
		new Server(Integer.parseInt(args[0]));

	}

}
