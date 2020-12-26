package chap04;

import java.util.Scanner;

public class LastNElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("정수 입력");
		do {
			System.out.printf("%d번째 정수: ", cnt+1);
			a[cnt++%10] = sc.nextInt();
			
			System.out.print("계속 할까요? 1.예 0.아니오: ");
			retry = sc.nextInt();
		} while (retry==1);
		
		int i = cnt - N;
		if(i<0)
			i = 0;
		
		for(;i<cnt;i++)
			System.out.printf("%2d번째의 정수 = %d\n", i+1, a[i%N]);

	}

}
