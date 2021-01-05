package chap05;

import chap04.IntStack;

public class Recur3 {
	
	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			recur(n-2);
			System.out.println(n);
		}
	}
	// 메소드 recur의 비재귀적 구현
	static void recur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;
		
		while(true) {
			if(n>0) {
				ptr++;
			}
		}
	}

	public static void main(String[] args) {
		recur(4);
		System.out.println("------");
		recur3(4);
	}

}
