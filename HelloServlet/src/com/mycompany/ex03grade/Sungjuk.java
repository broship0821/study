package com.mycompany.ex03grade;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sungjuk")
public class Sungjuk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sungjuk() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//이게 여기서도 되네
		//request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String score = "";
		
		switch (num/10) {
		case 10:
		case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default:
			score = "F";
			break;
		}
		
		request.setAttribute("score", score);
		request.getRequestDispatcher("ex03jspview.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost에 이거 해주면 한글처리 다 됨
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
