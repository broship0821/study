package ex06_2046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m==1) {
			for(int i=1;i<=n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		} else if(m==2) {
			for(int i=1;i<=n;i++) {
				if(i%2!=0) {
					for(int j=1;j<=n;j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				} else {
					for(int j=1;j<=n;j++) {
						System.out.print(n-j+1 + " ");
					}
					System.out.println();
				}
			}
		} else if(m==3) {
			for(int i=1;i<=n;i++) {
				int k = i;
				for(int j=0;j<n;j++) {
					System.out.print(k+" ");
					k += i;
				}
				System.out.println();
			}
		} else {
			System.out.println("잘못 입력함");
		}

	}

}
