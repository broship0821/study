package ex02connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 로딩
		//소대문자 틀리면안됨, 스태틱메소드
		
		//db접속                                                                                   @db서버 ip
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		//                                                                  SID(별명) 유저      비번
		System.out.println("db 접속 성공!");

	}

}
