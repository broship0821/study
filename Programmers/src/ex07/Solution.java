package ex07;
//2016년

public class Solution {
	
	public static String solution(int a, int b) {
		
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int day = 0;
		for(int i=0;i<a-1;i++) {
			day += month[i];
		}
		day+=b;
		
		String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
        String answer = week[(day%7+4)%7];
        return answer;
    }

	public static void main(String[] args) {
		solution(5, 24);

	}

}
