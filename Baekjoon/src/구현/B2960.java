package 구현;

import java.util.Scanner;

public class B2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[] numbers = new boolean[n+1];
		int idx = 0;
		for(int i=2;i<=n;i++)
			for(int j=i;j<=n;j+=i) {
				if(numbers[j]==false) {
					idx++;
					numbers[j] = true;
				}
				if(idx==k) {
					System.out.println(j);
					return;
				}
			}
	}
}
