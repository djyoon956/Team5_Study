package Team5_Final;

import java.util.*;

import java.io.*;

public class PCmanagement {

	private Scanner scanner;
	Computer[] computers;

	public PCmanagement(Scanner scanner) {
		this.scanner = scanner;
		computers = new Computer[21];

		for (int i = 0; i < computers.length; i++)
			computers[i] = new Computer(i + 1);
	}

	public void pcStart() {
		showSeat();
		selectSeat();
	}
	
	void showSeat() {
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
	}

	void selectSeat() {
		int seatNum = ValidataionHelper.checkChoiceNumber(scanner, 1, 20);
		if (!computers[seatNum].isUse) {
			computers[seatNum].isUse = true;
			showSeat();
			System.out.println("좌석선택 완료");
		}
		
		else
			System.out.println("사용중인 좌석입니다.");

		System.out.println();
	}
}
