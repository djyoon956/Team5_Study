package quiz_week01_02.dajeong;

import java.util.Scanner;

public class Quiz_week01_02_dj {
	public static void main(String[] args) {
		System.out.print("입력 (홀수/짝수) >> ");

		Scanner scanner = new Scanner(System.in);
		String indexString = scanner.nextLine();
		switch (indexString) {
		case "짝수":
			printEvenMul();
			break;
		case "홀수":
			printOddMul();
			break;
		default:
			System.out.println("홀수 또는 짝수가 아닙니다.");
			break;
		}
	}

	public static void printEvenMul() {
		for (int i = 2; i < 10; i *= 2) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

	public static void printOddMul() {
		for (int i = 3; i < 10; i += 2) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}
