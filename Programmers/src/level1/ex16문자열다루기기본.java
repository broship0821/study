package level1;

public class ex16문자열다루기기본 {
	
	public static boolean solution(String s) {
		if(!(s.length()==4||s.length()==6)) {
			return false;
		}
        for(int i=0;i<s.length();i++) {
        	if(!((byte)s.charAt(i)>=48 && (byte)s.charAt(i)<=57)) {
        		return false;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		String s = "1234a67890";
		System.out.println(solution(s));

	}
	
	/*
	 * char는 바로 c < '0' 이렇게 비교 가능함
	 public boolean solution(String s) {
     int length = s.length();
        if (length != 4 && length != 6)
            return false;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                return false;

        }
        return true;
  }
	 */
	
	/*
	 * Integer.parseInt 방법
	 public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){ //오류나면 숫자 아님
              return false;
          }
      }
      else return false;
  }
	 */
	
	/*
	 * 정규표현식
	 public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
	 */

}
