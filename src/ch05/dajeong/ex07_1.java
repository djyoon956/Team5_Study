package ch05.dajeong;

public class ex07_1 {
	public static void main(String[] args) {
		for (int i = 2; i < 9; i += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}
	}
}
