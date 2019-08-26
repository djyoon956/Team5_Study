import java.util.Scanner;

public class Ex06_999 {

	public static void main(String[] args) {
		// 구구단 단수를 입력받아 입력받은 단수의 -1~+1 단을 가로로 출력하기
		// 입력은 5
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하시오");

		int num = sc.nextInt();

		for (int i = 4; i <= 6; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf(i + "X" + j + "=" + i * j + "\t");
			}
			System.out.printf("\n");
		}

	}

}
