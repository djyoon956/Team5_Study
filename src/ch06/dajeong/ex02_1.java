package ch06.dajeong;

public class ex02_1 {
	public static void main(String[] args) {
		double r = 3.14;
		System.out.printf("반지름 %.2f의 둘레는 %.2f 넓이는 %.2f 이다.\n", r, getRound(r), getArea(r));

	}

	public static double getRound(double r) {
		return 2 * Math.PI * r;
	}

	public static double getArea(double r) {
		return Math.PI * r * r;
	}
}
