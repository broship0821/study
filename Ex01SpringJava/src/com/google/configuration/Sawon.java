package com.google.configuration;

public class Sawon {
	private int id;
	private String name;
	private String hobby;
	
	public Sawon() {}

	public Sawon(int id, String name, String hobby) {
		this.id = id;
		this.name = name;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "사원의 id는 " + id + ",사원이름은 " + name + " 이라는~~~\n나의 취미는 " + hobby + "라는~~~";
	}
	
	
	
}
