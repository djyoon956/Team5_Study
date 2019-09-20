package Team5_Final.hy;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.*;
import vending.Product;

public class ShowStock {
	private static final Drink_hy Drink_hy = null;
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private List<Product> products;
	private Admin admin;
	private PCmanagement pcm;
	private Scanner scanner;
	private String userFilenName;
	private int totalPrice;
	private int totalSales;
	private static Drink_hy drink;
	private Snack_hy snack;
	int count = 100; // 음료, 과자는 초기값 100개가 있는 상태이다.

	private void addSub(Drink_hy drink) { // 음료,과자 재고관리
		scanner = new Scanner(System.in);
		drink = new Drink_hy();

		System.out.println("관리할 품목을 선택해주세요.");
		System.out.println("1. 음료\t2. 과자");
		System.out.print(">> ");
		int num = scanner.nextInt();

		// 음료
		if (num == 1) {
			System.out.println("1. 발주\t2. 반품");
			System.out.print(">> ");
			int num1 = scanner.nextInt();
			if (num1 == 1) {// 발주
				System.out.println("몇 개를 발주넣으겠습니까?");
				System.out.print(">> ");
				int nb = scanner.nextInt();
				int add = count += nb;
				System.out.println("현재 음료 재고" + add + "개 있습니다.");
			} else if (num1 == 2) {// 반품
				System.out.println("몇 개를 반품하시겠습니까?");
				System.out.print(">> ");
				int nb = scanner.nextInt();
				if (count > nb) {
					int sub = count -= nb;
					System.out.println("현재 음료 재고" + sub + "개 있습니다.");
				} else {
					System.out.println("갯수가 부족합니다. 다시 입력해주세요.");
					addSub(drink);
				}

			}
		}
		if (num == 2) {
			System.out.println("1. 발주\t2. 반품");
			System.out.print(">> ");
			int num1 = scanner.nextInt();
			if (num1 == 1) {// 발주
				System.out.println("몇 개를 발주넣으겠습니까?");
				System.out.print(">> ");
				int nb = scanner.nextInt();
				int add = count += nb;
				System.out.println("현재 과자 재고" + add + "개 있습니다.");
			} else if (num1 == 2) {// 반품
				System.out.println("몇 개를 반품하시겠습니까?");
				System.out.print(">> ");
				int nb = scanner.nextInt();
				if (count > nb) {
					int sub = count -= nb;
					System.out.println("현재 과자 재고" + sub + "개 있습니다.");
				} else {
					System.out.println("갯수가 부족합니다. 다시 입력해주세요.");
					addSub(drink);
				}

			}
		}
	}

	public static void main(String[] args) {
		ShowStock showstock = new ShowStock();
		showstock.addSub(drink);

	}

}
