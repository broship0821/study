package com.mycompany.ex02initDestory;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Init")
public class Init extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Init() {
    	
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("난 init, 최초에 한번만 나옴");
	}


	public void destroy() {
		System.out.println("난 destroy");
	}

//얘가 있어서 doGet,doPost가 실행 안된거였네 이게 먼저 실행되고 이게 없으면 get,post에 따라서 실행되는 듯
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("난 service, 새로고침 할때마다 나옴");
//	}
/*
	init: 서버가 시작될때 실행됨
	service: 모든 요청을 처리 만약 service가 없으면 get,post에 따라 doGet,doPost로 처리
	destroy: 서버가 다운될때(서버 재시작할떄도) 실행됨
	
	첫가동에는 init이 실행되고 service는 쓰레드로 실행됨, 두번째부터는 쓰레드만 재시작됨
	그래서 서버가 버벅거리지 않고 기능을 수행할 수 있음
*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
