package com.empmanage.sawon;

import java.sql.SQLException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empmanage.sawon.service.SawonService;
import com.empmanage.sawon.vo.SawonVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private SawonService service;

	@GetMapping("/sawonAll.do")
	public String sawonAll(Model model) throws Exception {
		ArrayList<SawonVO> list = service.getAllSawon();
		model.addAttribute("alist", list);
		return "sawonAll";
	}

	@GetMapping("/getTelinfo.do")
	public String sawonGetTelinfo(SawonVO sawonVO, Model model) {
		model.addAttribute("sawonVO", service.getTelinfo(sawonVO.getId()));
		return "sawonGetTelinfo";
	}
	/*
	 * @ModelAttribute가 하는일 sawonVO bean 객체가 만들어지고 , 넘어오는 값은 자동으로 받아 sawonVO객체가
	 * Model을 통해 jsp로 전달됨 jsp에서는 @ModelAttribute("sawonVO") 의 sawonVO를 사용하여
	 * ${sawonVO.getId}로 출력하거나 jstl의 ${sawonVO.id} 로 출력하여 사용함
	 */

	@GetMapping("/sawonInsert.do")
	public String sawonInsertForm(@ModelAttribute("sawonVO") SawonVO sawonVO, Model model) throws Exception {

		return "sawonInsert";
	}

	@PostMapping("/sawonInsert.do")
	public String sawonInsert(@ModelAttribute("sawonVO") SawonVO sawonVO, Model model) {
		System.out.println(service.insertSawon(sawonVO));
		return "redirect:/sawonAll.do";
	}

	/*
	 * @RequestMapping("/") // 사원이름을 클릭했을때 여기로 옴 public String
	 * sawonGetTelinfo(SawonVO sawonVO , Model model1) throws
	 * ClassNotFoundException, SQLException{
	 * model1.addAttribute("mgetTelinfo",sawonService.getTelinfo(sawonVO)); //가져갈
	 * data //한사람에 대한 처리 //return "sawonGetTelinfo.jsp; //view 담당 return
	 * "sawonGetTelinfo;" //sawonGetTelinfo.jsp 로 갈때는 1명의 정보를 객체로 가지고 가야~ }
	 */

	@RequestMapping("/updateTelinfo.do")
	public String sawonUpdate(SawonVO vo, Model model) throws ClassNotFoundException, SQLException {
		System.out.println(service.updateSawon(vo));
		return "redirect:/sawonAll.do";
	}

	@RequestMapping("/deleteTelinfo.do")
	public String sawonDelete(SawonVO vo, Model model) throws ClassNotFoundException, SQLException {
		System.out.println(service.deleteSawon(vo.getId()));
		return "redirect:/sawonAll.do";
	}

}
