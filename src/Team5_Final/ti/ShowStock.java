package Team5_Final.ti;

import java.awt.List;
import java.util.Map;
import java.util.Scanner;

import Ex_Team2.Product;
import Team5_Final.User;
import vending.Drink;

//재고 확인 기능

private String ShowStock(Drink drink) { // 옵션 추가
	private void addSub(Product drink) { 
		System.out.println("선택해주세요.");
		System.out.println("1. 넣기\t2. 빼기");
		System.out.print(">> ");
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.println("몇개를 넣으겠습니까");
			System.out.print(">> ");
			num = scanner.nextInt();
			drink.count += num;
			System.out.println(drink.toString());
		} else if (num == 2) {
			System.out.println("몇개를 빼시겠습니까");
			System.out.print(">> ");
			num = scanner.nextInt();
			if (drink.count > num) {
				drink.count -= num;
			} else {
				System.out.println("갯수가 부족합니다. 다시 입력해주세요.");
				addSub(drink);
			}
		} else {
			System.out.println("다시 입력해주세요.");
			addSub(drink);

	

	public static void main(String[] args) {
		
		System.out.println();

	}

}
