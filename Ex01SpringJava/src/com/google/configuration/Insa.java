package com.google.configuration;

public class Insa {
	private String name;
	
	public Insa() {}
	public Insa(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Insa [name=" + name + "]";
	}
	
	public String helloName(String s) {
		return "hello "+s;
	}
}
