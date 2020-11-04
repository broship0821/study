package ex00mybang2;

import java.util.Scanner;

public class Ex01BaeSoo {

	public static void main(String[] args) {
		/*
		 high level language(human-oriented language) -> 인간에게 더 가까움, 인간이 편함(java, c#, 비주얼베이직)
		 low level language(machine-oriented language) -> 기계에게 더 가까움, 기계가 편함
		 	-assembly 기계어와 1:1 대응
		 	
		 컴파일: 영어를 기계어로 바꾸기
		 
		 compile 언어 -> 한번 번역된 후 계속 사용
		 interpreter 언어 -> 브라우저가 창을 열때마다 번역
		 
		 자바는 하이레벨 컴파일 언어
		 .java : 영어, source program, 저장하면 컴파일 됨
		 .class: byte code
		 just-in-time compiler: 컴파일된 것을 다시 한번 번역함
		 자바는 컴파일 되고 메모리에 올라올 때 인터프리터가 한번 더 됨, 그래서 어느 OS든 호환이 가능함
		 
		 
		 함수(메소드)
		 head
		 if(조건) {body
		 	문장1;
		 	문장2;
		 }
		 
		 */
		
		
		/*
		 i2 값을 입력받아 i2가 3의 배수이면 "거봐",
		 5의 배수이면 "아하", 3과 5의 배수이면  "동시배수배수"를
		 출력하는 프로그램을 작성하시오
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력: ");
		int i2 = sc.nextInt();
//		System.out.print("문자입력:");
//		String s2 = sc.nextLine();
//		System.out.println(i2);
//		System.out.println(s2);
//		int i2 = Integer.parseInt(sc.next());
		/*
		 문자로 받아서 숫자로 바꾸는 방법을 써야하는 이유
		 
		 c 언어
		 	getchar()	30엔터
		 	getchar()	50엔터
		 	getchar()	70엔터
		 	여기서 엔터도 값으로 들어감
		 
		 nextInt() 메서드는 사용자 입력의 가장 마지막 개행문자를 제거하지 않음
		 그래서 남은 엔터가 뒤에 nextLine()으로 받을때 입력으로 처리되서 문제가 발생
		 그래서 Integer.parseInt(sc.next())써야됨
		 */
		
		if(i2 % 3==0 && i2 % 5 ==0)
			System.out.println("동시배수배수");
		else if (i2 % 3==0)
			System.out.println("거봐");
		else if (i2 % 5 ==0)
			System.out.println("아하");

		
		sc.close();
	}

}
