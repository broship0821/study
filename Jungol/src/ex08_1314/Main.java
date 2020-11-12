package ex08_1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
//		int n = sc.nextInt();
		
		/*
		 		1 8  9 16
		 		2 7 10 15
		 		3 6 11 14
		 		4 5 12 13
		 */
		
		int k = 0;
		for(int i=0;i<4;i++) {
			k++;
			System.out.print(k + " ");
			
			int m = 7;
			for(int j=0;j<3;j++) {
				System.out.print((k+m) + " ");
				m -= 2;
			}
			System.out.println();
		}

	}

}
