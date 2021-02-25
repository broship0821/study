package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class B16435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();//과일 개수
		int snake = sc.nextInt();//스네이크 초기길이
		
		int[] fruits = new int[size];//과일 높이
		for(int i=0;i<size;i++) {
			fruits[i] = sc.nextInt();
		}
		
		//과일 높이 정렬
		Arrays.sort(fruits);
		
		for(int i=0;i<size;i++) {
			if(snake>=fruits[i])
				snake++;
			else
				break;
		}
		System.out.println(snake);
	}
}
