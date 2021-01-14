package chap06;

import java.util.Arrays;

public class SelectionSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//단순 선택 정렬(비안정적)
	static void selectionSort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {//i를 제외한 나머지 배열중 가장 작은 값을 찾기
				if(a[j]<a[min])
					min = j;
			}
			swap(a, i, min);//지금 값이랑 가장 작은 값이랑 교환
		}
	}
	
	public static void main(String[] args) {
		int[] a = {6,4,3,7,1,9,8};
		System.out.println(Arrays.toString(a));
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
