package quiz_week01_02.hyungnam;
import java.util.Scanner;

public class Quiz_week01_02_hn {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		switch (str) {
		case "짝수": 
			for(int i=2; i<10; i+=2) {
				System.out.println(i+ " 단 =======");
				for(int j=1; j<10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
			break;
			
		case "홀수":
			for (int i = 2; i < 10; i++) {
				if (i % 2 == 1) {
					System.out.println(i + " 단 =======");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
			}
			break;

		default: System.out.println("짝수나 홀수를 입력해주세요");
			break;
		}
	}

}
