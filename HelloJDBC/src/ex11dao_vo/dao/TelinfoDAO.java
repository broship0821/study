package ex11dao_vo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import ex11dao_vo.dbconn.TelinfoDBConn;
import ex11dao_vo.vo.TelinfoVO;

public class TelinfoDAO {
	private Connection conn;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public TelinfoDAO() throws ClassNotFoundException, SQLException {
		conn = new TelinfoDBConn().getConn();
	}
	
	public void pstmtClose() throws SQLException{
		if(pstmt!=null) pstmt.close();
	}
	
	public void getAllInfoClose() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
	}
	
	//																20141112로 받음
	public boolean insert_nametel(int id, String name, String tel, String sDate) {
		String sql = "INSERT INTO teltable2 VALUES(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			int year = Integer.parseInt(sDate.substring(0,4))-1900; //2014
			int month = Integer.parseInt(sDate.substring(4,6))-1; //11월
			int day = Integer.parseInt(sDate.substring(6,8)); //12일
			//Date d = new Date(year, month, day); 이렇게 할려면 년도에 -1900 해야되고 월 -1 해야 정확한 날짜 들어감
			Date d = new Date(year, month, day);
			pstmt.setDate(4, d);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert exception");
			return false;
		}
		return true;
		
		
	}
	
	public ArrayList<TelinfoVO> getAllInfo(){
		String sql = "SELECT * FROM teltable2 ORDER BY id";
		ArrayList<TelinfoVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getDate("d"));
				TelinfoVO vo = new TelinfoVO(rs.getInt("id"), rs.getString("name"), rs.getString("tel"), rs.getDate("d"));
				//sql date -> vo안에있는 util date 이건 자동으로 되나봄
				list.add(vo);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("select exceotion");
			
		}
		return list;
		
	}
	
	public boolean update_nametel(int id, TelinfoVO vo) {
		String sql = "UPDATE teltable2 SET id=?, name=?, tel=?, d=? WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getTel());
			Date sqldate = new Date(vo.getD().getTime()); //util date를 sql date로 바꾸는 방법
			pstmt.setDate(4, sqldate);
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update exception");
			return false;
		}
		return true;
		
		
	}
	
	public boolean delete(int id) {
		String sql = "DELETE FROM teltable2 WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DELETE exception");
			return false;
		}
		return true;
		
		
	}
	
}
