package 구현;

import java.util.Scanner;

public class B2998_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//1. 2진수의 길이가 3으로 나누어 떨어질 때 까지 수의 앞에 0을 붙인다.
		if(input.length()%3==1)
			input = "00" + input;
		else if(input.length()%3==2)
			input = "0" + input;
		//2. 그 다음, 3자리씩 그룹을 나눈다.
		StringBuffer result = new StringBuffer();
		for(int i=0;i<input.length();i+=3) {
			String tmp = input.substring(i, i+3);
			//3. 아래의 표를 참고해 8진수로 바꾼다.
			int a = tmp.charAt(0)-'0';
			int b = tmp.charAt(1)-'0';
			int c = tmp.charAt(2)-'0';
			result.append(a*4+b*2+c*1);
		}
		System.out.println(result);
	}
}
