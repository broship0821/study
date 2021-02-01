package com.mycompany.ex01servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 애노테이션 annotation
 클래스 위에 사용, web.xml 역활을 대신함
 
 urlmapping: url로 찾아갈때 /Hello 이여야 한다
 jsp는 /hello.jsp 이런식, servlet에서는 /Hello 이렇게만 하면 됨
 
 @WebServlet("/HelloServlet") 이걸 xml로 하면 엄청 길게 써야됨
 근데 너무 간단해서 공부하지 않고는 분석할수가 없음
 이게 뭘 생략해서 썻는지를 모르면(베이스가 없으면) 이해하기가 힘듬
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {//이걸 상속받아야만 서블릿 역활을 할 수 있음
	private static final long serialVersionUID = 1L;
	/*
	 전송
	 marshalling - unmarshalling (직렬화보다 더 큰범위)
	 serialization(직렬화) - deserialization(역직렬화)
	 객체는 그대로 보내면 무조건 깨짐
	 xml로 바꾸던지 binary(10110111)로 바꿔야됨
	 객체를 보낼때 직렬화해서(바이너리로바꿔서) 전송
	 받을때 바이너리를 역직렬화해서 객체로 만듬
	 
	 클래스파일도 보낼때 직렬화를 하는데 그 버전이 1L 이다 이런 느낌
	 서로간에 버전을 맞춰주는 느낌
	 */
       
    public HelloServlet() {
    	
    }
    
    /*
	 서블릿에서는 request, response가 없어서 HttpServletRequest 이런식으로 생성
	 이렇게 만들면 똑같이 사용 가능
	 */
    //웹 방식의 메소드 정의문      request: 요청을 위한 객체                response: 응답을 위한 객체               예외처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//밑에께 jsp에서 out.println() 과 똑같음, 서블릿에서 출력하는 방법
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//프로젝트명 출력하기 -> /HelloServlet
		response.getWriter().println(request.getContextPath());
		
		// 프로젝트명/파일경로 출력하기 -> /HelloServlet/HelloServlet
		response.getWriter().println(request.getRequestURI());
		
		//전체경로 -> http://localhost:8080/HelloServlet/HelloServlet
		response.getWriter().println(request.getRequestURL());
		
		//파일명(class명,url매핑)만 출력 -> /HelloServlet
		response.getWriter().println(request.getServletPath());
		
		//절대경로(실제파일이 위치하는곳) old방식이라 취소선 그려짐 -> D:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\HelloServlet\
		response.getWriter().println(request.getRealPath("/"));
		
		//이것도 절대경로 이게 new 방식
		response.getWriter().println(request.getSession().getServletContext().getRealPath("/"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
