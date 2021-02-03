<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="sawon1" class="com.mycompany.ex06javabean.Sawon" />
<jsp:useBean id="sawon2" class="com.mycompany.ex06javabean.Sawon" />
<!-- 
	자바에선
	Sawon sawon1 = new Sawon(); 이거랑 같은거임
	id가 객체명, 클래스는 패키지명.클래스명
	
	가능한한 자바식 표현을 없애고 태그로 표현하는 것이 목적(가독성)
 -->
<jsp:setProperty name="sawon1" property="name" />
<jsp:setProperty name="sawon1" property="age" />
<!-- 
	getParameter 해서 가져온 다음
	setName(), setAge() 를 사용해서 객체에 넣어야 하는데
	자동으로 해줌
 -->
<jsp:setProperty property="*" name="sawon2"/>
<!-- 이름 맞는거로 자동으로 매핑해서 set 해줌 -->
<!-- 빈은 폼으로보낸거(파라미터)만 자동으로 매핑해줌 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jsp:getProperty 출력</h2>
이름은 <jsp:getProperty property="name" name="sawon1"/><br /><!-- getName 대신 -->
나이는 <jsp:getProperty property="age" name="sawon1"/><br /><!-- 형변환도 알아서 됨 -->
<hr />
<h2>toString으로 출력</h2>
${sawon2}
</body>
</html>