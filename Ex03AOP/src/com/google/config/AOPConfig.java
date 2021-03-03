package com.google.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.google.aop.HelloProcess;
import com.google.aop.Security;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
	@Bean
	public Security securityBean() {
		return new Security();
	}
	
	@Bean
	public HelloProcess helloProcessBean() {
		return new HelloProcess();
	}
}
