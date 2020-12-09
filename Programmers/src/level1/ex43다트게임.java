package level1;

import java.util.Arrays;

public class ex43다트게임 {
	
	public static int solution(String dartResult) {
		int[] s = new int[3];
		int idx = 0;
		
		char[] c = dartResult.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			switch(c[i]) {
				case '1':
					if(i+1<c.length && c[i+1]=='0') {//점수가 10점일경우
						s[idx++] = 10;
						i++;
						break;
					}
				case '0': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
					s[idx++] = c[i]-48;
					break;
				
				case 'D': s[idx-1] = (int)Math.pow(s[idx-1], 2); break;
				case 'T': s[idx-1] = (int)Math.pow(s[idx-1], 3); break;
				
				case '*': 
					s[idx-1] *= 2;
					if(idx-2>=0) s[idx-2] *= 2;
					break;
				case '#': s[idx-1] *= -1; break;
					
			
				
			}
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(s));
		
        System.out.println(s[0] + s[1] + s[2]);
        return s[0] + s[1] + s[2];
    }

	public static void main(String[] args) {
		
		solution("1S*2T*3S");

	}

}
