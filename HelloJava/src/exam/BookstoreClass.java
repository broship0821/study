package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class BookstoreClass {

	public static void main(String[] args) {
		Collection<Bookstore> col = new ArrayList<Bookstore>();
		
		Bookstore b = new Bookstore();
		b.setBook_name("우리는 해낼수 있다");
		b.setBook_genre("자기개발");
		b.setBook_price(12000);
		
		Bookstore b2 = new Bookstore("별이빛나는 밤에", "소설", 10000);
		
		col.add(b);
		col.add(b2);
		col.add(new Bookstore("용의자 x의 헌신", "판타지", 20000));
		col.add(new Bookstore("나의 연극 인생", "자서전", 30000));
		col.add(new Bookstore("잠자는 숲속의 공주", "판타지", 15000));
		col.add(new Bookstore("해리포터의불의잔", "판타지", 10000));
		col.add(new Bookstore("나의라임오랜지나무", "소설", 20000));
		
		int count = print(col);
		System.out.println("검색된 책은 모두 " + count + "권 입니다");
		
		
	}

	private static int print(Collection<Bookstore> col) {
		for(Bookstore bb : col) {
			System.out.println(bb);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 장르는?");
		String genre = sc.nextLine();
		System.out.print("검색할 가격은?");
		int price = Integer.parseInt(sc.next());
		int count = 0;
		for(Bookstore bb : col) {
			if(bb.getBook_genre().equals(genre) && bb.getBook_price()==price) {
				System.out.println(bb.getBook_name());
				count++;
			}
		}
		return count;
		
	}

}

class Bookstore {
	private String book_name;
	private String book_genre;
	private int book_price;
	public Bookstore() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Bookstore(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}


	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	@Override
	public String toString() {
		return "[책이름 ]" + book_name + " [장르]" + book_genre + "[책가격]" + book_price + " 원";
	}
	
}
