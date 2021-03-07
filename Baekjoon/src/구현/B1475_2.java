package 구현;

import java.util.Scanner;

public class B1475_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//9와 6을 하나로 봄(나중에 /2하면 됨)
		input = input.replace('9', '6');
		//0~8의 int 배열 만들기
		int[] check = new int[9];
		//각 숫자별로 필요한 개수
		for(int i=0;i<input.length();i++) {
			int idx = input.charAt(i)-'0';
			check[idx]++;
		}
		//6은 나누기2를 한후 반올림
		if(check[6]!=0)
			check[6] = (int)Math.round(check[6]/2.0);
		//가장 많이 중복되는 숫자
		int max = 0;
		//check배열중 가장 큰수만큼 세트가 필요
		for(int i=0;i<check.length;i++)
			if(check[i]>max) max = check[i];
		System.out.println(max);
	}
}
