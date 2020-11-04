package ex01yunnian;

import java.util.Scanner;

public class Yunian {

	public static void main(String[] args) {
		/* i해가 윤년이냐?
		 	한해: 365.2422일
		 	4년에 한번씩 윤년을 만듬(2월 29일)
		 	100년에는 평년
		 	400년에 한번은 평년
		 	
		 	ex)
		 		96년 29
		 		100년 28
		 		200 28
		 		300 28
		 		400 29
		 		
		 	문제 분석 -> 순서도 작성	->	코딩	->	실행(run)
		 			 (flow chart)
		 			 (N-S chart)
		 		
		 	윤년 특징: 4의 배수, 400의 배수 이면서 100의 배수가 아님
		 	4로 나누어 떨어지고
		 	100으로 나누어 떨어지지 않거나
		 	400 나누어 떨어지는
		 	
		 	 연산자
		 	+ - * / 	산술 연산자
		 	
		 	
		 	
		 */
		
		//			월: 1	2	3	4	5	6	7	8	9  10  11  12
		int[] pMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] yMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(sc.next());
		
		System.out.print("월 입력: ");
		int month = Integer.parseInt(sc.next());
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "년은 윤년입니다.");
			System.out.println(month + "월은 " + yMonth[month-1] + "일까지 있습니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
			System.out.println(month + "월은 " + pMonth[month-1] + "일까지 있습니다.");
		}
		
		sc.close();

	}

}
