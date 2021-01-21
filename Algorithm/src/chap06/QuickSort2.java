package chap06;

import java.util.Arrays;

import chap04.IntStack;

public class QuickSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열 나누기
	static void quickSort(int[]a, int left, int right) {
		IntStack lstack = new IntStack(a.length);
		IntStack rstack = new IntStack(a.length);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty()!=true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(pl+pr)/2];
			
			do {
				while(a[pl]<x) pl++;
				while(a[pr]>x) pr--;
				if(pl<=pr)
					swap(a, pl++, pr--);
			} while (pl<=pr);
			
			if(pl<right) {
				lstack.push(pl);
				rstack.push(right);
			}
			if(left<pr) {
				lstack.push(left);
				rstack.push(pr);
			}
		}
		
	}
	
	static void quickSort(int[]a, int n) {
		quickSort(a, 0, n-1);
	}

	public static void main(String[] args) {
		int[] a = {5,8,4,2,6,1,3,9,7};
		System.out.println(Arrays.toString(a));
		quickSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
