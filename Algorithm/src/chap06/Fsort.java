package chap06;

import java.util.Arrays;

//도수정렬 정렬인데 조건문이 필요없음, max값을 알고 있어야됨
public class Fsort {
	static void fSort(int[]a, int n, int max) {
		int[] f = new int[max+1]; //누적 도수
		int[] b = new int[n]; //작업용 목적배열(여기에 일단 담은 후 원 배열에 옮김)
		
		for(int i=0;i<n;i++)
			f[a[i]]++; //도수분포표 만들기
		for(int i=1;i<=max;i++)
			f[i] += f[i-1]; //누적도수분포표 만들기
		for(int i=n-1;i>=0;i--)
			b[--f[a[i]]] = a[i]; //목적배열 만들기
		for(int i=0;i<n;i++)
			a[i] = b[i]; //배열 복사하기
	}
	
	public static void main(String[] args) {
		int[] a = {6,4,8,3,1,9,7,2,5};
		System.out.println(Arrays.toString(a));
		//max를 먼저 구해야됨
		int max = a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max = a[i];
		fSort(a, a.length, max);
		System.out.println(Arrays.toString(a));

	}
}
