package ex09method;

import java.util.Scanner;

public class MethodEx3 {

	public static void main(String[] args) {
		/*
		 1형식: 파라미터 값이 없음, 단순 로직 처리
		 2형식: 파라미터를 인자로 줌, 그 데이터를 가지고 처리
		 3형식: return
		 
		 아래는 3형식
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(sc.next());
		
		System.out.println("아하~~~ " + year + "년은 " + yunnian(year));
		

	}
	
	public static String yunnian(int year) {
		
		String result = "";
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			result = "윤년";
		} else {
			result = "평년";
		}
		
		return result;
	}

}
