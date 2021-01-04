package ex06multiuser2;

import java.util.Arrays;

public class Test {
	
	public static void test(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
	}
	
	public static void test2(int a) {
		a += 1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		test(arr);
		System.out.println(Arrays.toString(arr));
		//arr 변경됨
		/*
		 위에는 참조형 변수라 값이 복사되서 가는게 아니라 해당 객체를 참조하고 있는 포인터만 감
		 그래서 해당 객체를 수정하면 해당 객체가 수정이 됨
		 아래는 기본형 변수라 값이 복사되서 감, 그래서 해당 변수를 수정해도 원래 있던 변수는 수정되지 않음
		 기본형 변수: char, double, float, long, int, short, byte, boolean
		 */
		
		int a = 10;
		System.out.println(a);
		test2(a);
		System.out.println(a);
		//a변경되지 않음

	}

}
