package mybang;

import java.util.Date;

//import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		Date d1 = new Date(); //ctrl + shift + o 로 전체 임포트 가능
		
		System.out.println(d1.toLocaleString()); //화면출력명령
		System.out.println(d1);
		//toLocaleString(): 한국어로 출력
		
		/*
		 여러줄 주석 ctrl + shift + /
		 주석 풀기  ctrl + shift + \
		*/

	}

}
