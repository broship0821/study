package com.mycompany.ex05CRUD;

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

@WebServlet("/Telallview")
public class Telallview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kaja = null;
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
		
		//그다음 작업은 컬렉션을 뷰로 넘겨서 출력하는 것
		//객체를 넘기기 때문이 request 속성으로 넘김
		//데이터를 가지고 가기 때문에 당연히 포워딩
		
		request.setAttribute("alist1", alist1);
		
		request.getRequestDispatcher("ex05getAllinfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
