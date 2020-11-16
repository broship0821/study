package ex33collection;

import java.util.ArrayList;

public class CollectionEx {

	public static void main(String[] args) {
		/*
		 Array vs Collection
		 
		 Array: 고정길이배열, 상대적으로 처리속도가 빠르다, one data type
		 		int[] arr = new int[100];
		 		ex) 아래 내용을 기억하려면
		 		이름		점수
		 		홍길동	100
		 		이도령	98
		 		성춘향	100
		 		
		 String[] name 배열 100개
		 int[] score 배열 100개 잡아야됨
		 
		 
		 Collection: 가변길이배열, 상대적으로 처리속도가 늦다, multi data type(정수 실수 문자 문자열....)
		 종류: 	set
		 		list	--> ArrayList, vector
		 		map
		 
		 ------------------------------------------------------------------------------------
		 
		 Wrapper:
		 스텍              힙
		 int vs Integer(클래스화)
		 int 는 null 사용 X, Integer는 O
		 int 는 연산 O, Integer는 unboxing 해야 산술연산 O
		 sql의 null과 연동시 Integer와 연동
		 
		 참고) Integer.parserInt() vs Integer.valueOf()
		 		int값 반환, 연산O			Integer반환, 연산X
 		 
		 */
		
		int aa = 30;
		Integer bb = aa; //auto boxing
		int cc = bb; //auto unboxing
		
		//ArrayList 는 배열처럼 인덱스 개념이 있음, 집어널때 add() 뺄때 get()
		ArrayList arr1 = new ArrayList(); 
		System.out.println(arr1.size()); //가변길이
		
		//multi data
		arr1.add(new Integer(300));
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("ondal"));
		
		System.out.println(arr1);
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
