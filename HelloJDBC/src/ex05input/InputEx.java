package ex05input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("봉급얼마이상?:");
		int m = sc.nextInt();
		System.out.println("매니저아이디얼마이상?:");
		int i = sc.nextInt();
		
		
		String sql = "SELECT first_name 이름, salary 봉급, manager_id 매니저아이디" + 
				" FROM employees" + 
				" WHERE manager_id IS NOT NULL AND (salary>=? OR manager_id>=?)";
		PreparedStatement pstmt = con1.prepareStatement(sql);
		pstmt.setInt(1, m);
		pstmt.setInt(2, i);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			//별명쓰면 무조건 별명으로 찾아야됨 별명 or 순서
			String first_name = rs.getString("이름");
			int salary = rs.getInt("봉급");
			int manager_id = rs.getInt("매니저아이디");
			System.out.println(rs.getRow()+": "+first_name+" "+salary+" "+manager_id );
		}
		
		rs.close();
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
