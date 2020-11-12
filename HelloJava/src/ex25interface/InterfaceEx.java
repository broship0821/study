package ex25interface;

interface Samchon { //상속 역활
	void isBoat(); //선언 O, 구현 X, child class에서 구현, public X
}

interface Gomo {
	void bosuk();
}

class Booja {
	public void manaDon() {
		System.out.println("많이 벌었다~");
	}
}

class Na extends Booja implements Samchon, Gomo{
	@Override
	public void isBoat() {
		System.out.println("삼촌꺼 보트 타자~");
		
	}
	@Override
	public void bosuk() {
		System.out.println("고모한테 보석 받음~");
		
	}
	
	public void useDon() {
		System.out.println("많이 쓰자~");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		Na na = new Na();
		na.useDon(); //원래 내꺼
		na.isBoat(); //삼촌꺼 상속된거 interface
		na.manaDon(); //부자꺼 상속된거 extends
		na.bosuk();

	}

}
