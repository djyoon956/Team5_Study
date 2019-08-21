package ch05.dajeong;

public class ex05_1 {
	public static void main(String[] args) {
		int number = 1;
		for (int i = 1; i < 11; i++) {
			number *= i;
		}
		System.out.println("1부터 10까지의 곱 : " + number);
	}
}
