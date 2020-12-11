package ex09InsertDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InsertDateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		String sql = "INSERT INTO TelTable VALUES(?, ?, ?, to_date(?, 'yyyy/mm/dd hh24:mi:ss'))";
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디 입력"));
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력(010-1111-2222)");
//		String date = JOptionPane.showInputDialog("날짜 입력(20201211)");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		String sdate = sdf.format(Calendar.getInstance().getTime());
		
		PreparedStatement pstmt = con1.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, tel);
		pstmt.setString(4, sdate);
		
		int result = pstmt.executeUpdate();
		if(result==1) System.out.println("입력 성공!");
		
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
