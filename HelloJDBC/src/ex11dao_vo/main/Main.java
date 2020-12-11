package ex11dao_vo.main;

import java.util.Scanner;

import ex11dao_vo.dao.TelinfoDAO;

public class Main {

	public static void main(String[] args) {
		int menu = 0;
		TelinfoDAO dao = new TelinfoDAO();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("***비상연락망 관리***\n\n");
			System.out.println("----------------------------------");
			System.out.println("1. 한명 입력");
			System.out.println("2. 전체 출력");
			System.out.println("3. 종료");
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
				
			}
		} while(menu!=3);

	}

}
