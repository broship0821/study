package com.google.springjdbc.vo;

public class SawonVO {
	private String name;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "SawonVO [name=" + name + ", tel=" + tel + "]";
	}
	
}
