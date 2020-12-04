package level1;


public class ex36핸드폰번호가리기 {
	
	public static String solution(String phone_number) {
		String answer = "";
		for(int i=0;i<phone_number.length();i++) {
			if(i<phone_number.length()-4)
				answer += "*";
			else
				answer += phone_number.charAt(i);
		}
        return answer;
    }
	/*
	 * 깔--끔
	public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
	 */

	public static void main(String[] args) {
		System.out.println(solution("027778888"));
		

	}

}
