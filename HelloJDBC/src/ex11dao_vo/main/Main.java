package ex11dao_vo.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ex11dao_vo.dao.TelinfoDAO;
import ex11dao_vo.vo.TelinfoVO;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		int menu = 0;
		TelinfoDAO dao = new TelinfoDAO();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("***비상연락망 관리***\n\n");
			System.out.println("----------------------------------");
			System.out.println("1. 한명 입력");
			System.out.println("2. 전체 출력");
			System.out.println("3. 종료");
			System.out.println("4. 바꾸기");
			System.out.println("5. DELETE");
			System.out.println("----------------------------------");
			System.out.print("이용할 메뉴 선택: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("id:");
				int id = sc.nextInt();
				System.out.print("name:");
				String name = sc.next();
				System.out.print("tel:");
				String tel = sc.next();
				System.out.print("Date:");
				String sDate = sc.next();
				
				boolean b = dao.insert_nametel(id, name, tel, sDate);
				if(b) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 에러");
				}
				break;
			case 2:
				ArrayList<TelinfoVO> list = dao.getAllInfo();
				
				for(TelinfoVO vo : list) {
					System.out.println(vo.getId());
					System.out.println(vo.getName());
					System.out.println(vo.getTel());
					System.out.println(vo.getD());
					System.out.println("-----------------");
				}
				break;
			case 3:
				System.out.println("프로그램종료");
				dao.pstmtClose();
				dao.getAllInfoClose();
				break;
			
			case 4:
				System.out.print("바꿀 아이디: ");
				int beforeId = sc.nextInt();
				
				System.out.print("id:");
				int afterId = sc.nextInt();
				System.out.print("name:");
				String afterName = sc.next();
				System.out.print("tel:");
				String afterTel = sc.next();
				System.out.print("Date:");
				String sdate = sc.next();
				java.sql.Date afterDate = new java.sql.Date(Integer.parseInt(sdate.substring(0,4))-1900, Integer.parseInt(sdate.substring(4,6))-1, Integer.parseInt(sdate.substring(6,8)));
				TelinfoVO updateVO = new TelinfoVO(afterId, afterName, afterTel, afterDate);
				boolean b2 = dao.update_nametel(beforeId, updateVO);
				if(b2) {
					System.out.println("update 성공");
				} else {
					System.out.println("update 에러");
				}
				break;
			
			case 5:
				System.out.print("삭제할 아이디: ");
				int deleteId = sc.nextInt();
				boolean b3 = dao.delete(deleteId);
				if(b3) {
					System.out.println("delete 성공");
				} else {
					System.out.println("delete 에러");
				}
				break;
				
			}
		} while(menu!=3);
		

	}

}
