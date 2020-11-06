package ex07cast;

public class DataCast {

	public static void main(String[] args) {
		
		/*
		 프로그램 짜다 보면 short -> int 나 int -> short
		 로 받을 상황이 생김
		 */
		//묵시적 형변환(implicit conversion)
		//작은 자료형에서 큰 자료형으로 옮길때, 에러 안남
		short sh1 = 100;
		int i1 = sh1; //int는 short를 담을 수 있음
		
		//명시적 형변한, cast 연산자
		//개발자 책임하에 강제 형변환 시킬 수 있음
		int soo7 = 23456;
		short sh2 = (short) soo7;
		
		System.out.println(sh2);

	}

}
