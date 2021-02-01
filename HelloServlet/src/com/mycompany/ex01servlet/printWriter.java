package com.mycompany.ex01servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printWriter")
public class printWriter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public printWriter() {
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html 파일처럼 사용, 한글처리도됨
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("안녕하세요");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
