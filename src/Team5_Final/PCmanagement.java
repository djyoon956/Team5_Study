package Team5_Final;

import java.util.*;

import java.io.*;

public class PCmanagement {

	private Scanner scanner;
	Computer[] computers;

	public PCmanagement(Scanner scanner) {
		this.scanner = scanner;
		computers = new Computer[20];

		for (int i = 0; i < 20; i++)
			computers[i] = new Computer(i + 1);
	}

	public void pcStart() {
		for (int i = 1; i <= computers.length - 1; i++) {
			if (computers[i].isUse) {
				System.out.print("■");
			} else {
				System.out.print("□");
			}
			if ((i % 5) == 0) {
				System.out.println();
			}
		}
		selectSeat();
	}

	void selectSeat() {
		int seatNum = ValidataionHelper.checkChoiceNumber(scanner, 1, 20);
		if (!computers[seatNum].isUse)
			computers[seatNum].isUse = true;
		else
			System.out.println("사용중인 좌석입니다.");

		System.out.println();
	}
<<<<<<< HEAD

	private void showTotal() { // 매출 출력하는 관리자 전용 메소드
		
		System.out.println("매출 현황 : " + totalSales + "원");
	}



	
=======
>>>>>>> f23968a799c9fc6d8de44fe12973766858779dc6
}
