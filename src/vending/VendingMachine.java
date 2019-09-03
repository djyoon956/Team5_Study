package vending;

import java.util.Scanner;

public class VendingMachine {
	Drink[] drinks;
	int inputMoney;

	public VendingMachine() {
		Scanner sc = new Scanner(System.in);
		drinks = new Drink[] { new Carbonated("탄산", 1300, 10), new FruitJuce("과일", 2500, 5), new Tea("차", 800, 20),
				new Coffee("맥심", 500, 50) };

	}

	void startVending() {
		while(true) {
			showDrinkPrice();
			input();
			choiceDrink();
		}

	}

	void showDrinkPrice() {
		for (Drink drink : drinks) {
			System.out.println(drink.toString());
		}
		System.out.println("");
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 넣어주세요.");
		this.inputMoney = sc.nextInt();
	}

	void choiceDrink() {
		Scanner sc = new Scanner(System.in);
		System.out.println("음료를 선택해주세요.");
		String choice = sc.nextLine();
		Drink d = null;
		switch (choice) {
		case "탄산":
			d = drinks[0];
			// choiceDrink();
			break;
		case "과일":
			d = drinks[1];
			break;
		case "차":
			d = drinks[2];
			break;
		case "커피":
			d = drinks[3];
			break;

		default:
			System.out.println("다시 입력해주세요.");
			return;
		}
		if (d.count > 0) {
			if (inputMoney < d.price) {
				System.out.println("잔액이 부족합니다.");
				choiceDrink();
			} else {
				inputMoney -= d.price;
				d.count--;
				System.out.println(d.name + "가(이) 나왔습니다. \n");
			}
			if(inputMoney<500) {
				checkChange();
				endVending();
			}
			else {
				choiceDrink();
			}
		} else {
			System.out.println("품절입니다.");
		}
	}

	void checkChange() {
		System.out.println("거스름돈: " + this.inputMoney + "\n");
	}

	void endVending() {
		checkChange();
		System.out.println("자판기 사용을 종료합니다.");
		System.exit(0);
	}

}
