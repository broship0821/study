package level1;

import java.util.Arrays;

public class ex15문자열내림차순으로배치하기 {
	public static String solution(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String answer = "";
		for(int i=0;i<c.length;i++) {
			answer = c[i] + answer;
		}
		
		
		System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
	}
}
