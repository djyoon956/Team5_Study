package ch05.hayeon;

public class Ex05_04 {

	public static void main(String[] args) {
		// 5-4의 1번 문제
		int num = 1;
		int sum = 0;

		while (num < 100) {
			sum += num; // 왜 num+=sum은 안 돼?
			num++;
		}
		System.out.println("1~99까지의 합:" + sum);

		// 5-4의 2번 문제
		int num1 = 1;
		while (num1 <= 100) {
			System.out.println(num1);
			num1++;
		}

		int num2 = 100;
		do {
			System.out.println(num2);
			num2--;
		} while (num2 > 0);

		// 5-4의 3번 문제
		int count = 1;
		int sum1 = 0;
		while (count <= 1000) {
			if ((count % 2) == 0 && (count % 7) == 0) {
				System.out.println(count);
				sum1 += count;
			}
			count++;
		}
		System.out.println("합:"+sum1);
	}
}
