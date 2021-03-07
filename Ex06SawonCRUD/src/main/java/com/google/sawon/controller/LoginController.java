package com.google.sawon.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.sawon.service.LoginService;
import com.google.sawon.vo.LoginVO;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	@PostMapping("/login.do")
	public String login(LoginVO vo) throws SQLException {
		int result = service.login(vo);
		if(result==1) return "sawonGetAllTelinfo";
		else return "redirect:main.jsp";//되려나?
	}
	
	//signup은 signup.jsp로 보내서 양식 입력하게 하고, 그리고 .do 요청받아서 처리해야됨
	//signout은 사원정보에서 회원탈퇴버튼 만들고, 거기서 jsp로 보내고 거기서 양식입력후 .do 처리
}
