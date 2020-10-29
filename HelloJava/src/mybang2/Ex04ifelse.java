package mybang2;

import java.util.Scanner;

public class Ex04ifelse {

	public static void main(String[] args) {
		/*
		 정수 / 정수 = 정수
		 정수 / 실수 = 실수
		 실수 / 정수 = 실수
		실수 / 실수 = 실수
		 
		 % 연산자 : 나머지 구하는 연산자
		 10 / 3 몫		3
		 10 % 2 나머지	1
		 */
		System.out.println(10/3);
		
		int i = 100;
		if(i%3==0)
			System.out.println("3의 배수네~");
		
		if(i%3==0)
			System.out.println("3의 배수네~");
		else
			System.out.println("3의 배수 아니네");
	}

}
