package ch06.dajeong;

public class ex02_2 {
	public static void main(String[] args) {
		int number = 0;
		System.out.printf("%d는 소수값이다 : %s\n", number, isPrimeNumber(number));
		System.out.println("*******1~100소수값 출력*******");
		for (int i = 1; i < 101; i++) {
			if (isPrimeNumber(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		boolean result = true;
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				}
			}
		} else 
			result = false;

		return result;
	}
}
