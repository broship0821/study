package ex03threadPriority;

public class ThreadMainClass {

	public static void main(String[] args) {
		ThreadClass tc1 = new ThreadClass("사과");
		ThreadClass tc2 = new ThreadClass("배");
		ThreadClass tc3 = new ThreadClass("감");
		
		//우선순위: Priority, 1~10 사이
		tc1.setPriority(tc1.MIN_PRIORITY); //1
		tc2.setPriority(tc1.NORM_PRIORITY); //5, default
		tc3.setPriority(tc1.MAX_PRIORITY); //10
		System.out.println("tc1: "+tc1.getPriority()+ " tc2: "+tc2.getPriority()+ " tc3: "+tc3.getPriority());
		
		tc1.start();
		tc2.start();
		tc3.start();
		

	}

}

class ThreadClass extends Thread {
	String fruit;
	
	public ThreadClass(String fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(fruit + "\t" + (i+1) + "개 주세요.");
			try {
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}