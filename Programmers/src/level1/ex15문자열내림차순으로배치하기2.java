package level1;

import java.util.Arrays;

public class ex15문자열내림차순으로배치하기2 {
	public static String solution(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String answer = new StringBuilder(new String(c)).reverse().toString();
		//StringBuilder의 .reverse() 메소드 사용
		
		System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
	}
}
