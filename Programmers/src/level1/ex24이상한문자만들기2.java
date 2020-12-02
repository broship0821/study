package level1;

import java.util.Arrays;

public class ex24이상한문자만들기2 {

	public static String solution(String s) {
		int sp = 1;
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if(tmp==' ') {
				sp = 0;
			} else {
				if(sp%2==0) {
					tmp = Character.toLowerCase(tmp);
				} else {
					tmp = Character.toUpperCase(tmp);
				}
			}
			sp++;
			answer.append(tmp);
		}
		System.out.println(answer);
        return answer.toString();
    }
	/*
	 * 더 간단한 방법
	 public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
	 */
	
	public static void main(String[] args) {
		solution("try hello world");
	}
	
}
