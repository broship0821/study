package chap05;
//팩토리얼을 비재귀적으로 구현

import java.util.Scanner;

public class Factorial2 {
	
	static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	//재귀아닌 방법으로 팩토리얼 구하기
	static int factorial2(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		
		System.out.println(x+"의 팩토리얼: "+factorial(x));
		System.out.println(x+"의 팩토리얼: "+factorial2(x));

	}

}
