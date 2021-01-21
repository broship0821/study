package chap06;

public class Partition {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//배열 나누기
	static void partition(int[]a, int n) {
		int pl = 0; //왼쪽커서, 맨 좌측에서 시작
		int pr = n-1; //우측커서, 맨 우측에서 시작
		int x = a[n/2]; //피벗, 가운데 위치한 기준값
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		} while (pl<=pr);
		
		System.out.println("피벗: "+x);
		
		System.out.println("피벗 이하 그룹(왼쪽)");
		for(int i=0;i<pl;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1;i<pl;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		
		System.out.println("피벗 이상 그룹(오른쪽)");
		for(int i=pr+1;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		partition(arr, arr.length);

	}

}
