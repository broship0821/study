package ex18object;

class Car {
	String color;
	int door;
	
	public void drive() {
		System.out.println("드라이브~");
	}
	
}

public class CarMainClass {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.color="black";
		mycar.door = 2;
		mycar.drive();
		System.out.println(mycar.color + "  " + mycar.door);

	}

}
