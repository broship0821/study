package level1;

public class ex28정수제곱근판별 {
	
	public static long solution(long n) {
        long answer = (long)Math.sqrt(n);
        
        return Math.pow(answer, 2)<n?-1:(long)Math.pow(answer+1, 2);
    }
	/*
	 public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
	 */

	public static void main(String[] args) {
		System.out.println(solution(10));

	}

}
