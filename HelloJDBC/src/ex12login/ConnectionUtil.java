package ex12login;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	private Connection conn;
	
	public ConnectionUtil() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}

}
