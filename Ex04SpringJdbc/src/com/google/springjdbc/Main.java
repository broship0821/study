package com.google.springjdbc;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.google.springjdbc.dao.SawonDAO;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("springJDBCContext.xml");
		SawonDAO dao = ac.getBean("sawonDAOBean", SawonDAO.class);
		ArrayList<Object> list = dao.selectAll();
		System.out.println(list);

	}

}
