package Ex_Team4;

import java.util.Scanner;

public class DepartmentMain {

	public static void main(String[] args) {
		Department department1 = new Department(1, "샤넬");
		Department department2 = new Department(2, "리바이스");
		Department department3 = new Department(3, "아이다스");
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = 0;
		while (true) {

				System.out.println("층수를 입력해주세요");
				num = Integer.parseInt(sc.nextLine());
				if (num == 1) {
					department1.floorInfo();
				} else if (num == 2) {
					department2.floorInfo();
				} else if (num == 3) {
					department3.floorInfo();
				} else if (num == 4) {
					System.out.println("프로그램이 종료되었습니다.");
					return;
				} else
					System.out.println("층수를 잘못 입력하셨습니다. 다시 입력해주세요");
			} 

	}
}

class Department {
	private int floor;
	private String brand;

	public Department(int floor, String brand) {
		this.brand = brand;
		this.floor = floor;
	}

	public void floorInfo() {
		System.out.println(floor + "층 - " + brand);
	}

}
