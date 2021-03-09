package com.google.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/getGrade.do")
	public String getGrade(@RequestParam(value="name",defaultValue="")String name, @RequestParam(value="score",defaultValue="0")int score, Model model) {
		if("".equals(name) || score==0)
			return "error/error";
		
		model.addAttribute("name", name);
		model.addAttribute("score", score);
		
		String page = "";
		switch (score/10) {
		case 10:
		case 9: page = "a"; break;
		case 8: page = "b"; break;
		case 7: page = "c"; break;
		case 6: page = "d"; break;
		default: page = "f"; break;
		}
		
		return page;
	}
	
}
