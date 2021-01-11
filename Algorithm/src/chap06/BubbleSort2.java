package chap06;

import java.util.Arrays;

public class BubbleSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort1(int[] a, int n) {
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1-i;j++)
				if(a[j]>a[j+1])
					swap(a, j, j+1);
	}
	
	// 단순교환정렬
		static void bubbleSort(int[] a, int n) {
			for (int i = n - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) // 머리→꼬리로로 스캔
					if (a[j] > a[j + 1])
						swap(a, j, j + 1);
			}
		}

	public static void main(String[] args) {
		int[] a = {7,22,5,11,32,120,68,70};
		System.out.println(Arrays.toString(a));
		bubbleSort1(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
