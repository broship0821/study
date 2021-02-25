package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07문자열재정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int size = input.length();
		
		char[] arr = new char[size];//알파벳만 꺼내서 담기
		int num = 0;//숫자만 꺼내서 담기
		
		for(int i=0;i<size;i++) {
			char tmp = input.charAt(i);
			if(tmp>=65 && tmp<=90) //알파벳이라면
				arr[i] = tmp;
			else //숫자라면
				num += (tmp-'0');
		}
		Arrays.sort(arr);//알바벳 정렬
		String result = new String(arr).trim();//공백 제거 후 String으로
		System.out.println(result+num);
	}

}
