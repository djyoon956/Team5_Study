package ch05.dajeong;

public class ex07_2 {
	public static void main(String[] args) {
		for (int b = 0; b < 10; b++) {
			for (int a = 0; a < 10; a++) {
				if ((a * 10 + b * 10 == 90) && (b + a) == 9 && (a * 10 + b * 10 + b + a == 99)) {
					System.out.printf("A : %d, B : %d\n", a, b);
				}
			}
		}
	}
}