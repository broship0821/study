package ex22inheritance;

class Boomo {

	protected int diamond; //부모 자식간에만 사용 가능함
	
	public void don() {
		System.out.println("나 재산 많아~~");
	}

}

class Child extends Boomo {
	public void car() {
		diamond=3;
		don();
		System.out.println("차 있어~~");
	}
}

/*
 animal 부모는 move() 하는 행동이 있다 새는 노래 잘하고 물고기는 수영을 잘한다
 상속 튿성을 사용하여 다음과 같이 출력하도록 만드시오
 
 나 잘 움직여 -> 부모(애니멀)

 나 잘 움직여 -> 새
 노래 엄청 잘해 sing()
 
 나 잘 움직여 -> 물고기
 수영은 내가 잘해 swim()
 
 */

class Animal {
	public void move() {
		System.out.println("나 잘 움직여~");
	}
}

class Bird extends Animal {
	public void sing() {
		System.out.println("노래 엄청 잘해");
	}
}

class Fish extends Animal {
	public void swim() {
		System.out.println("수영은 내가 잘해");
	}
}


public class InheritenceEx {

	public static void main(String[] args) {
		/*
		 상속 - 재사용을 위해
		 
		 1) 100% 상속
		 2) 자녀의 재산은 부모와 같거나 많다
		 	부모 - 자녀
		 	기본 - 파생
		 	
		 3) 상속의 실제 keyword
		 	extends = is a kind of
		 */
		Boomo b1 = new Boomo();
		b1.don();
//		b1.car(); //에러
		
		Child c1 = new Child();
		c1.don();
		c1.car();
		
		Boomo b2 = new Child();
		b2.don();
//		b2.car(); //에러
		
		
		
		System.out.println("-----------------");
		Animal a = new Animal();
		a.move();
		Bird b = new Bird();
		b.move();
		b.sing();
		Fish f = new Fish();
		f.move();
		f.swim();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
