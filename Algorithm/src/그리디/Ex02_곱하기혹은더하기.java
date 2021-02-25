package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_곱하기혹은더하기 {

	//문제 보자마자 떠오른 방법(0뿐 아니라 1도 더하기 해야되는데 생각 못함, 후에 다시 바꿈)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String s = sc.next();
//		
//		int size = s.length();
//		int[] arr = new int[size];//문자열길이 만큼의 int 배열 생성
//		
//		for(int i=0;i<size;i++) {
//			arr[i] = s.charAt(i) - '0';//char -> int
//		}
//		
//		int result = arr[0];
//		for(int i=1;i<size;i++) {
//			if(result==0 || arr[i]<=1)
//				result += arr[i];
//			else
//				result *= arr[i];
//		}
//		
//		System.out.println(result);
//
//	}
	
	//0을 빼고 다 곱하면 더 빠르지 않을까? -> 1도 있다는걸 생각 못함
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	//첫번째 값 삽입
	int result = s.charAt(0)-'0';
	for(int i=1;i<s.length();i++) {
		int j = s.charAt(i) - '0';//char -> int
		if(j<=1 || result<=1)
			result += j;
		else
			result *= j;
	}
	
	System.out.println(result);

}
	/*
	 0,1일 경우 더하기 나머지는 곱하기 연산
	 이게 가장 크게 만들어줌(난 0만 생각했음)
	 */

}
