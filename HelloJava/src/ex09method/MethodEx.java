package ex09method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		/*
		 메소드(함수)
		 자주 사용되는 것들을 만들어놓은거
		 
		 메소드: 메소드 호출문 + 메소드 정의문
		 
		 ex)
		 	sort(); -> 호출문
		 	
		 	public void sort() { -> 정의문
		 		로직;
		 	}
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(sc.next());
		
		
		yunnian(year);

	}
	
	public static void yunnian(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}
