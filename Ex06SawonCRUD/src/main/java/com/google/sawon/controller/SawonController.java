package com.google.sawon.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.sawon.service.TelInfoService;
import com.google.sawon.vo.TelInfoVO;

@Controller
public class SawonController {
	@Autowired
	private TelInfoService service;
	
	@GetMapping("/getAllTelinfo.do")//매개변수의 vo는 전달되는게 없어도(null)이어도 오류 안남, 만약 int 같은 값이였으면 에러남, vo는 객체라 그런듯
	public String sawonGetAllTelinfo(TelInfoVO vo, Model model) throws ClassNotFoundException,SQLException{
		model.addAttribute("mAllTelinfo", service.getAllTelinfo(vo));
		return "sawonGetAllTelinfo";
	}
	
	@GetMapping("/getTelinfo.do")
	public String sawonGetTelinfo(TelInfoVO vo, Model model) throws ClassNotFoundException,SQLException{
		model.addAttribute("mTelinfo", service.getTelinfo(vo));
		return "sawonGetTelinfo";
	}
	
	@GetMapping("/deleteTelinfo.do")
	public String sawonDeleteTelinfo(TelInfoVO vo) throws ClassNotFoundException,SQLException{
		service.deleteTelinfo(vo);
		return "redirect:getAllTelinfo.do";
	}
	
	@PostMapping("/updateTelinfo.do")
	public String sawonUpdateTelinfo(TelInfoVO vo) throws ClassNotFoundException,SQLException{
		service.updateTelinfo(vo);
		return "redirect:getAllTelinfo.do";
	}
	
	@PostMapping("/insertTelinfo.do")
	public String sawonInsertTelinfo(TelInfoVO vo) throws ClassNotFoundException,SQLException{
		service.insertTelinfo(vo);
		return "redirect:getAllTelinfo.do";
	}
}
