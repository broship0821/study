package chap06;

import java.util.Arrays;

public class HeapSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap(int[]a, int left, int right) {
		int tmp = a[left];
		int child;
		int parent;
		
		for(parent = left;parent<(right+1);parent=child) {
			int cl = parent*2 +1; //왼쪽자식
			int cr = cl + 1; //오른쪽자식
			child = (cr<=right && a[cr]>a[cl])?cr:cl; //큰값을 가진 노드를 자식에 대입
			if(tmp>=a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = tmp;
	}
	
	static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2;i>=0;i--)
			downHeap(a, i, n-1);
		for(int i=n-1;i>0;i--) {
			swap(a,0,i);
			downHeap(a, 0, i-1);
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {6,4,8,3,1,9,7};
		System.out.println(Arrays.toString(a));
		heapSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
}
