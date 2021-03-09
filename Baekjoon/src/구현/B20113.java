package 구현;

import java.util.Scanner;

public class B20113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();//총 인원 수
		int[] players = new int[size+1];//투표 포기 0을 포함한 투표 현황
		//투표된 사람 +1
		for(int i=0;i<size;i++) {
			int tmp = sc.nextInt();
			players[tmp]++;
		}
		//가장 큰 값과 해당 인덱스 찾기
		int max = 0;
		int idx = 0;
		for(int i=1;i<=size;i++)
			if(players[i]>max) {
				max = players[i];
				idx = i;
			}
		//가장 큰 값이 중복될 경우 skipped 출력 후 종료
		for(int i=1;i<=size;i++)
			if(idx!=i && players[i]==max) {
				System.out.println("skipped");
				return;
			}
		//가장 큰 값의 idx값 출력 -> 가장 많이 투표받은 사람
		System.out.println(idx);
	}
}
