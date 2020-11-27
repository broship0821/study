package level1;

public class ex14문자열내p와y의개수 {
	
	static boolean solution(String s) {
		
		int count = 0;
        for(int i=0;i<s.length();i++) {
        	if(Character.toLowerCase(s.charAt(i))=='p')
        		count++;
        	else if (Character.toLowerCase(s.charAt(i))=='y')
        		count--;
        }
//        return (count==0)?true:false;
        return count==0; //이것만 해줘도 됨
    }

	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));

	}

}
