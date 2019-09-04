package vending.sample.dj;

import java.util.Scanner;

public class VendingMachine {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PASSWORD = "admin123";

	private int inputMoney;
	private Scanner scanner;
	private int total;

	private Drink[] drinks;
	private Option[] options;

	public VendingMachine() { // 기본 음료 셋팅
		scanner = new Scanner(System.in);
		drinks = new Drink[] { new Carbonated("탄산", 1300, 10), new Tea("차", 800, 20), new Coffee("맥심", 500, 50) };
		options = new Option[] { new Water(10), new Ice(10), new Pearl(10) };
	}

	public void start() {
		while (true) {
			System.out.println("번호를 선택해주세요.");
			System.out.println("1. 자판기 사용\t2. 관리자모드 실행\t3.종료");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				startVending();
				break;
			case 2:
				adminMode();
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
			showDrinkMenu(false);
			input();
			comparison();
		}
	}

	private void showDrinkMenu(boolean isAdmin) { // 메뉴 출력
		int index = 1;
		for (int i = 0; i < drinks.length; i++) {
			System.out.println(index + ".\t" + drinks[i].toString());
			index++;
		}

		if (isAdmin) {
			for (int i = 0; i < options.length; i++) {
				System.out.println(index + ".\t" + options[i].toString());
				index++;
			}
		}
	}

	private void input() { // 금액 투입
		System.out.println("금액을 넣어주세요.");
		try {
			this.inputMoney = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("다시 입력해주세요.");
		}
	}

	private void comparison() { // 실질적으로 음료선택, 비교하는 메소드
		Drink drink = (Drink) choiceDrink(false);
		if (drink.count > 0) {
			if (inputMoney < drink.price) {
				System.out.println("잔액이 부족합니다.");
				showDrinkMenu(false);
				comparison();
			} else {
				String options = checkOptions(drink);
				inputMoney -= drink.price;
				total += drink.price;
				drink.disCount();
				System.out.println(drink.name + "\n------------\n" + options + "------------\n" + "가(이) 나왔습니다. \n");
				checkChange();
			}
		} else
			System.out.println("품절입니다.");
	}

	private Product choiceDrink(boolean isAdmin) { // 음료 선택(comparison 도와주는 메소드
		System.out.println("음료 번호를 선택해주세요.");
		int num = scanner.nextInt();
		Product pick = null;

		if (num > 0 && num < 4)
			pick = drinks[num - 1];
		else if (isAdmin && (num > 3 && num < 7))
			pick = options[num - 4];
		else {
			System.out.println("다시 입력해주세요.");
			showDrinkMenu(false);
			comparison();
		}

		return pick;
	}

	private String checkOptions(Drink drink) {
		int input = 0;
		String result = "";

		if (drink.isCostomIce) {
			System.out.println("얼음 양 설정");
			System.out.println("1.적게\t2.보통\t3.많게");
			input = scanner.nextInt();
			if (input == 1)
				result += "얼음 양 : 적게\n";
			else if (input == 2)
				result += "얼음 양 : 보통 \n";
			else if (input == 3)
				result += "얼음 양 : 많게\n";
		}
		if (drink.isCostomWater) {
			System.out.println("물 양 설정");
			System.out.println("1.적게\t2.보통\t3.많게");
			input = scanner.nextInt();
			if (input == 1)
				result += "물 양 : 적게\n";
			else if (input == 2)
				result += "물 양 : 보통\n";
			else if (input == 3)
				result += "물 양 : 많게\n";
		}
		if (drink.isCostomPearl && inputMoney > (drink.price + 500)) {
			System.out.println("펄 추가 (+500원)");
			System.out.println("1.예\t2.아니오");
			input = scanner.nextInt();
			if (input == 1) {
				result += "펄 추가\n";
				drink.price += 500;
			}
		}
		return result;
	}

	private void adminMode() { // 관리자모드 메소드
		adminLogin();
		showDrinkMenu(true);
		Product drink = choiceDrink(true);
		addSub(drink);
	}

	private void adminLogin() {
		String id = "";
		String password = "";
		boolean isLogin = false;
		do {
			System.out.println("************관리자 로그인************");
			System.out.print("Id : ");
			id = scanner.next();
			System.out.print("Password : ");
			password = scanner.next();
			isLogin = id.equals(ADMIN_ID) && password.equals(ADMIN_PASSWORD);
			System.out.println(isLogin ? "로그인 성공!" : "로그인 실패!");
		} while (!isLogin);
	}

	private void addSub(Product drink) { // 음료 넣거나 빼는 메소드
		System.out.println("선택해주세요.");
		System.out.println("1. 넣기\t2. 빼기");
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.println("몇개를 넣으겠습니까");
			num = scanner.nextInt();
			drink.count += num;
			System.out.println(drink.toString());
		} else if (num == 2) {
			System.out.println("몇개를 빼시겠습니까");
			num = scanner.nextInt();
			if (drink.count > num) {
				drink.count -= num;
			} else {
				System.out.println("갯수가 부족합니다. 다시 입력해주세요.");
				adminMode();
			}
		} else {
			System.out.println("다시 입력해주세요.");
			addSub(drink);
		}
	}

	private void checkChange() { // 거스름돈, 남은돈 출력
		if (this.inputMoney < 500) {
			System.out.println("거스름돈: " + this.inputMoney + "원\n");
			endVending();
		} else {
			System.out.println("남은 돈: " + this.inputMoney + "원\n");
			showDrinkMenu(false);
			comparison();
		}
	}

	private void endVending() { // 자판기 사용 종료
		System.out.println("자판기 사용을 종료합니다.");
		System.exit(0);
	}
}