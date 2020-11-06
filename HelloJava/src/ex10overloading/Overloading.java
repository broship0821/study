package ex10overloading;

public class Overloading {

	public static void main(String[] args) {
		/*
		 메소드 오버라이딩 -> 매소드 중복
		 
		 오버로딩 조건:
		 	1) method 이름이 같아야됨
		 	2) 인자의 타입이 다르거나 갯수가 달라야됨
		 */
		int aa = 100;
		double bb = 23.5;
		int x = 200;
		double y = 300.7;
		
		kaja();
		kaja(aa);
		kaja(x);
		

	}

	private static void kaja(int aa, int bb) {
		// TODO Auto-generated method stub
		
	}
	
	private static void kaja(int aa) {
		// TODO Auto-generated method stub
		
	}

	private static void kaja() {
		// TODO Auto-generated method stub
		
	}

}
