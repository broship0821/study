package ex23overriding;

import java.util.Scanner;

class Boomo{
	public void car() {
		System.out.println("부모차 타고 드라이브 개꿀");
	}
}

class Child extends Boomo{
	public void car() {//overriding
//		super.car();
		System.out.println("자식 차 타고 여행 개꿀");
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		/*
		 오버라이딩 : 재정의
		 1) "상속"에 있어서 메소드 이름이 같아야
		 2) 재정의시 약간 다르게 하는것, 업그레이드 (toString())
		 
		 */
		
		Boomo b = new Boomo();
		b.car();
		Child c = new Child();
		c.car();
		System.out.println("------");
		//자료의 형변환
		int i = 30;
		short sh = (short)i;
		
		//객체의 형변환
		Boomo b2 = c;
		b2.car();
		Boomo b3 = new Child();
		b3.car();
		/*
		 	이게 에러가 안나는 이유:
		  		부모의 범위가 더 좁고 자식의 범위가 더 넓음
		  		부모 객체가 자식 객체를 바라볼수 있는 이유는 부모가 자식 객체에 있는 부모 것들을 사용할 수 있어서
		  		반대로 자식 객체는 자기가 갖고 있는 객체를 부모를 바라보는 순간 못쓰니 사용 못함
		  		
		  		자기 자신이 가지고 있는건 사용할 수 있어야 에러가 안남
		 */
//		Child c2 = b;
//		Child c3 = new Boomo();
		// 이 두개는 에러남
		
		Child c4 = (Child)b2; //b2 는 new Child()라 형변환은 가능
		c4.car();
//		Child c5 = (Child)b; //b 는 new Boomo()라 에러남, 근데 형변환 때문에 컴파일 에러는 안남, 조심
		
		Boomo b5 = new Child();
		b5.car();
		
		System.out.println("----------------------------");
		/*
		 부모, 자녀 클래스를 사용하여 객체의 형변환 프로그램을 작성하시오
		 결과는:
		 	어느차 타시렵니까?(부모차=1,자녀차=2)
		 	2
		 	자녀차 타고 여행가자
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어느차 타시렵니까?(부모차=1,자녀차=2)");
		System.out.print(">>>>");
		int num = sc.nextInt();
		Boomo boo;
		if(num==1) {
			boo = new Boomo();
		} else {
			boo = new Child();
		}
		boo.car();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
