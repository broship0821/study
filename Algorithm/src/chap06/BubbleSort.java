package chap06;

import java.util.Arrays;

public class BubbleSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//j내림차순
	static void bubbleSort1(int[] a, int n) {
		for(int i=0;i<n-1;i++)
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j])
					swap(a, j-1, j);
	}
	//j오름차순
	static void bubbleSort2(int[] a, int n) {
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1-i;j++)
				if(a[j]>a[j+1])
					swap(a, j, j+1);
	}
	
	// 단순교환정렬
	static void bubbleSort22(int[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) // 머리→꼬리로로 스캔
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}
	}	
	
	static void bubbleSortDetail(int[] a, int n) {
		int bijiao = 0;
		int jiaohuan = 0;
		
		for(int i=0;i<n-1;i++) {
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
		}
		
		System.out.println("비교: " + bijiao);
		System.out.println("교환: " + jiaohuan);
	}
	
	static void bubbleSortDetail2(int[] a, int n) {
		int bijiao = 0;
		int jiaohuan = 0;
		
		for(int i=0;i<n-1;i++) {
			System.out.println("패스" + (i+1));
			for(int j=n-1;j>i;j--) {
				for(int k=0;k<n;k++) {
					if(k==j)
						System.out.printf("%s%d ", (a[j-1]>a[j])?"+":"-", a[k]);
					else
						System.out.printf(" %d ", a[k]);
				}
				System.out.println();
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					jiaohuan++;
				}
				bijiao++;
			}
			for(int k=0;k<n;k++) {
				System.out.printf(" %d ", a[k]);
			}
			System.out.println();
		}
		
		System.out.println("비교: " + bijiao);
		System.out.println("교환: " + jiaohuan);
	}

	public static void main(String[] args) {
		int[] a = {6,4,3,7,1,9,8};
		System.out.println(Arrays.toString(a));
		bubbleSortDetail2(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
