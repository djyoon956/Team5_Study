package ch05.dajeong;

public class ex04_2 {
	public static void main(String[] args) {
		int number = 1;
		do {
			System.out.println(number++);
		} while (number < 100);
		while (number <= 100 && number > 0) {
			System.out.println(number--);
		}
	}
}
