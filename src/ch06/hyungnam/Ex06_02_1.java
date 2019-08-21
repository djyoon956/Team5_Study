package ch06.hyungnam;

public class Ex06_02_1 {

	public static void main(String[] args) {
		circleArea(10);
		circleLength(10);
	}
	
	public static void circleArea(double num) {
		System.out.println(num * num * 3.14);
	}
	
	public static void circleLength(double num) {
		System.out.println(2 * 3.14 * num);
	}

}
