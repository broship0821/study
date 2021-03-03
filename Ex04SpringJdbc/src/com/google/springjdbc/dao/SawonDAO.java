package com.google.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.google.springjdbc.vo.SawonVO;

public class SawonDAO {
	private ArrayList<Object> list;
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public ArrayList<Object> selectAll(){
		StringBuffer sql = new StringBuffer();
		sql.append("select name, tel from teltable");
		
		list = (ArrayList<Object>)getJt().query(sql.toString(), new RowMapper<Object>() {
			@Override
			public Object mapRow(ResultSet rs, int joolBun) throws SQLException {
				SawonVO sv = new SawonVO();
				System.out.println("줄번호: "+joolBun);
				sv.setName(rs.getString("name"));
				sv.setTel(rs.getString("tel"));
				return sv;
			}
		});
		System.out.println("자료 총 개수: "+kajaSoo());
		return list;
	}
	
	public int kajaSoo() {
		int num = jt.queryForObject("select count(name) from teltable", Integer.class);
		return num;
	}
	/*
	queryFor...() 는 하나의 반환값만 처리(if(rs.next))
	query() 여러개 가능(while(rs.next))
	 */
}
