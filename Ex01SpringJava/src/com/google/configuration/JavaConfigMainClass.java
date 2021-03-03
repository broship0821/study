package com.google.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMainClass {

	public static void main(String[] args) {
		System.out.println("안녕");
		String str = "Hood";
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		Insa insaVO = ac.getBean("insaBean", Insa.class);
		System.out.println(insaVO.helloName(str));
		//-------------------여기부터 사원 예시----------------
		Sawon s1 = ac.getBean("s1",Sawon.class);
		System.out.println(s1);
		
		AljaHobbyClass alja = ac.getBean("aljaBean", AljaHobbyClass.class);
		System.out.println(alja.toString());
		System.out.println(alja.getSawon().getHobby());
		
	}

}
