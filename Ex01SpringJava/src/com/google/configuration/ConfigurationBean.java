package com.google.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
	
	@Bean
	public Insa insaBean() {
		return new Insa("홍길동");
	}
	/*
	 이렇게 하면 해당 객체가 insaBean이라는 이름으로 IoC 컨테이너에 올라감
	 반환 타입이 객체 타입
	 */
	
	@Bean
	public Sawon s1() {
		Sawon s1 = new Sawon(130, "이미래", "축구");
		return s1;
	}
	
	@Bean
	public AljaHobbyClass aljaBean() {
		return new AljaHobbyClass(s1());//위에서 IoC 컨테이너에 생성한 s1객체를 인젝션 하는방법... 함수를 쓰면된다... 신기...
	}
}
