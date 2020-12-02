package level1;

public class ex25자릿수더하기 {

	public static int solution(int n) {
        int answer = 0;
        while(n>0) {
        	answer += n%10;
        	n /= 10;
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(987);
	}
}
