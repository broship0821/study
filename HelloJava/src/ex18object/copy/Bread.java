package ex18object.copy;

class Bakery_BBang {
	private String jongryu;
	private int money;
	public String getJongryu() {
		return jongryu;
	}
	public void setJongryu(String jongryu) {
		this.jongryu = jongryu;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void eat() {
		System.out.println("빵을 맛있게 먹자");
	}
	
}

public class Bread {

	public static void main(String[] args) {
		Bakery_BBang pizza = new Bakery_BBang();
		Bakery_BBang soboro = new Bakery_BBang();
		pizza.setJongryu("피자빵");
		pizza.setMoney(2000);
		soboro.setJongryu("소보루빵");
		soboro.setMoney(1000);
		System.out.println(pizza.getJongryu() + pizza.getMoney() + "원");
		System.out.println(soboro.getJongryu() + soboro.getMoney() + "원");
		pizza.eat();
		

	}

}
