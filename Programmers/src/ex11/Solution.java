package ex11;
//나누어 떨어지는 숫자 배열

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	
	public static ArrayList<Integer> solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0)
				list.add(arr[i]);
		}
		if(list.size()==0)
			list.add(-1);
		Collections.sort(list);
		System.out.println(list);
        return list;
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		solution(arr, divisor);
	}
}
