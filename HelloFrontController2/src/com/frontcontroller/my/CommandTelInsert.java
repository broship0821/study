package com.frontcontroller.my;

import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import telinfoDAO.TelInfoDAO;

public class CommandTelInsert implements CommandImpl {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name2 = request.getParameter("name");
		String tel = request.getParameter("tel");
		String d = request.getParameter("d");
		boolean b2 = false;
		
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			b2 = td1.insert_nametel(id, name2, tel, d);
		} catch (ClassNotFoundException | SQLException e) {
			// 이렇게도 가능하구나
			e.printStackTrace();
		}
		if(b2) {
			request.setAttribute("result1", "입력 good");
		} else {
			request.setAttribute("result1", "입력 오류");
		}
		
	}
}
