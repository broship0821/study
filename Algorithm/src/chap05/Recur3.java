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
	
	static void recur2(int n) {
		IntStack s = new IntStack(4);
		while(true) {
			s.push(n);
		}
	}

	public static void main(String[] args) {
		recur(4);
		System.out.println("------");
		recur2(4);
	}

}
