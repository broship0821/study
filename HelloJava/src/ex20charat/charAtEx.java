package ex20charat;

class cafe1 {
	private String name;
	private String size;
	private int price;
	private String place;
	
	public cafe1() {
	}
	
	public cafe1(String name, String size, int price, String place) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.place = place;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return name + "의 사이즈가 " + size + "인 경우 가격은 " + price + "원 이며 " + place + "지점에서 판매합니다.";
	}
	
	
}

public class charAtEx {

	public static void main(String[] args) {
		String s1 = "ondal";
		String s2 = "온달";
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(1));
		
		System.out.println("-------------------------");
		/*
		 "듀엣그룹,duetMiso,얼굴천사" 를 문자열 변수에 넣고
		 출력 시 한 단어를 한 줄씩 출력하시오
		 단 split() 사용
		 */
		String str = "듀엣그룹, duetMiso, 얼굴천사";
		String[] arr = str.split(", ");
//		String[] arr = {"듀엣그룹", "duetMiso", "얼굴천사"}; //이거랑 똑같은 의미
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------");
		/*
		 main()에 String pummok = "coffee:big:1500:jongro"; 이 있을 때
		 cafe1 클래스를 사용하여 게터/세터 및 toString()등을 작성한 후 toString()
		 출력시 다음과 같이 출력하도록 프로그램을 작성하시오
		 (단, 커피명:사이즈:가격:지점 을 의미하여 cafe클래스의 필드는 앞의 4개를 만들어 사용한다)
		 ex) coffee 의 사이즈가 big 인 경우 가격은 1500 원이며 jongro 지점에서 판매합니다.
		 */
		
		
//		String pummok = "coffee:big:1500:jongro";
//		String pummok = "milk.middle.2500.nowon";
		String pummok = "milk**middle**2500**nowon";
		
//		String[] a = pummok.split("\\.");
		String[] a = pummok.split("\\*\\*");
		cafe1 cafe = new cafe1(a[0], a[1], Integer.parseInt(a[2]), a[3]);
		System.out.println(cafe);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
