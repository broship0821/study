package 구현;

import java.util.Scanner;

public class B2998 {

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
			switch (tmp) {
			case "000": result.append("0"); break;
			case "001": result.append("1"); break;
			case "010": result.append("2"); break;
			case "011": result.append("3"); break;
			case "100": result.append("4"); break;
			case "101": result.append("5"); break;
			case "110": result.append("6"); break;
			case "111": result.append("7"); break;
			}
		}
		System.out.println(result);
	}
}
