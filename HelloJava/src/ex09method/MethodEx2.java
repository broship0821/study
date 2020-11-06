package ex09method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		/*
		 1형식: 파라미터 값이 없음, 단순 로직 처리
		 2형식: 파라미터를 인자로 줌, 그 데이터를 가지고 처리
		 3형식: return
		 
		 아래는 2형식
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(sc.next());
		
		
		yunnian(year, 10000);

	}
	
	public static void yunnian(int year, int money) {
		System.out.printf("차비 %d원 받았음\n", money);
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}
