package ex32exception;

import java.util.Scanner;

public class TryEx {

	public static void main(String[] args) {
		try { //이 부분에서 에러가 날꺼 같애
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는: ");
		String one = sc.nextLine();
		int num1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는: ");
		String two = sc.nextLine();
		int num2 = Integer.parseInt(two);
		
		System.out.println(num1/num2);
		} catch (ArithmeticException e) { //에러가 났을때 실행됨
			System.out.println("0으로 나눌 수 없습니다");
		} finally { //무조건 실행됨
			System.out.println("good~!");			
		}
		

	}

}
