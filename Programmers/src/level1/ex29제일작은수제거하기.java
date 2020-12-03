package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex29제일작은수제거하기 {
	
	public static ArrayList<Integer> solution(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println(min);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==min)
				arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(i!=0)
				list.add(i);
		}
		System.out.println(list);
		if(list.size()==0)
			list.add(-1);
        return list;
    }

	public static void main(String[] args) {
		int[] arr = {10};
		solution(arr);

	}

}
