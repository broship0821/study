package ex19constructor;

class BBang {
	private String jongryu;
	private int money;
	
	public BBang() {
	}
	
	public BBang(String jongryu, int money) {
		this.jongryu = jongryu;
		this.money = money;
	}



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

	@Override
	public String toString() {
		return "BBang [jongryu=" + jongryu + ", money=" + money + "]";
	}
	
	
}

public class Bread {

	public static void main(String[] args) {
		BBang soboro = new BBang("소보로빵", 2000);
		BBang danpot = new BBang("단팥빵", 1000);
		soboro.eat();
		System.out.println(soboro + "  " + danpot);
		

	}

}
