package ex10selectDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null; //접속객체 con1 선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		Scanner sc = new Scanner(System.in);
		//SELECT to_char(sysdate, 'yyyy"년"mm"월"dd"일" hh24:mi:ss') FROM dual; 원래 sql문에서 년월일로 표시하는방법
		String sql = "SELECT id, name, tel, TO_CHAR(d, 'yyyy\"년\" mm\"월\" dd\"일\" hh24:mi:ss') 날짜 FROM TelTable"
				+ " WHERE name=?";
		//db에서 날짜 -> 문자로 바꾼 후 자바 문자열로 가져오기
		System.out.print("검색할 이름:");
		String name = sc.nextLine();
		
		PreparedStatement pstmt = con1.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String getName = rs.getString("name");
			String tel = rs.getString("tel");
			String date = rs.getString("날짜");
			System.out.println(rs.getRow()+": "+id+" "+getName+" "+tel+" "+date );
		}
		
		rs.close();
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
