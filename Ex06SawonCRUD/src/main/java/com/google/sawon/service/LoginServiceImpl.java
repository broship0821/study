package com.google.sawon.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.sawon.dao.LoginDAO;
import com.google.sawon.vo.LoginVO;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO dao;
	
	@Override
	public void signUp(LoginVO vo) throws SQLException {
		dao.signUp(vo);
	}

	@Override
	public int login(LoginVO vo) throws SQLException {
		int result = dao.login(vo);
		return result;
	}

	@Override
	public void signOut(LoginVO vo) throws SQLException {
		dao.signOut(vo);
	}

}
