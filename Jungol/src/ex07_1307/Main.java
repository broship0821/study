package ex07_1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int n = sc.nextInt();
		
		int num = n*n;
		for(int i=0;i<n;i++) {
			int k = num;
			for(int j=0;j<n;j++) {
				System.out.print(k + " ");
				k -= n;
			}
			num--;
			System.out.println();
		}

	}

}
