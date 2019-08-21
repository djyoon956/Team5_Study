package ch10.hyungnam;

public class CarNBoat {

	public static void main(String[] args) {
		Car c = new Car();
		c.myCar();
		Boat t = new Boat();
		t.myBoat();
	}

}

class Car{
	void myCar() {
		System.out.println("This is my car");
	}
	
}

class Boat{
	void myBoat() {
		System.out.println("This is my boat");
	}
}
