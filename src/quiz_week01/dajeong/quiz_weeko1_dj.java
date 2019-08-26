package quiz_week01.dajeong;

import java.util.Scanner;

public class quiz_weeko1_dj {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 >> ");
		int index = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i < 10; i++) {
			for (int j = index - 1; j < index + 2; j++)
				System.out.printf("%d * %d = %d \t", j, i, i * j);
			System.out.println();
		}
	}
}
