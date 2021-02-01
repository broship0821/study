package com.broship.peter.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.broship.peter.web.board.impl.BoardDAOSpring;
@org.springframework.stereotype.Controller
public class BoardController implements Controller {
	@Autowired
	private BoardDAOSpring dao;
	
//	public void setDao(BoardDAOSpring dao) {
//		this.dao = dao;
//	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("root.board");
		List<BoardVO> list = dao.getBoardList();
		mav.addObject("list", list);
		
		return mav;
	}
}
