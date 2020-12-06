package level1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ex41비밀지도 {
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] s1 = new String[n];
		String[] s2 = new String[n];
		String deciFormat = new String(new char[n]).replace("\0", "0");
		DecimalFormat df = new DecimalFormat(deciFormat);
		
		for(int i=0;i<n;i++) {
			s1[i] = df.format(Integer.parseInt(Integer.toBinaryString(arr1[i])));
			s2[i] = df.format(Integer.parseInt(Integer.toBinaryString(arr2[i])));
		}
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		
		
        String[] answer = new String[n];
        for(int i=0;i<n;i++) {
        	answer[i] = "";
        	for(int j=0;j<n;j++) {
        		if(s1[i].charAt(j)=='1' || s2[i].charAt(j)=='1')
        			answer[i] += "#";
        		else
        			answer[i] += " ";
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		solution(n, arr1, arr2);

	}

}
