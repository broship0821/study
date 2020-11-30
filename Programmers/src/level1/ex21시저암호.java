package level1;

public class ex21시저암호 {
	
	public static String solution(String s, int n) {
//		n = n % 26;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			//대문자일때
			if('A'<=c[i] && c[i]<='Z') {
				c[i]+=n;
				if(c[i]>='[') {
					c[i] -= 26;
				}
			}
			//소문자일때
			if('a'<=c[i] && c[i]<='z') {
				c[i]+=n;
				if(c[i]>='{') {
					c[i] -= 26;
				}
			}
		}
		
        String answer = new String(c);
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		solution("Z", 25);

	}

}
