package ch05.dajeong;

public class ex06_1 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (!(((i % 5) != 0) || ((i % 7) != 0))) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count : " + count);
	}
}
