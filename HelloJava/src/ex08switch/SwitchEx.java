package ex08switch;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		/*
		 점수가 73점인 학생의 학점을 구하시오
		 90-100	A
		 80-89	B
		 70-79	C
		 60-69	D
		 나머지는 	F
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("점수 입력: ");
//		int num = Integer.parseInt(sc.next());
//		String hakjum = "";
//		
//		switch(num/10) {
//		case 10:
//		case 9:
//			hakjum = "A";
//			break;
//		case 8:
//			hakjum = "B";
//			break;
//		case 7:
//			hakjum = "C";
//			break;
//		case 6:
//			hakjum = "D";
//			break;
//		default:
//			hakjum = "F";
//		}
//		
//		System.out.println(hakjum);
		
		/*
		 월을 입력받아 해당 월의 날짜 수를 출력하는 프로그램을 작성하시오 (switch, break 사용)
		 */

		System.out.print("월 입력: ");
		int month = Integer.parseInt(sc.next());
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지 있음");
			break;
		case 2:
			System.out.println("28일 까지 있음");
			break;
		default:
			System.out.println("31일 까지 있음");
			
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
