package 구현;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for(int i=1;i<=input.length();i++) {
			System.out.print(input.charAt(i-1));
			if(i%10==0) System.out.println();
		}
	}
}
