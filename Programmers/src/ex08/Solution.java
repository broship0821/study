package ex08;
//가운데 글자 가져오기
public class Solution {

	public static String solution(String s) {
		int size = s.length();
		int half = size/2;
		String answer = "";
		if(size%2!=0)
			answer = s.substring(half,half+1);
		else
			answer = s.substring(half-1,half+1);
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "abcde";
		solution(s);

	}

}
