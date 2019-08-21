package ch06.dajeong;

public class ex03_2 {
	public static void main(String[] args) {
		int number = 10;
		System.out.printf("%d의 이진수 표현법 : \n", number);
		getBinaryNumber(number);
	}

	public static void getBinaryNumber(int number) {
		int binary = number % 2;
		int result = number / 2;
		if (result != 0)
			getBinaryNumber(result);
		System.out.print(binary);
	}
}
