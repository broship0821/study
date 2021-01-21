package chap06;

import java.util.Arrays;

//병합정렬, 안정적임
public class MergeSort {
	static int[] buff; //작업용 배열
	
	static void _mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int center = (left+right)/2;
			int p = 0;
			int j = 0;
			int k = left;
			//우선 다 쪼개서 가장 2개일때부터 병합 정렬 시작
			_mergeSort(a, left, center);
			_mergeSort(a, center+1, right);
			//반으로 나눈걸 버퍼에 잠시 담아놈
			for(i=left;i<=center;i++)
				buff[p++] = a[i];
			//버퍼와 a 배열을 비교하면서 a 배열에 채워놓음
			while(i<=right && j<p)
				a[k++] = (buff[j]<=a[i]) ? buff[j++] : a[i++];
			//만약 버퍼에 남은게 있다면 a 배열에 집어넣음
			while(j<p)
				a[k++] = buff[j++];
		}
	}
	/*
	 기본 자료형의 정렬은 퀵 정렬을 개선한것, 안정적이지 않음
	 객체 배열의 정렬은 병합 정렬을 개선한것, 안정적임
	 */
	
	static void mergeSort(int[] a, int n) {
		buff = new int[n];
		
		_mergeSort(a, 0, n-1);
		
		buff = null;
	}
	
	public static void main(String[] args) {
		int[] a = {22,5,11,32,120,68,70,42,15,96,50};
		System.out.println(Arrays.toString(a));
		mergeSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}
}
