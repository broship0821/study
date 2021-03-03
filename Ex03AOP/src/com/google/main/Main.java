package com.google.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.aop.HelloProcess;
import com.google.config.AOPConfig;

public class Main {

	public static void main(String[] args) {
		System.out.println("---메인 시작---");
		//자바컨피그로 해볼려는데 @Aspect 가 ioc에 안올라가는듯
//		ApplicationContext ac = new ClassPathXmlApplicationContext("AOPContext.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AOPConfig.class);
		
		HelloProcess process = ac.getBean("helloProcessBean", HelloProcess.class);
		process.kajaDrive();
		process.kajaDrive();
		process.kajaTravel();
		process.kajaTravel();

	}

}
