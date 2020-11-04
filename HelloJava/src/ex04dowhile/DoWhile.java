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
		int result;
		do {
			System.out.println("1. 짜장\n2. 짬뽕");
			System.out.print("선택하세요: ");
			result = Integer.parseInt(sc.next());
		}while(result!=1 && result!=2);

		if(result==1) {
			System.out.println("짜장면 나왔습니다.");
		} else {
			System.out.println("짬뽕 나왔습니다.");
		}
	}

}
