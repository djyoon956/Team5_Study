package ch05.dajeong;

public class ex04_1 {
	public static void main(String[] args) {
		int number = 0;
		int base = 1;
		while (base < 100) {
			number += base;
			base++;
		}
		System.out.println("1부터 99까지의 합 : " + number);
	}
}
