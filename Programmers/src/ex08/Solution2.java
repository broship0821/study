package ex08;
//가운데 글자 가져오기
public class Solution2 {

	public static String solution(String s) {
		int size = s.length();
        return s.substring((size-1)/2,size/2+1);
    }
	
	public static void main(String[] args) {
		String s = "abcde";
		
		System.out.println(solution(s));

	}

}
