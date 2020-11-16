package ex34arraylist;

import java.util.ArrayList;
import java.util.Date;

class SMarket {
	private String sangpum;
	private int price;
	
	public SMarket() {
		// TODO Auto-generated constructor stub
	}

	public SMarket(String sangpum, int price) {
		this.sangpum = sangpum;
		this.price = price;
	}

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "상품이름은 " + sangpum + "이고 상품가격은 " + price + "원 입니다.";
	}
	
}


public class GenericsEx {

	public static void main(String[] args) {
		/*
		 generic
		 	배열과 컬랙션의 장점을 따서 만들어보자
		 	가변길이 배열 + one data type
		 	
		 	ex)
		 		ArrayList<String> arr3 = new ArrayList<>();
		 		ArrayList<SMarket> arr3 = new ArrayList<>();
		 */
		
		ArrayList<String> arr = new ArrayList<>();
		System.out.println(arr.size());
		
//		arr.add(30); //Integer 들어올수 없음, 에러
		arr.add("빵");
		arr.add("라면");
		arr.add("우유");
		arr.add("김밥");
		
		System.out.println(arr);
		
		arr.set(1, "과자"); //라면 -> 과자
		arr.remove(2); //우유삭제
		arr.remove("빵"); //빵 삭제
		
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		SMarket s1 = new SMarket("우유", 1000);
		SMarket s2 = new SMarket("빵", 2000);
		
		ArrayList<SMarket> sList = new ArrayList<>();
		
		sList.add(s1);
		sList.add(s2);
		
		for(SMarket ss : sList) {
			System.out.println(ss);
		}
		
		System.out.println("-----------------------------");
		
		ArrayList arr3 = new ArrayList();
		
		arr3.add(new Date());
		arr3.add(new SMarket("우유", 1000));
		arr3.add(new SMarket("빵", 2000));
		
		for(int i=0;i<arr3.size();i++) {
			System.out.println(arr3.get(i));
		}
		
		System.out.println("-----------------------------");
		
		ArrayList<SMarket> arr5 = new ArrayList<>();
		arr5.add(new SMarket("프링글스", 1000));
		arr5.add(new SMarket("다이제", 1500));
		arr5.add(new SMarket("bhc", 3000));
		arr5.add(new SMarket("불닭", 4000));
		arr5.add(new SMarket("콜라", 5000));
		
		System.out.println("2000원 미만 상품:");
		for(SMarket sss : arr5) {
			if(sss.getPrice()<2000) {
				System.out.println(sss.getSangpum());
			}
		}
		
		for(int i=0;i<arr5.size();i++) {
			if(arr5.get(i).getPrice()<2000) {
				System.out.println(arr5.get(i).getSangpum());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
