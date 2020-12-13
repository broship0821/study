package ex03statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 이름 입력:");
		String name = sc.nextLine();
		
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		
		//con: 접속객체, st: 문장객체
		String sql = "SELECT * FROM employees";
//				+ " where department_id=30";
//				+ " where upper(first_name)='STEVEN'";
//				+ " where upper(first_name)='" + name.toUpperCase() + "'";
		Statement st = con1.createStatement();//문장객체: String -> sql에서 쓸수있는 언어? 로 바꿔줘요
		//rs: 종이박스, select 내용들이 rs 종이박스에 들어감
		ResultSet rs = st.executeQuery(sql);
//		rs.next(): 다음에 가르킬게 있으면 true, 그다음게 없으면 false
		while(rs.next()) {
			int id = rs.getInt("employee_id");
			String first_name = rs.getString("first_name");
			String hire_date = rs.getString("hire_date"); //날짜를 문자로 뽑아냄
			String hire_date2 = hire_date.substring(0,10); //거기서 년월일만 가져옴
			//                행 가져오기
			System.out.println(rs.getRow()+": "+id+" "+first_name+" "+hire_date2 );
		}
		
		rs.close();
		st.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
