package Ex_Team4;

import java.util.Scanner;

public class Departmentstore {
	// 백화점은 브랜드와 층을 가지고 있다.
	private String brand;
	private int floor;

	// 백화점이 있으면 브랜드의 층이 존재해야한다.
	public Departmentstore(String brand, int floor) {
		this.brand = brand;
		this.floor = floor;
	}

	public void getBrandByFloor() {
		Scanner scanner = new Scanner(System.in);
		int floor = 0;

		do {
			System.out.print("층 수를 입력하세요 : ");
			System.out.print("956 입력시 종료됩니다.");
			if (scanner.hasNextInt()) {
				floor = scanner.nextInt();
				if (floor == 956)
					System.exit(0);
			} else
				scanner.next();
		} while (this.floor != floor);

		if (this.floor == floor) {
			System.out.printf("%d층 - %s", floor, brand);

		}
	}

	// 백화점의 이름과 층은 한번에 확인할 수 있다
	public void printInfo() {
		System.out.printf("이름 : %s, 층 : %d\n", brand, floor);
	}
}
