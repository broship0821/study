package com.frontcontroller.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Sawonfrontcontroller")
@WebServlet("*.do") //모든 .do 요청을 여기서 처리
public class Sawonfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*
 	front controller - 2
 	1의 경우 모든 로직이 프론트 컨트롤러에 몰리므로 길어짐
 	
 	해결:
 	컨트롤러 안에서 처리는 메소드가 하게 하고
 	최종 처리는 컨트롤러가 처리하게 함
 	
 	처리하는 메소드를 따로 만들어야됨 스프링에서는 service라고 함
 	메소드 이름은 보통 command.execute(request,response)를 사용하나 임의로 정해도 됨
 	
 	command는 interface를 사용한다
 	- 다중 상속을 위해
 	- 원형 역활(아마 무조건 구현해야되서?)
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = request.getRequestURI().substring(request.getContextPath().length());
		
		CommandImpl command = null;
		/*
		 Impl : implements 인터페이스라는 뜻
		 상속 A extends B     A implements B
		     B:클래스                 B:인터페이스
		 */
		
		String view = null;
		switch(path) {
		//주석처리한거 다 command쪽에 있음
		case "/getAllinfo.do":
//			TelInfoDAO tidao1 = null;
//			ArrayList<TelInfoVO> alist1 = null;
			command = new CommandGetAllInfo();
			try {
//				tidao1 = new TelInfoDAO();
//				alist1 = tidao1.getAllInfo();
				command.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
//			request.setAttribute("alist1", alist1);
			view = "getAllinfo.jsp";
			break;
			
		case "/TelDelete.do":
//			String name = request.getParameter("name");
//			Boolean b = false;
			command = new CommandTelDelete();
			try {
//				TelInfoDAO td1 = new TelInfoDAO();
//				b = td1.delete_nametel(name);
				command.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
//			if(b) {
//				request.setAttribute("result1", "삭제 good");
//			} else {
//				request.setAttribute("result1", "삭제 오류");
//			}
			view = "result.jsp";
			break;
			
		case "/TelInsert.do":
			command = new CommandTelInsert();
			try {
				command.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			view = "result.jsp";
			break;
			
		case "/Telsearchone.do":
			command = new CommandTelSearchone();
			try {
				command.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			view = "getOneinfo.jsp";
			break;
			
		case "/Telupdate.do":
			command = new CommandTelupdate();
			try {
				command.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			view = "result.jsp";
			break;
		}
		
		
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
