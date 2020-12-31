package chap05;

import java.util.Scanner;

//유클리드 호제법
public class EuclidGCD2 {
	
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	//재귀  사용하지 않고 최대공약수 구하기
	static int gcd2(int x, int y) {
		while(y!=0) {
			int result = y;
			y = x % y;
			x = result;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		System.out.print("정수 입력: ");
		int y = sc.nextInt();
		
		System.out.println("최대공약수: "+gcd(x, y));
		System.out.println("최대공약수: "+gcd2(x, y));

	}

}
