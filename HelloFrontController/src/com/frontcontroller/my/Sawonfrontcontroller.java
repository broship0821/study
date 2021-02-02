package com.frontcontroller.my;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

//@WebServlet("/Sawonfrontcontroller")
@WebServlet("*.do") //모든 .do 요청을 여기서 처리
public class Sawonfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getRequestURI());
//		System.out.println(request.getContextPath());
		/*
		 request.getRequestURI() - request.getContextPath() 하면 파일명만 얻을 수 있음
		 subString으로 자르면됨
		 */
		//자르는 방법
		String path = request.getRequestURI().substring(request.getContextPath().length());
		
		String str = null;
		switch(path) {
		case "/getAllinfo.do":
			TelInfoDAO tidao1 = null;
			ArrayList<TelInfoVO> alist1 = null;
			
			try {
				tidao1 = new TelInfoDAO();
				alist1 = tidao1.getAllInfo();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("alist1", alist1);
			str = "getAllinfo.jsp";
			break;
			
		case "/TelDelete.do":
			String name = request.getParameter("name");
			Boolean b = false;
			
			try {
				TelInfoDAO td1 = new TelInfoDAO();
				b = td1.delete_nametel(name);
			} catch (ClassNotFoundException | SQLException e) {
				// 이렇게도 가능하구나
				e.printStackTrace();
			}
			if(b) {
				request.setAttribute("result1", "삭제 good");
			} else {
				request.setAttribute("result1", "삭제 오류");
			}
			str = "result.jsp";
			break;
			
		case "/TelInsert.do":
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
			str = "result.jsp";
			break;
			
		case "/Telsearchone.do":
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
			str = "getOneinfo.jsp";
			break;
			
		case "/Telupdate.do":
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
			str = "result.jsp";
			break;
		}
		
		
		request.getRequestDispatcher(str).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
