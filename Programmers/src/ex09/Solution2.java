package ex09;
//3진법 뒤집기

public class Solution2 {

	public static int solution(int n) {
		//10진수 -> 3진수
		String three = "";
		while(n>0) {
			three += n%3; //거꾸로 저장
			n /= 3;
		}
		
        int answer = Integer.parseInt(three, 3);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(45);

	}

}
