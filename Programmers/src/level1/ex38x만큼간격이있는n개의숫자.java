package level1;

import java.util.Arrays;

public class ex38x만큼간격이있는n개의숫자 {
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long tmp = x;
		for(int i=0;i<n;i++) {
			answer[i] = tmp;
			tmp += x;
		}
		System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	/*
	 public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x; //이런방법이..
        }

        return answer;

    }
	 */

	public static void main(String[] args) {
		System.out.println(solution(-4, 2));
		

	}

}
