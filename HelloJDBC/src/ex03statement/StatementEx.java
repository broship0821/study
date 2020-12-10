package ex03statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		String sql = "SELECT * FROM employees";
		Statement st = con1.createStatement();
		
		ResultSet rs = st.executeQuery(sql);

	}

}
