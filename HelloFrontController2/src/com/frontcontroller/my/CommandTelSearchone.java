package com.frontcontroller.my;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class CommandTelSearchone implements CommandImpl {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name3 = request.getParameter("name");
		TelInfoVO tv1 = null;
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			tv1 = td1.getInfo(name3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("tv1", tv1);
		
	}
}
