package ex04runnable;

public class RunnableMainClass {

	public static void main(String[] args) {
		RunnableClass r = new RunnableClass();
		
		ThreadClass tc1 = new ThreadClass(); //extends Thread
		Thread tc2 = new Thread(new RunnableClass()); //implements Runnable
		
		tc1.start();
		tc2.start();
		

	}

}

class RunnableClass implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("implements Runnable");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("extends Thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}