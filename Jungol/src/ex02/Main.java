package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s = 0, e = 0;
		
		while(true) {
		
//		System.out.print("시작, 끝 입력: ");
		s = Integer.parseInt(sc.next());
		
		e = Integer.parseInt(sc.next());
		if(s>=2 && s<=9 && e>=2 && e<=9) break;
		System.out.println("INPUT ERROR!");
		}
			
		if(s<=e) {
			for(int i=s;i<=e;i++) {
				for(int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %2d\t", i, j, i*j);
					if(j%3==0) System.out.println();
				}
				System.out.println();
			}
		} else {
			for(int i=s;i>=e;i--) {
				for(int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %2d\t", i, j, i*j);
					if(j%3==0) System.out.println();
				}
				System.out.println();
			}
		}
	}

}
