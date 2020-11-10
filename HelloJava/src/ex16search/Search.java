package ex16search;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		int[] arr = {11, 84, 45, 78, 34, 9, 2};
		//순차검색 평균 (n+1) /2 번 검색
		System.out.println(Arrays.toString(arr));
		int sw = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==78) {
				System.out.println(i+"번째에 있음");
				sw=1;
			}
		}
		if(sw==0) System.out.println("없음");
		
		//이진검색 binary search 평균 log2N + 1 번 검색
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		if(Arrays.binarySearch(arr, 100)>=0) {
			System.out.println("78은" + Arrays.binarySearch(arr, 100) + "번째에 있음");
			
		} else {
			System.out.println("없음");
		}
		
		

	}

}
