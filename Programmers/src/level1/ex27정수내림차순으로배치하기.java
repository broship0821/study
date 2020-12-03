package level1;

import java.util.ArrayList;
import java.util.Collections;

public class ex27정수내림차순으로배치하기 {
	
	public static long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        while(n>0) {
        	list.add(n%10);
        	n /= 10;
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        for(int i=0;i<list.size();i++) {
        	answer += list.get(list.size()-1-i) * Math.pow(10, i);
        }
        System.out.println(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		solution(118372);

	}

}
