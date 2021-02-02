package com.mycompany.ex05CRUD;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;


@WebServlet("/Telupdate")
public class Telupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String d = request.getParameter("d");
		String name2 = request.getParameter("name2");
		boolean b = false;
		
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			b = td1.update_all(id, name, tel, d, name2);
		} catch (ClassNotFoundException | SQLException e) {
			// 이렇게도 가능하구나
			e.printStackTrace();
		}
		if(b) {
			request.setAttribute("result1", "수정 good");
		} else {
			request.setAttribute("result1", "수정 오류");
		}
		request.getRequestDispatcher("ex05result.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
