package ex10;
//같은 숫자는 싫어
import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        for(i=0;i<arr.length-1;i++) {
        	if(arr[i]!=arr[i+1])
        		list.add(arr[i]);
        }
        list.add(arr[i]);
        System.out.println(list);
        
        return list;
    }

	public static void main(String[] args) {
		int[] arr = {4,4,4,3,3};
		solution(arr);

	}

}
