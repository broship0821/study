package ex02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2 {
     public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set.stream());
        int[] a = {};
        //set.stream().sorted().mapToInt(Integer::intValue).toArray()

        return a;
    }
     
     public static void main(String[] args) {
 		int[] numbers = {2,5,3,4,1,7,9};
 		int[] solutions = solution(numbers);
 		System.out.println(Arrays.toString(solutions));

 	}
}