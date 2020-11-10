package ex18object.copy;

class Car {
	private String color;
	private int door;
	
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
	
	
}

public class CarMainClass {

	public static void main(String[] args) {
		Car mycar = new Car();
		//mycar.color="black";
		//mycar.door = 2;
		mycar.setColor("black");
		mycar.setDoor(2);
		mycar.drive();
		//System.out.println(mycar.color + "  " + mycar.door);
		System.out.println(mycar.getColor() + "  " + mycar.getDoor());

	}

}
