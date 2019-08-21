package ch06.dajeong;

public class ex01_1 {
	public static void main(String[] args) {
		add(10, 2);
		sub(10, 2);
		mul(10, 2);
		div(10, 2);
	}

	public static void add(int number1, int number2) {
		System.out.printf("%d+%d = %d\n", number1, number2, number1 + number2);
	}

	public static void sub(int number1, int number2) {
		System.out.printf("%d-%d = %d\n", number1, number2, number1 - number2);
	}

	public static void mul(int number1, int number2) {
		System.out.printf("%d*%d = %d\n", number1, number2, number1 * number2);
	}

	public static void div(int number1, int number2) {
		System.out.printf("%d/%d = %d.%d\n", number1, number2, number1 / number2, number1 % number2);
	}
}
