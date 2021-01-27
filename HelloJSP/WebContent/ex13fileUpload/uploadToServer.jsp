<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>파일 업로드 성공?</h2>
<hr>
<%
	/*객체는 기존의 객체가 아닌 cos.jar의 객체를 만들어 사용함
		MultipartRequest(5개인자) 객체 생성 이름의 예: mr1 + upload
		new MultipartRequest(request, bang, 10*1024*1024,"utf-8",
				new DefaultFileRenamePolicy());
		
		request: jsp 내장 request 객체
		bang: 업로드한 파일이 들어갈 곳 (서버 저장소)
		10*1024*1024: 1kb = 1024byte = 2^20 byte
					  1024kb = 1mb
					  여기선 10mb, 올릴 최대 byte
	 	utf-8 : 한글처리
	 	DefaultFileRenamePolicy: 업로드시 bang에 이름이 같은 중복 파일이 존재시 처리할 정책
	 	ex) ondal.jpg 가 두번 들어오면 ondal(1).jpg ondal(2).jpg 가 됨
	*/
	
	String bang = "d:/upload";
	//이 객체가 생성되는 순간 업로드됨
	MultipartRequest mr1 = new MultipartRequest(request,
			bang, 10*1024*1024, "utf-8", new DefaultFileRenamePolicy());
	
	//enctype="multipart/form-data" 해놔서 request 사용 못함 대신 MultipartRequest 객체 mr1 사용
	String vName = mr1.getParameter("name");
	String vFileName = mr1.getFilesystemName("file1");
	
	if(vFileName!=null){
		out.println("사용자 이름: " + vName + "<br>");
		out.println("업로드된 파일 이름: " + vFileName + "<br>파일 업로드에 성공하셨습니다");
	} else
		out.println("파일 업로드에 실패하셨습니다");
%>
</body>
</html>