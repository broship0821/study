package com.google.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bangka.Bangka1;
import com.google.bangka.Bangka2;

public class Hello {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//여기 설정되어 있는 설정 파일을 가져다가 쓰겠다
		
		//두 방법 다 됨
		//Bangka1 b1 = (Bangka1)context.getBean("b1");
		Bangka1 b1 = context.getBean(Bangka1.class);
		b1.bangkabangka1("피터팬");

		Bangka2 b2 = context.getBean(Bangka2.class);
		b2.bangkabangka2("머머리");

	}

}
