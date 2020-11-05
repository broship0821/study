package ex04dowhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 do {
		 	문장들;
		 } while(조건);
		 
		 do while문은 무조건 한번이 실행됨, 메뉴 만들때만 사용됨
		 */
		Scanner sc = new Scanner(System.in);
//		int result;
		
		
		String result;
		
		do {
			System.out.println("*** 메뉴판 ***");
			System.out.println("1. 짜장\n2. 짬뽕");
			System.out.print("선택하세요: ");
			result = sc.next();
			
		}while(!result.equals("1") && !result.equals("2"));

		System.out.println("맛있게 드십쇼");
	}

}
