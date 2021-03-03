package com.google.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bangka.Bangka1;
import com.google.bangka.Bangka2;

//결합도가 낮은 경우
public class Hello2 {

	public static void main(String[] args) {
		/*
		 스프링은 POJO 기반
		 bean: spring 이 관리하는 인스턴스
		 ApplicationContext -> bean container = bean을 관리
		 */
		//임포트는 apache가 아니라 springframework
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//여기 설정되어 있는 설정 파일을 가져다가 쓰겠다
		
		//두 방법 다 됨
//		Bangka1 b1 = (Bangka1)context.getBean("b1");
//		//Bangka1 b1 = context.getBean(Bangka1.class);
//		b1.bangkabangka1("피터팬");

//		Bangka2 b2 = context.getBean(Bangka2.class);
//		b2.bangkabangka2("머머리");
		
		//싱글톤인지 체크
//		System.out.println(b1);
//		Bangka1 b3 = (Bangka1)context.getBean("b1");
//		System.out.println(b3);
//		System.out.println(b1+" "+b3);
		
		//프로토타입
//		Bangka2 b4 = (Bangka2)context.getBean("b4");
//		Bangka2 b5 = (Bangka2)context.getBean("b4");
//		System.out.println(b4);
//		System.out.println(b5);
		
		//사원
		Sawon sw1 = context.getBean("s1", Sawon.class);
		sw1.setId(3);
		sw1.setName("연수");
		System.out.println(sw1);
		
		Sawon sw2 = context.getBean("s1", Sawon.class);
		sw2.setId(5);
		sw2.setName("태식");
		System.out.println(sw2+" "+sw2);//이때 sw1로 해도 sw2로 바뀜
		
		Sawon sw3 = context.getBean("s1", Sawon.class);
		sw3.setId(7);
		sw3.setName("수빈");
		System.out.println(sw1+" "+sw2+" "+sw3);
		
		//마지막으로 싱글톤 체크
		Sawon ss1 = context.getBean("s1", Sawon.class);
		ss1.setId(1);
		ss1.setName("a");
		Sawon ss2 = context.getBean("s2", Sawon.class);
		ss2.setId(2);
		ss2.setName("b");
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss1==ss2);

	}

}
