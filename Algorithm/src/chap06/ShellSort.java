package chap06;

import java.util.Arrays;

public class ShellSort {
	
	static void shellSort(int[] a, int n) {
		int count = 0;
		for(int h = n/2;h>0;h/=2) {
			for(int i=h;i<n;i++) {
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j]>tmp;j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void shellSort2(int[] a, int n) {
		int count = 0;
		int h;
		for(h=1;h<n/9;h=h*3+1);
		
		for(;h>0;h/=3) {
			for(int i=h;i<n;i++) {
				int j;
				int tmp = a[i];
				for(j=i-h;j>=0 && a[j]>tmp;j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] a = {22,5,11,32,120,68,70,6,36,62,98,11,25,2,643,463,2323,436,362,923,31,46,82};
		System.out.println(Arrays.toString(a));
		shellSort(a, a.length);
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------");
		int[] b = {22,5,11,32,120,68,70,6,36,62,98,11,25,2,643,463,2323,436,362,923,31,46,82};
		System.out.println(Arrays.toString(b));
		shellSort2(b, b.length);
		System.out.println(Arrays.toString(b));

	}

}
