package chap06;

import java.util.Arrays;

public class InsertionSort {
	
	//단순 삽입 정렬
	static void insertionSort(int[] a, int n) {
		for(int i=1;i<n;i++) {
			int j;
			int tmp = a[i];//배열의 두번째부터 값을 임시저장
			for(j=i;j>0 && a[j-1]>tmp;j--) {//임시저장한 값 왼쪽을 하나씩 살핌,일단 오른쪽으로 한칸 옮기고, 값이 작으면 거기에 임시 저장한 값 삽입
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	//이건 보초법(배열 맨 앞을 비워둠)을 사용한것, 이게 반복문 끝나는 조건을 줄일 수 있음
	/* static void insertionSort(int[] a, int n) {
		for (int i = 2; i < n; i++) {
			int tmp = a[0] = a[i]; //보초에다가 현재값 삽입
			int j = i;
			for (; a[j - 1] > tmp; j--) {
				a[j] = a[j - 1]; //지금 기준부터 배열의 맨 왼쪽까지 돌면서 값이 작으면 값을 오른쪽으로 땡김, 값이 클경우 반복문 멈춤
				System.out.println(a[0]);
			}
			if (j > 0) //위에 반복문이 끝까지 다 안돌았다면 그 위치에 삽입
				a[j] = tmp;
		}
	}*/
	
	public static void main(String[] args) {
		int[] a = {6,4,3,7,1,9,8};
		System.out.println(Arrays.toString(a));
		insertionSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
