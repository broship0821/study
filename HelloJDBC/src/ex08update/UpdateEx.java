package ex08update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UpdateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		String sql = "UPDATE teltable SET name=?,tel=?,d=?,id=? WHERE id=?";
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("변경할 아이디 입력"));
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력(010-1111-2222)");
		String date = JOptionPane.showInputDialog("날짜 입력(20201211)");
		int id2 = Integer.parseInt(JOptionPane.showInputDialog("변경할 아이디 입력"));
		
		PreparedStatement pstmt = con1.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, tel);
		pstmt.setString(3, date);
		pstmt.setInt(4, id2);
		pstmt.setInt(5, id);
		
		int result = pstmt.executeUpdate();
		if(result==1) System.out.println(result+"개 수정 성공!");
		
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
