package mybang2;

import java.util.Scanner;

public class Ex02BaeSoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 1~100 사이의 정수를 입력받아 50이상이 들어왔으면 50보다 커를 출력하시오
		 */
		System.out.print("1~100 사이의 정수입력: ");
		int num = Integer.parseInt(sc.next());
		if(num>=50)
			System.out.println("50보다 커");
	}

}
