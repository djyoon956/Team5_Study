package Team5_Final.hn;

import java.util.Scanner;

class Test_hn {
	boolean[] arr = new boolean[21];
	Scanner sc = new Scanner(System.in);

	void showSeat() {
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i]) {
				System.out.print("■");
			} else {
				System.out.print("□");
			}
			if ((i % 5) == 0) {
				System.out.println();
			}
		}
	}

	void selectSeat(int seatNum) {
		if (seatNum != 0 && seatNum < arr.length) {
			if (!arr[seatNum]) {
				arr[seatNum] = true;
			} else {
				System.out.println("사용중인 좌석입니다.");
			}
		} else {
			System.out.println("잘못된 좌석번호입니다.");
		}
	}

	void whileTest() {

		while (true) {
			System.out.println("좌석을 선택해주세요.");
			int select = sc.nextInt();
			selectSeat(select);
			showSeat();
		}
	}
}

public class TestMain {
	public static void main(String[] args) {
//		Test_hn hn = new Test_hn();
//		hn.whileTest();
//		// hn.showSeat();
		PCmanagement pc=new PCmanagement();
		pc.products.add(new DrinkTest());
		pc.products.add(new DrinkTest());
		pc.products.add(new DrinkTest());
		pc.products.add(new SnackTest());
		pc.products.add(new SnackTest());
		pc.products.add(new SnackTest());
		pc.start();

	}

}