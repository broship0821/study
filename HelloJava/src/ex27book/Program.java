package ex27book;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 책 이름을 배열에 넣은 후 java 책을 모두 검색하는 순차검색 프로그램을 작성하시오
		 (자바 책이 있을 경우 결과:
		 	java programming
		 	easy java programming
		 	Master of JAVA
		 	C Language and java
		 	Oracle and Java-jdbc
		 	)
		 (자바 책이 없을 경우)
		 검색하신 책은 재고가 없습니다.
		 
		 */
		
		String[] books = {"java programming", "c# programming", "easy java programming",
				"Master of JAVA", "C Language and java", "power Builder", "Oracle and Java-jdbc"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색: ");
		String str = sc.nextLine();
		int count = 0;
		
		for (int i = 0; i < books.length; i++) {
			//indexOf 에서 없으면 >=0 이나 !=-1 로 물어봐도 됨
			if(books[i].toLowerCase().indexOf(str.toLowerCase())>=0) {
				System.out.println(books[i]);
				count++;
			}
		}
		System.out.printf("총 %d권\n", count);
		if(count==0) System.out.println("검색하신 책은 재고가 없습니다.");

	}

}
