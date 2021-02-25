package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_모험가길드 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	
	int result = 0; //여행 떠날수있는 그룹 수
	int count = 0; //현재 그룹에 포함된 모험가의 수
	for(int i=0;i<n;i++) { //공포도를 낮은 것부터 하나씩 확인하며
		count++; //현재 그룹에 해당 모험가를 포함시키기
		if(count>=arr[i]) { //현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 생성
			result++; //총 그룹의 수 증가
			count = 0; //현재 그룹에 포함된 모험가의 수 초기화
		}
	}
	System.out.println(result);
}
}
