package quiz_week01.hayeon;
import java.util.Scanner;

public class quiz_week01_hayeon {

	public static void main(String[] args) {
		// 구구단 단수를 입력받아 입력받은 단수의 -1~+1 단을 가로로 출력하기
		// 입력은 5
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하시오");
		int dan = sc.nextInt();
		for(int i=dan-1; i<=dan+1; i++) {
			
		for (int j = 1; j <= 9; j++) {

				System.out.print(i + "X" + j + "=" + i * j + "\t\t");

			}
			System.out.println("");
		}

	}

}
