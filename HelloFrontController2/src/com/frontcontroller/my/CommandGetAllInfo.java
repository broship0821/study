package com.frontcontroller.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class CommandGetAllInfo implements CommandImpl {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		TelInfoDAO tidao1 = null;
		ArrayList<TelInfoVO> alist1 = null;
		
		tidao1 = new TelInfoDAO();
		alist1 = tidao1.getAllInfo();
		
		request.setAttribute("alist1", alist1);
		
	}
}
