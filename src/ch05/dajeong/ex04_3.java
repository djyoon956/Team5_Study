package ch05.dajeong;

public class ex04_3 {
	public static void main(String[] args) {
		int number = 1000;
		int res = 0;
		while (number > 0) {
			if (number % 2 == 0 && number % 7 == 0) {
				res += number;
			}
			number--;
		}
		System.out.println("1000������ �ڿ��� �߿��� 2�� �������, 7�� ����� �� : " + res);
	}
}
