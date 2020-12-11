package ex04preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("찾을 이름 입력:");
//		String name = sc.nextLine();
		
		System.out.print("찾을 단어 입력:");
		String s = sc.nextLine();
		
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		String sql = "SELECT * FROM employees"
//				+ " where upper(first_name)=?";
				+ " WHERE first_name LIKE ?";
		PreparedStatement pstmt = con1.prepareStatement(sql);
//		pstmt.setString(1, name.toUpperCase());
		pstmt.setString(1, "%"+s+"%");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("employee_id");
			String first_name = rs.getString("first_name");
			String hire_date = rs.getString("hire_date"); //날짜를 문자로 뽑아냄
			String hire_date2 = hire_date.substring(0,10); //거기서 년월일만 가져옴
			//                행 가져오기
			System.out.println(rs.getRow()+": "+id+" "+first_name+" "+hire_date2 );
		}
		
		rs.close();
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
