package ex19constructor;

class Car {
	private String color;
	private int door;
	
	public Car() {
		// 생성자 오버로딩
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}



	public void drive() {
		System.out.println("드라이브~");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + "]";
	}
	
	
	
	
}

public class CarMainClass {

	public static void main(String[] args) {
		Car mycar = new Car("pink", 11);
		mycar.drive();
		System.out.println(mycar.getColor() + "  " + mycar.getDoor());
		System.out.println(mycar.toString());
		System.out.println(mycar); //toString()이 오버라이딩 되있으면 생략 가능
	}

}
