package com.google.sawon.service;

import java.sql.SQLException;

import com.google.sawon.vo.LoginVO;

public interface LoginService {
	//회원가입 insert
	public void signUp(LoginVO vo) throws SQLException;
	//로그인 select
	public int login(LoginVO vo) throws SQLException;
	//회원탈퇴 delete
	public void signOut(LoginVO vo) throws SQLException;
}
