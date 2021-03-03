package 구현;

import java.util.Scanner;

public class B14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();//총 라운드 수
		
		for(int i=0;i<round;i++) {
			int a = sc.nextInt();//A 딱지 수
			int[] arrA = new int[a];//딱지 종류
			for(int j=0;j<a;j++) arrA[j]=sc.nextInt();
			
			int b = sc.nextInt();//B 딱지 수
			int[] arrB = new int[b];//딱지 종류
			for(int j=0;j<b;j++) arrB[j]=sc.nextInt();
			
			int draw = 0;
			for(int j=4;j>0;j--) {//별부터 세모까지 차례대로 비교
				int cntA = 0;
				int cntB = 0;
				
				for(int k=0;k<a;k++)
					if(arrA[k]==j) cntA++;
				
				for(int k=0;k<b;k++)
					if(arrB[k]==j) cntB++;
				
				if(cntA==cntB) {//같으면 다음 모양 비교
					draw++;//draw가 4개면 비김
					continue;
				}
				
				if(cntA>cntB) {
					System.out.println("A");
					break;
				} else {
					System.out.println("B");
					break;
				}
			}
			if(draw==4) System.out.println("D");
		}
	}
}
