package ex12login;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String menu;
		UserDAO dao = new UserDAO();
		
		do {
			System.out.println("회원관리");
			System.out.println("-------------------------------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원탈퇴");
			System.out.println("5. 종료");
			System.out.println("-------------------------------------");
			System.out.println("메뉴를 선택하세요");
			
			menu = JOptionPane.showInputDialog("메뉴 선택");
			
			switch(menu) {
			case "1":
				String id = JOptionPane.showInputDialog("아이디입력");
				String pw = JOptionPane.showInputDialog("비밀번호입력");
				String name = JOptionPane.showInputDialog("이름입력");
				String tel = JOptionPane.showInputDialog("전화번호입력");
				boolean idCheck = dao.checkId(id);
				if(idCheck) { //중복아이디 없음
					System.out.println("아이디 사용가능!");
					UserVO vo = new UserVO(id, pw, name, tel);
					boolean signUp = dao.sign_up(vo);
					if(signUp) System.out.println("회원가입 성공!");
					else System.out.println("회원가입 실패!");
				} else {
					System.out.println("아이디 중복됨!!!!!!!!!!!!!!!");
				}
				break;
			case "2":
				String loginid = JOptionPane.showInputDialog("아이디입력");
				String loginpw = JOptionPane.showInputDialog("비밀번호입력");
				int result = dao.check(loginid, loginpw);
				switch(result) {
				case 1:
					System.out.println("로그인 성공!");
					UserVO loginUser = dao.getUserInfo(loginid);
					System.out.println("이름: "+ loginUser.getName());
					System.out.println("전화번호: "+ loginUser.getTel());
					break;
				case 0:
					System.out.println("로그인 - 비번틀림!");
					break;
				case -1:
					System.out.println("로그인 - 존재하지 않는 아이디!");
					break;
				case -2:
					System.out.println("로그인 - db에 오류가 생겼습니다.");
					break;
				}
				break;
			case "3":
				String deleteid = JOptionPane.showInputDialog("아이디입력");
				String deletepw = JOptionPane.showInputDialog("비밀번호입력");
				int deleteresult = dao.check(deleteid, deletepw);
				switch(deleteresult) {
				case 1:
					boolean delete = dao.deleteUser(deleteid);
					if(delete)
						System.out.println("회원탈퇴 성공!");
					else
						System.out.println("회원탈퇴 실패!");
					break;
				case 0:
					System.out.println("회원탈퇴 - 비번틀림!");
					break;
				case -1:
					System.out.println("회원탈퇴 - 존재하지 않는 아이디!");
					break;
				case -2:
					System.out.println("회원탈퇴 - db에 오류가 생겼습니다.");
					break;
				}
				break;
			case "5":
				System.out.println("프로그램 종료");
				dao.getAllInfoClose();
				break;
				
			}
		} while(!menu.equals("5"));
		

	}

}
