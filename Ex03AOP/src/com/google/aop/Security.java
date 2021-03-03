package com.google.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect//이게 있어야 aop기능으로써 IoC 컨테이너에 올라감
public class Security {
	
	@Pointcut("execution(* com.google.aop..*())")
	private void anythingYouWant() {
		//포인트컷을 위해 만든 내용, 이름은 아무거나 써도 되고 아무 내용 없음
		//<aop:pointcut expression="within(com.google.aop.HelloProcess)" id="secuPoint"/>
		//단순히 이 내용만을 처리함
	}
	
	@Before("anythingYouWant()")
	public void goSecurity() {//aspect 처리에 들어갈 공통 메소드
		//여기에 보안 검사하는 로직 구현
		System.out.println("공통: 여기는 before 보안 처리중~~~");
	}
	//-------------------------------------------
	
	@Pointcut("execution(* com.google.aop..*())")
	private void gamehaja() {}
	
	@After("gamehaja()")
	public void goSecurity2() {
		System.out.println("공통: 여기는 after 보안 처리중~~~");
	}
	
}
