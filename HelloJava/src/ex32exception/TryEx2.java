package ex32exception;

import java.util.Scanner;

public class TryEx2 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는: ");
		String one = sc.nextLine();
		int num1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는: ");
		String two = sc.nextLine();
		int num2 = Integer.parseInt(two);
		
		System.out.println(num1/num2);
		
		} catch (NumberFormatException e) { 
			System.out.println("숫자만 입력하세요!");
		} catch (ArithmeticException e) { 
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) { 
			System.out.println("알수 없는 오류 발생");
			System.out.println(e);
			System.out.println(e.getMessage());
		}  finally {
			System.out.println("good~!");
		}
		

	}

}
