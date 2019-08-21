package ch10.dajeong;

public class Accumulator {
	static int result;

	static void add(int number) {
		result += number;
	}

	static void showResult() {
		System.out.printf("sum = %d\n", result);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
}
