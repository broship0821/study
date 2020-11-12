package ex26abstraction;
/*
 추상화
 	가독성, 다형성(polymorphism)
 	
 	과일
 	
 	사과	배	감
 	
 	interface 나 abstract 모두 전제조건이 "상속에 있어서"
 */

import java.util.Scanner;

abstract class Fruit { //추상클래스
	public void good() {
		System.out.println("아주 좋아~");
	}
	public abstract void eat(); //추상메소드 -> 인터페이스처럼 구현을 못함, 인터페이스 처럼 강제로 구현시킴
}

class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("사과 먹자");
		
	}
}

class Pear extends Fruit {
	@Override
	public void eat() {
		System.out.println("배 먹자");	
	}
}

class Grape extends Fruit {
	@Override
	public void eat() {
		System.out.println("포도사탕");	
	}
}

public class Abs {

	public static void main(String[] args) {
//		Fruit f1 = new Apple();
//		f1.eat();
//		
//		Fruit f2 = new Pear();
//		f2.eat();
//		
//		Fruit f3 = new Grape();
//		f3.eat();
		/*
		 마우스를 새로 꼽을때 삼성, 로지텍, MS사께 있음
		 이때 새로운 로직을 구현할 필요 없이 구별만 해주면 똑같은 함수 써서 사용할 수 있음
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 사과, 2: 배, 3: 포도");
		System.out.print(">>");
		Fruit f;
		int sel = sc.nextInt();
		if(sel==1) {
			f = new Apple();
		} else if(sel==2) {
			f = new Pear();
		} else {
			f = new Grape();
		}
		f.eat();

	}

}