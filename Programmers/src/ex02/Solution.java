package ex02;
//두 개 뽑아서 더하기

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	public static int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		int size = numbers.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
//		System.out.println(set);
		int[] answer = new int[set.size()];
		
		Iterator<Integer> it = set.iterator();
		int i = 0;
		while(it.hasNext()) {
			answer[i++] = it.next();
		}
		Arrays.sort(answer);
		
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] solutions = solution(numbers);
		System.out.println(Arrays.toString(solutions));

	}

}
