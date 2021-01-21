package chap06;

import java.util.Arrays;

public class QuickSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열 나누기
	static void quickSort(int[]a, int left, int right) {
		int pl = left; //왼쪽커서, 맨 좌측에서 시작
		int pr = right; //우측커서, 맨 우측에서 시작
		int x = a[(pl+pr)/2]; //피벗, 가운데 위치한 기준값
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		} while (pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
		
	}
	
	static void quickSort(int[]a, int n) {
		quickSort(a, 0, n-1);
	}
	
	static void quickSortDetail(int[]a, int left, int right) {
		int pl = left; //왼쪽커서, 맨 좌측에서 시작
		int pr = right; //우측커서, 맨 우측에서 시작
		int x = a[(pl+pr)/2]; //피벗, 가운데 위치한 기준값
		
		System.out.printf("a[%d]~a[%d]: {", pl, pr);
		for(int i=pl;i<=pr;i++) {
			System.out.printf("%d, ", a[i]);
		}
		System.out.printf("}\n", pl, pr);
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		} while (pl<=pr);
		
		if(left<pr) quickSortDetail(a, left, pr);
		if(pl<right) quickSortDetail(a, pl, right);
		
	}
	
	static void quickSortDetail(int[]a, int n) {
		quickSortDetail(a, 0, n-1);
	}

	public static void main(String[] args) {
		int[] a = {5,8,4,2,6,1,3,9,7};
		System.out.println(Arrays.toString(a));
		quickSortDetail(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
