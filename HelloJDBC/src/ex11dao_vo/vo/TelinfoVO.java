package ex11dao_vo.vo;

import java.util.Date;

public class TelinfoVO {
	//DTO: Data Transfer Object, VO: value object
	private int id; //id NUMBER(5)
	private String name; //name VARCHAR2(20)
	private String tel; //tel VARCHAR2(20)
	private Date d; //d DATE
	
	public TelinfoVO() {}

	public TelinfoVO(int id, String name, String tel, Date d) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.d = d;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}
	
	
	
	
}
