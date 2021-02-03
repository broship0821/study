package com.frontcontroller.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class CommandTelupdate implements CommandImpl {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int id4 = Integer.parseInt(request.getParameter("id"));
		String name4 = request.getParameter("name");
		String tel4 = request.getParameter("tel");
		String d4 = request.getParameter("d");
		String name5 = request.getParameter("name2");
		boolean b4 = false;
		
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			b4 = td1.update_all(id4, name4, tel4, d4, name5);
		} catch (ClassNotFoundException | SQLException e) {
			// 이렇게도 가능하구나
			e.printStackTrace();
		}
		if(b4) {
			request.setAttribute("result1", "수정 good");
		} else {
			request.setAttribute("result1", "수정 오류");
		}
		
	}
}
