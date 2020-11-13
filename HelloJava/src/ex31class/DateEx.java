package ex31class;

import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		/*
		 클래스
		 	1) 사용자 정의 클래스 (user defined class)
		 		설계(정의) - 제작(new, 생성) - 사용 		3단계
		 	
		 	2) 내장 클래스
		 		Scanner, System, Date 등
		 		자바 내장클래스는 1단계(설계)가 생략됨
		 		자바스크립트 -> window.location="http://www.naver.com"
		 		자바스크립트는 2단계 까지 자동(생성 없이 바로 사용)
		 */
		
		Date d1 = new Date();
		System.out.println(d1);
		
		System.out.println(d1.toLocaleString());
		//출력: 오늘은 X년이고 X월이며 X일이다. (내장 메소드 사용)
		
		String[] zhou = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은" + (d1.getYear()+1900) + "년이고" + (d1.getMonth()+1) + "월이며"
				+ d1.getDate() + "일이다. 요일은" + zhou[d1.getDay()] + "요일"
				);
		
		
		//Q: 오늘부터 만난지 100일 되는 날 출력하기
		
		System.out.println("-------------------");
//		d1.setDate(99);
		d1.setDate(d1.getDate()+100-1); //그냥 100을 더하면 숫자만 더함, 오늘 날짜랑 같이 더해야 오늘부터 100일 후가 나옴
		System.out.println(d1.toLocaleString());
		
		
		
		
		System.out.println("-------------------");
		//살아온 날짜 수 계산하기
		Date d100 = new Date(1000L); //1000L : 1초 -> 기준점으로부터 1초 지난 시간
		System.out.println(d100.toLocaleString());
		System.out.println(d100.toGMTString()); //기준점(영국시간)
		
		Date myBirthDay = new Date(1995-1900, 8-1, 21);
		Date today = new Date();
		System.out.println("내 생일: " + myBirthDay.toLocaleString());
		System.out.println("오늘: " + today.toLocaleString());
		Double l = (today.getTime() - myBirthDay.getTime())/1000.0/3600/24;
		System.out.println("내가 산 날: " + l);
		
		
		
		
		
		
		
		
		

	}

}
