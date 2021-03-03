package 구현;

import java.util.Scanner;

public class B1475 {
/*
 * 이런생각으로 했지만... 111999일 경우 3개만 필요한데 나처럼 하면 4개가 나옴
 1. 0~9의 boolean 배열을 만든다
 2. 받은 문자열을 하나하나씩 체크하면서 b배열을 true로 만든다(6,9인지 체크)
 3. 이미 true인 값에 또 들어오면 세트수++ 하고 b배열 초기화
 
 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		boolean[] check = new boolean[10];
		int result = 1;
		
		for(int i=0;i<input.length();i++) {
			int tmp = input.charAt(i)-'0';
			if(tmp==6 && check[6]==true && check[9]==false) {//6이미 사용중일때 9가 남았으면
				check[9] = true;
				continue;
			}
			if(tmp==9 && check[9]==true && check[6]==false) {//9이미 사용중일때 6이 남았으면
				check[6] = true;
				continue;
			}
			
			if(check[tmp]==false) {//아직 사용하지 않았을때
				check[tmp] = true;
			} else {//이미 사용했을때 새로 구입
				result++;
				check = new boolean[10];
				check[tmp] = true;
			}
		}
		System.out.println(result);
	}

}
