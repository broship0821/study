package com.frontcontroller.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class CommandTelDelete implements CommandImpl {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		Boolean b = false;
		
		TelInfoDAO td1 = new TelInfoDAO();
		b = td1.delete_nametel(name);
		
		if(b) {
			request.setAttribute("result1", "삭제 good");
		} else {
			request.setAttribute("result1", "삭제 오류");
		}
		
	}
}
