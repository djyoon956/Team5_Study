package vending.sample.hn;

import java.util.Scanner;



public class VendingMachine {
	private Drink[] drinks;
	private int inputMoney;
	Scanner sc;
	Option[] options;
	boolean admin;
	
	public VendingMachine() { // 기본 음료 셋팅
		sc = new Scanner(System.in);
		drinks = new Drink[] { new Carbonated("탄산", 1300, 10)
									, new Tea("차", 800, 20)
									, new Coffee("맥심", 500, 50) };
		options = new Option[] {new Water(10), new Ice(10), new Pearl(10)};
	}
	
public void start() { // 완전 처음 시작
		
		while (true) {
				System.out.println("번호를 선택해주세요.");
				System.out.println("1. 자판기 사용\t2. 관리자모드 실행\t3.종료");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					startVending();
					input();
					//comparison();
					break;
				case 2:
					//adminMode();
					break;
				case 3:
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
					break;
				default:
				System.out.println("다시 입력해주세요.\n");
				return;
			}
		}
	}

	private void startVending() { // 자판기 사용 시작
		System.out.println("자판기 사용을 시작합니다~");
		while (true) {
		}
	}
	
	private void showDrinkPrice() { // 메뉴 출력
		int index=1;
		for (int i = 0; i < drinks.length; i++) {
			System.out.println(index + ".\t" + drinks[i].toString());
			++index;
		}
		if(admin!=false) {
			for(int i=0; i<options.length; i++) {
				System.out.println(index + ".\t" + options[i].toString());
				++index;
			}
		}
		
	}
	
	private void input() { // 금액 투입
		System.out.println("금액을 넣어주세요.");
		try {
			this.inputMoney = sc.nextInt();
		}catch (Exception e) {
			System.out.println("다시 입력해주세요.\n");
		}
	}
	private void adminMode() { // 관리자모드 메소드
		admin=true;
		showDrinkPrice();
		//Drink drink = choiceDrink();
		//addSub(drink);
	}
	private void addSub(Drink drink) { // 음료 넣거나 빼는 메소드
		System.out.println("선택해주세요.");
		System.out.println("1. 넣기\t2. 빼기");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("몇개를 넣으겠습니까");
			num = sc.nextInt();
			drink.count += num;
			System.out.println(drink.toString());
		} else if (num == 2) {
			System.out.println("몇개를 빼시겠습니까");
			num = sc.nextInt();
			if (drink.count > num) {
				drink.count -= num;
			} else {
				System.out.println("갯수가 부족합니다. 다시 입력해주세요.");
				//adminMode();
			}
		} else {
			System.out.println("다시 입력해주세요.");
			addSub(drink);
		}
	}
	
	private void checkChange() { // 거스름돈, 남은돈 출력
		if (this.inputMoney < 500) {
			System.out.println("거스름돈: " + this.inputMoney + "원\n");
			//endVending();
		} else {
			System.out.println("남은 돈: " + this.inputMoney + "원\n");
			showDrinkPrice();
			//comparison();
		}
	}

	private void endVending() { // 자판기 사용 종료
		System.out.println("자판기 사용을 종료합니다.");
		System.exit(0);
	}

}
