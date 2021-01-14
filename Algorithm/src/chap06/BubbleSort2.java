package chap06;

import java.util.Arrays;

public class BubbleSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//알고리즘 개선1, 중간에 한번도 교환이 일어나지 않으면 반복문 종료
	static void bubbleSort2(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int exchg = 0;
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					exchg++; //한번이라도 교환이 일어남
				}
			}
			if(exchg==0) break; //한번이라도 교환이 일어나지 않으면 종료
		}
	}
	static void bubbleSortDetail(int[] a, int n) {
		int bijiao = 0;
		int jiaohuan = 0;
		
		for(int i=0;i<n-1;i++) {
			int exchg = 0;
			System.out.println("패스" + (i+1));
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j]) {
					for(int k=0;k<n;k++) {
						if(k==j) {
							System.out.printf("%s%d ", "+", a[k]);
							jiaohuan++;
						}
						else
							System.out.printf(" %d ", a[k]);
					}
					System.out.println();
					swap(a, j-1, j);
					exchg++;
				} else {
					for(int k=0;k<n;k++) {
						if(k==j)
							System.out.printf("%s%d ", "-", a[k]);
						else
							System.out.printf(" %d ", a[k]);
					}
					System.out.println();
				}
				bijiao++;
			}
			for(int k=0;k<n;k++) {
				System.out.printf(" %d ", a[k]);
			}
			System.out.println();
			if(exchg==0) break;
		}
		
		System.out.println("비교: " + bijiao);
		System.out.println("교환: " + jiaohuan);
	}

	public static void main(String[] args) {
		int[] a = {1,3,4,6,7,8,9};
		System.out.println(Arrays.toString(a));
		bubbleSortDetail(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
