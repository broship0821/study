package level1;

public class ex23약수의합 {
	
	public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0)
        		answer += i;
        }
        System.out.println(answer);
        return answer;
    }
	
	/*
	 public int sumDivisor(int num) {
        int answer = 0;
            for(int i = 1; i <= num/2; i++){ // 절반까지만 하면 됨
        if(num%i == 0) answer += i;
      }
        return answer+num; //마지막에 자기 자신 추가
    }
	 */

	public static void main(String[] args) {
		solution(5);

	}

}
