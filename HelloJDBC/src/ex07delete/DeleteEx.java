package ex07delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DeleteEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("db 접속 성공!");
		
		String sql = "DELETE FROM TelTable WHERE id=?";
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디 입력"));
		
		PreparedStatement pstmt = con1.prepareStatement(sql);
		pstmt.setInt(1, id);
		
		int result = pstmt.executeUpdate();
		if(result==1) System.out.println(result+"개 삭제 성공!");
		
		pstmt.close();
		con1.close();
		System.out.println("접속 끝!");

	}

}
