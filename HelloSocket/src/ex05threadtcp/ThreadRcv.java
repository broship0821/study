package ex05threadtcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

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
