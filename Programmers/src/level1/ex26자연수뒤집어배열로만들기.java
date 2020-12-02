package level1;

import java.util.Arrays;

public class ex26자연수뒤집어배열로만들기 {
	
	public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for(int i=0;i<answer.length;i++) {
        	answer[i] = s.charAt(answer.length-1-i) - 48;
        }
		
        System.out.println(Arrays.toString(answer));
        return answer;
    }

	public static void main(String[] args) {
		solution(12345);

	}

}
