package Ex_Team1;

import java.util.Scanner;

public class ParkingMain {

	public static void main(String[] args) {
		Parking smart = new Parking("smart", '△', 1000);
		Parking web = new Parking("web", '▽', 1000);
		Parking java = new Parking("java", '□', 1000);

		Scanner scanner = new Scanner(System.in);
		System.out.println("차종을 입력해주세요");
		String cName = scanner.nextLine();

		switch (cName) {
		case "smart":
		smart.markSmart();
		break;
		case "web":
		smart.markWeb();
		break;
		case "java":
		smart.markJava();
		break;

		default:
		System.out.println("차종이 맞지 않습니다.");
		break;
				}

			}

		}

	class Parking {
		private String cName;
		private int cPrice;
		private char cChar;

		public Parking(String cName, char cChar, int cPrice) {
			this.cName = cName;
			this.cPrice = cPrice;
			this.cChar = cChar;
		}

		public void markSmart() {
			for (int i = 0; i < 5; i++) {
				for (int j = 4; j > i; j--)
					System.out.print(" ");
				for (int k = 0; k < i * 2 + 1; k++)
					System.out.print("*");
				System.out.println();
			}

			System.out.printf("%s %c %d\n", cName, cChar, cPrice);
		}
		
		public void markWeb() {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i; j++)
					System.out.print(" ");
				for (int k = 9; k > i * 2; k--)
					System.out.print("*");
				System.out.println();
			}

			System.out.printf("%s %c %d\n", cName, cChar, cPrice);
		}
		
		public void markJava() {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 15; j++)
					System.out.print("*");
				System.out.println();
			}

			System.out.printf("%s %c %d\n", cName, cChar, cPrice);
		}
	}
