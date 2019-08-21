package ch06.hyungnam;

public class Ex06_02_2 {

	public static void main(String[] args) {
		System.out.println(primeCheck(2));
	}

	public static boolean primeCheck(int num) {
		boolean tf = true;

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return tf = false;
			}
		}
		return tf;
	}
}
