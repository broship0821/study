package ex02thread;

public class ThreadMainClass {

	public static void main(String[] args) {
		ThreadClass1 tc1 = new ThreadClass1();
		ThreadClass2 tc2 = new ThreadClass2();
		tc1.start(); //쓰레드 클래스의 run()를 찾아감
		tc2.start();
		
		System.out.println("메인 쓰레드");

	}

}

class ThreadClass1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("쓰레드1: "+getName());
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("쓰레드2: "+getName());
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}