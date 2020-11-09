package ex04;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int num = 1;
		
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0; j<m;j++) {
					arr[i][j] = num++;
				}
			}
			else {
				for(int j=0; j<m;j++) {
					arr[i][m-j-1] = num++;
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
