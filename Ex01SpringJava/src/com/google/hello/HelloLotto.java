package com.google.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.lotto.Lotto;

public class HelloLotto {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("LottoContext.xml");
		Lotto l = context.getBean("l",Lotto.class);
		l.lotto();

	}

}
