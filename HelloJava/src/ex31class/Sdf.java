package ex31class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf {

	public static void main(String[] args) {
		Date d3 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss");
		System.out.println(sdf.format(d3));
		
		// 자바 날짜 -> sql 날짜 (import 선언은 java.util만 한다)
		Date d1 = new Date();
		java.sql.Date s1 = new java.sql.Date(d1.getTime());
		System.out.println(d1);
		System.out.println(s1); //sql에서 Date 의미는 only 날짜만
		
		// sql 날짜 -> 자바 날짜
		Date d2 = new Date(s1.getTime());
		System.out.println(d2);
		
		
	}

}
