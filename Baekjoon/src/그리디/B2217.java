package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class B2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();//총 로프 개수
		int[] ropes = new int[size];//각 로프가 버틸수 있는 중량
		for(int i=0;i<size;i++)
			ropes[i] = sc.nextInt();
		//로프 정렬
		Arrays.sort(ropes);
		//로프들로 가장 많이 들수 있는 중량
		int result = ropes[0]*size;
		for(int i=0;i<size;i++) {
			int tmp = ropes[i]*(size-i);
			if(tmp>result)
				result = tmp;
		}
		System.out.println(result);
	}
}
