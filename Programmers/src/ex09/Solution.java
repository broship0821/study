package ex09;
//3진법 뒤집기

public class Solution {

	public static int solution(int n) {
		//10진수 -> 3진수 외우자...
		String three = "";
		while(n>0) {
			three = (n%3) + three;
			n /= 3;
		}
		System.out.println(three);
		/*
		 10진수 x의 n진수 구하는법:
		 	x를 n으로 더이상 나눌수 없을때까지(x>0)나누고
		 	그 나머지 값들을 거꾸로 저장하기
		 */
		
		//뒤집기
		StringBuilder sb = new StringBuilder(three);
		sb.reverse();
		System.out.println(sb);
		//뒤집은 3진수 -> 10진수
        int answer = Integer.parseInt(sb.toString(), 3);
        //n진수의 x를 10진수로: Integer.parseInt(문자열, n);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(45);

	}

}
