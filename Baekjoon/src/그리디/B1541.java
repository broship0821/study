package 그리디;

import java.util.Scanner;

public class B1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] arr = input.split("-");
		// 1. 맨 앞의 +연산 처리 결과
		String[] tmp = arr[0].split("\\+");//+에는 \\를 붙여줘야 한다함
		int first = 0;
		for(int i=0;i<tmp.length;i++) {
			first += Integer.parseInt(tmp[i]);
		}
		// 2. 그 후의 모든 값 더하기
		int other = 0;
		for(int i=1;i<arr.length;i++) {
			String[] tmp2 = arr[i].split("\\+");
			for(int j=0;j<tmp2.length;j++) {
				other += Integer.parseInt(tmp2[j]);
			}
		}
		// 3. 맨 처음값 - 그 후의 모든 값 = 가장 작은 수
		System.out.println(first-other);
	}
}
