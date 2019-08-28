package quiz_week01_02.hayeon;

public class Ex05_03 {

	public static void main(String[] args) {
		// 3-1문제
		int n = 3;
		if (n == 1) {
			System.out.println("Simple Java");

		} else if (n == 2) {
			System.out.println("Funny Java");

		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {

			System.out.println("The best programming language");
		}
		System.out.println("Do you like Java?");

		// 3-2문제
		int a = 24;
		switch (a / 10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}
	}
}
