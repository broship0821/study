package chap06;

import java.util.Arrays;

public class BubbleSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort1(int[] a, int n) {
		for(int i=0;i<n-1;i++)
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j])
					swap(a, j-1, j);
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

	public static void main(String[] args) {
		int[] a = {6,4,3,7,1,9,8};
		System.out.println(Arrays.toString(a));
		bubbleSortDetail(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
