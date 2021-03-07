package com.study.jdbc;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgr.sawon.service.TelInfoService;
import com.mgr.sawon.vo.TelInfoVO;

@Controller
public class HomeController {

	/* Resouce는 type이 아닌 이름을 정해서 스프링에 등록 */
	/* Autowired 는 type으로 찾아서 처리 @Autowired = @Resource(이름)*/
	@Resource(name="TelInfoService")
	private TelInfoService telInfoService;
	
	
	/* 클라이언트 전체 보기 */
	/* 이름 요청이 들어오면 여기로 온다 .do~ */
	/* RequestMapping은 메소드로 요청을 처리 */
	@RequestMapping("/getAllTelinfo.do")
	public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException{
		
		/* 이때 model1은 view로 전달시 컨트롤러가 생성한 data를 담을 객체 */
		model1.addAttribute("mAllTelinfo", telInfoService.getAllTelinfo(vo1));
		
		return "sawonGetAllTelinfo";
	}
	
	/* 클라이언트 한명 보기 */
	@RequestMapping("/getTelinfo.do")
	public String sawonGetTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException {
		
		model1.addAttribute("mTelinfo",telInfoService.getTelinfo(vo1));
		
		return "sawonGetTelinfo";
	}
	
	/* 클라이언트 삭제 */
	@RequestMapping("/deleteTelinfo.do")
	public String sawonDeleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException{
		
		telInfoService.deleteTelinfo(vo1);
		
		/* return "getAllTelinfo.do만 해버리면 jsp를 찾아감 */
		/* redirect : 다시 컨트롤러로 들어오게 함 */
		return "redirect:getAllTelinfo.do";
	}
	
	/* 클라이언트 업데이트 */
	@RequestMapping("/updateTelinfo.do")
	public String sawonUpdateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException{
		
		telInfoService.updateTelinfo(vo1);
		
		return "redirect:getAllTelinfo.do";
	}
	
	
	/* 클라이언트 인서트 */
	@RequestMapping("/insertTelinfo.do")
	public String sawonInsertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException{
		
		telInfoService.insertTelinfo(vo1);
		
		return "redirect:getAllTelinfo.do";
	}
}
