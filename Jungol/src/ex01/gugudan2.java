package ex01;

import java.util.Scanner;

public class gugudan2 {

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
		
		for(int i=1;i<10;i++) {
			if(s<=e) {
				for(int j=s;j<=e;j++) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
				System.out.println();
			} else {
				for(int j=s;j>=e;j--) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
				System.out.println();
			}
		}

	}

}
