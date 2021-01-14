package chap06;

import java.util.Arrays;

public class BubbleSort3 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//알고리즘 개선3, 첫번째 패스는 전부다 검색하고 그다음 패스부터는 그 전 패스 마지막 교환 인덱스 까지만 검색
	static void bubbleSort3(int[] a, int n) {
		int k = 0;
		while(k<n-1) {
			int last = n-1;
			for(int j=n-1;j>k;j--) { //처음엔 0이라 다 검색하고 그담부턴 마지막 교환한 위치까지만 검색
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					last = j;
				}
			}
			k = last;//마지막으로 요소를 교환한 위치
		}
	}
	static void bubbleSortDetail(int[] a, int n) {
		int bijiao = 0;
		int jiaohuan = 0;
		
		int k = 0;
		int i = 0;
		while(k<n-1) {
			System.out.println("패스" + (++i));
			int last = n-1;
			for(int j=n-1;j>k;j--) {
				for(int m=0;m<n;m++) {
					if(m==j)
						System.out.printf("%s%d ", (a[j-1]>a[j])?"+":"-", a[m]);
					else
						System.out.printf(" %d ", a[m]);
				}
				System.out.println();
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					last = j;
					jiaohuan++;
				}
				bijiao++;
			}
			k = last;
		}
		
		System.out.println("비교: " + bijiao);
		System.out.println("교환: " + jiaohuan);
	}
	
	//Q5 홀수는 작은걸 앞으로 짝수는 큰걸 뒤로
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			System.out.println("반복1회");
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	public static void main(String[] args) {
		int[] a = {9,1,3,4,6,7,8};
		System.out.println(Arrays.toString(a));
		shakerSort(a, a.length);
		System.out.println(Arrays.toString(a));

	}

}
