package Team5_Final;

import java.util.*;

import java.io.*;

public class PCmanagement {

	private Scanner scanner;

	private int totalSales; // 매출
	private List<Product> products;
	private boolean[] seats;
	Computer computer;
	
	Admin admin;

	public PCmanagement() {
		scanner = new Scanner(System.in);
		admin = new Admin();
		computer=new Computer();
	}



	

	public void pcStart() {
		for (int i = 1; i <= seats.length - 1; i++) {
			if (seats[i]) {
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
		if (!seats[seatNum]) {
			seats[seatNum] = true;
		} else {
			System.out.println("사용중인 좌석입니다.");
		}
		System.out.println();
	}


	
	



	
}
