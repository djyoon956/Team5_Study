package ch06.dajeong;

public class ex03_1 {
	public static void main(String[] args) {
		int number = 3;
		System.out.printf("2ÀÇ %d½Â : %d\n", number, get2Squared(number));
	}

	public static int get2Squared(int number) {
		return number == 0 ? 1 : 2 * get2Squared(number - 1);
	}
}
