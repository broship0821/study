package ex01;
//완주하지 못한 선수

import java.util.Arrays;

class Solution {
	public static String solution(String[] participant, String[] completion) {
    	String answer = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	int pSize = participant.length;
    	int cSize = completion.length;
    	for(int i=0;i<cSize;i++) {
    		if(!participant[i].equals(completion[i])) {
    			return participant[i];
    		}
    	}
    	
		return participant[pSize-1];
	}
    
    public static void main(String[] args) {
//    	String[] participant = {"leo", "kiki", "eden"};
//    	String[] completion = {"eden", "kiki"};
//    	String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//    	String[] completion = {"josipa", "filipa", "marina", "nikola"};
    	String[] participant = {"ana", "stanko", "mislav", "mislav"};
    	String[] completion = {"mislav", "stanko", "ana"};
    	
    	String result = solution(participant, completion);
    	System.out.println(result);
    	
	}
    
}
