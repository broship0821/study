package mybang;

import java.util.Date;
/*
 package 와 import의 차이점
 package: 내방, 현재 작업하고 있는 소스들이 있음
 import: 남의 방, 남이 만든 소스들을 사용
 */
//import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		Date d1 = new Date(); //ctrl + shift + o 로 전체 임포트 가능
		
		System.out.println(d1.toLocaleString()); //화면출력명령
		System.out.println(d1);
		//toLocaleString(): 한국어로 출력
		
		/*
		 여러줄 주석 ctrl + shift + /
		 주석 풀기  ctrl + shift + \
		*/
		
		System.out.println(); //줄바꿈
		System.out.println("날짜 출력 끝!");
		
		System.out.printf("%d 번 버스타고 집에 간다\n", 120);
		
		int num = 120;
		System.out.println(num + " 번 버스타고 집에 간다");
		
		System.out.printf("파이: %f\n", 3.141592);
		System.out.printf("파이: %.2f\n", 3.141592); //소수점 2자리 까지만
		double p = 3.141592;
		System.out.println("파이: " + p);
		
		/*
		 자바에서의 메모리
		 
		 	heap:참조형(Reference Type)의 데이터 타입을 갖는 객체(인스턴스), 배열 등은 Heap 영역에 데이터가 저장된다.
		 	static(한번 생성되면 프로그램 끝날때 까지 유지됨) 전역변수, 적 멤버변수(static이 붙은 자료형)
		 	stack(메모리가 적음, 생성되었다 지워짐) -> primitive data (메소드가 호출될 때 메모리에 할당되고 종료되면 메모리가 해제된다.)
		 	code memory
		
		 stack:
		    자료형  변수명  값
		 	int aa = 30; -> aa라는 기억창고에 30을 집어넣음
		 		int -> 길이(4byte), type(정수)이 결정됨
		 				4byte: -2147483648 ~ +2147483647 까지 넣을 수 있음
		 				2byte: -32768 ~ +32767
		 				
		 	0 			-> 00000000000000000000000000
		 	1 			-> 00000000000000000000000001
		 	-1			-> 11111111111111111111111111 (음수중에 가장 큰 수)
		 	2147483647	-> 01111111111111111111111111
		 	-2147483648 -> 10000000000000000000000000 (음수 중에 가장 작은 수)
		 */
		
		/*
		 달에서의 내 몸무게는 지구에서의 몸무게의 약 17%라고 한다
		 지구에서의 몸무게를 출력하고 이를 달에서의 몸무게로 변환하여 출력하시오
		 */
		System.out.println("-------------------------------------");
		
		int earthWeight = 70;
		double moonWeight = earthWeight*0.17;
		System.out.println("내 몸무게: " + earthWeight + "kg");
		System.out.printf("달에서의 몸무게: %.2fkg\n", moonWeight);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
