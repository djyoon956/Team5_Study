package vending.sample.dj;

import java.util.Scanner;

public class VendingMachine_new {					// 자판기 클래스 입니다. 
	private final String ADMIN_ID = "1";           	// 관리자 로그인 기능을 위해 있습니다. 파이널상수로 정해져있습니다.
	private final String ADMIN_PASSWORD = "1";

	private int inputMoney;							// 사용자가 투입 할 돈을 담는 변수입니다. 
	private Scanner scanner;     					// 스캐너를 쓰기 위해 스캐너타입의 변수를 선언했습니다.
	private int total;								// 총매출액을 담기 위한 변수선언입니다.
	private boolean isAdmin;						// 관리자인지 아닌지 파악하기 위한 변수선
	private Drink choice;							// 드링크 타입의 변수선언, 사용자가 음료를 고르면 여기에 그 주소값이 저
	private Option option;							// 옵션타입의 옵션변수 선언, 옵션 선택시 여기에 그 데이터를 저장하고 주소를
													// 담게됩니다. 

	private Drink[] drinks;							// 드립크 타입의 배열 선언. 
	private Option[] options;						// 옵션 타입의 옵션 선언.

	public VendingMachine_new() { // 기본 음료 셋팅
		scanner = new Scanner(System.in);           // 스캐너사용을 위한 스캐너 객체생
		drinks = new Drink[] { new Carbonated("탄산", 1300, 10), new Tea("차", 800, 20), new Coffee("커피", 500, 50) };
		options = new Option[] { new Water(100), new Ice(100), new Pearl(50) };
	}												// 음료수들이랑 옵션들을 자판기가 생성됨과 동시에 채워넣습니다. 

	public void start() { //초기화면					// 자판기를 시작하는 코
		while (true) {
			System.out.println("번호를 선택해주세요.");	
			System.out.println("1. 자판기 사용\t2. 관리자 모드\t3.종료");
			System.out.print(">> ");
			int num = scanner.nextInt();			// 여기서 관리자모드와 일반사용자모드를 번호로 입력받습니다.
			switch (num) {							
			case 1:
				startVending();						// 1번일 경우 일반 사용자 모드이며, 바로 이 함수를 호출합니다.
				break;
			case 2:
				adminMode();						// 2번일 경우 관리자 모드 사용이며, 바로 이 함수를 호출합니다.
				break;
			case 3:
				endVending();						// 3번일 경우 종료하겠다는 뜻이며, 바로 프로그램을 종료하는 함수를 호출합니다.
				break;
			default:
				System.out.println("다시 입력해주세요."); //그 외 버튼을 입력하면 다시 입력해달라는 메시지가 출력됩니다.
				return;
			}
		}
	}

	private void startVending() { // 자판기 사용 시작
		System.out.println("*****자판기 사용을 시작합니다.*****\n");
		while (true) {
			showMenu();									// 음료수 메뉴를 보여주는 함수를 호출합니다.
			choice = choiceMenu();						// choiceMenu() 호출하면서 작동시키고 리턴값을 choice에 넣는다.
			if (choice == null) {						// 만약 주소가담겨있지 않다면, 
				System.out.println("다시 선택해 주세요.");
				continue;
			}
			String option = choiceOptions(choice);      //

			switch (checkChoiceMenu(option)) {
			case 1:
				input();
				start();
				break;
			case 2:
				continue;
			case 3:
				System.out.println("초기화면으로 이동합니다.");
				start();

			default:
				System.out.println("잘못된 입력입니다. 메뉴선택화면으로 이동합니다.");
				continue;
			}

		}
	}

	private void showMenu() { // 메뉴 출력      		// 드링크 배열에 음료수 종류별로 저장되어있다. 그걸 여기서 출력해서 보여준
		System.out.println("[메뉴 선택]\n");			// 메뉴선택을 하라고 출력해주고,
		int index = 1;
		for (int i = 0; i < drinks.length; i++) {	// 여기서 포문으로 돌며서 저장된 음료수 정보들을 출력해준다.
			System.out.println(index + ".\t" + drinks[i].toString());
			index++;
		}

		if (isAdmin) {								// 만약 사용자가 일반사용자가아니라 관리자를 통해서 들어온거라면 
													// 다음과 같이 음료와 옵션(재료들)들의 재고까지 보여준다. 
			for (int i = 0; i < options.length; i++) {
				System.out.println(index + ".\t" + options[i].toString());
				index++;
			}
		}
	}

	private void input() { // 금액 투입
		System.out.println("금액을 넣어주세요.");
		System.out.print(">> ");

		while (true) {
			inputMoney = scanner.nextInt();

			if (inputMoney < choice.price) {
				inputMoney = 0;
				System.out.println("다시 넣어주세요.");
				System.out.print(">> ");
				continue;
			} else {
				total += choice.price;
				choice.disCount();
				System.out.println(choice.name + "가(이) 나왔습니다.");
				System.out.println("거스름 돈 : " + checkChange(inputMoney, choice.price)+"\n");
				
				break;
			}
		}
	}

	private Drink choiceMenu() { //고른 음료 확인
		Drink drink = (Drink) choiceDrink();    // 다시 choiceDrink()를 호출하면서 그 타입을 Drink로 형변환 시키고 drink변수
		if (drink.count == 0) {					// 담는다.
			drink = null;
			System.out.println("품절입니다.");
		}

		return drink;
	}

	private Product choiceDrink() { //음료 선택	  	// 여기가 진짜 음료선택과정 시작.
		System.out.println("음료 번호를 선택해주세요.");	//
		Product pick = null;						// Product 타입의 pick 변수를 우선  초기화시킨다.
		int num = 0;
		boolean isChoice = false;
		do {
			System.out.print(">> ");
			isChoice = false;
			num = scanner.nextInt();
			if (num > 0 && num < 4)
				pick = drinks[num - 1];
			else if (isAdmin && (num > 3 && num < 7))
				pick = options[num - 4];
			else {
				System.out.println("선택 오류 입니다. 다시 입력해주세요.");
				isChoice = true;
			}
		} while (isChoice);

		return pick;
	}

	private String choiceOptions(Drink drink) { //옵션 추가
		int input = 0;
		String result = "";

		System.out.println("\n[옵션 설정]\n");
		if (drink.isCostomIce) {
			option=options[0];
			System.out.println("얼음 양 설정");
			System.out.println("1.적게\t2.보통\t3.많게");
			System.out.print(">> ");
			input = scanner.nextInt();
			if (input == 1) {
				result += "얼음 양 : 적게\n";
				option.disOptionCount(1);
			}
			else if (input == 2) {
				result += "얼음 양 : 보통 \n";
				option.disOptionCount(2);
			}
			else if (input == 3) {
				result += "얼음 양 : 많게\n";
				option.disOptionCount(3);
			}
		}
		if (drink.isCostomWater) {
			option=options[1];
			System.out.println("물 양 설정");
			System.out.println("1.적게\t2.보통\t3.많게");
			System.out.print(">> ");
			input = scanner.nextInt();
			if (input == 1) {
				result += "얼음 양 : 적게\n";
				option.disOptionCount(1);
			}
			else if (input == 2) {
				result += "얼음 양 : 보통 \n";
				option.disOptionCount(2);
			}
			else if (input == 3) {
				result += "얼음 양 : 많게\n";
				option.disOptionCount(3);
			}
		}
		if (drink.isCostomPearl) {
			option=options[2];
			System.out.println("펄 추가 (+500원)");
			System.out.println("1.예\t2.아니오");
			System.out.print(">> ");
			input = scanner.nextInt();
			if (input == 1) {
				result += "펄 추가\n";
				drink.price += 500;
				option.disOptionCount(1);
			}
		}

		return result;
	}

	private int checkChoiceMenu(String option) { //주문표 출력
		System.out.println("---------주 문 표---------");
		System.out.printf("선 택 음료 : %s\n", choice.name);
		System.out.println(option);
		System.out.println("금액 : " + choice.price);
		System.out.println("------------------------");

		System.out.println("1. 주문\t2. 주문취소\t 3. 초기화면");
		System.out.print(">> ");
		return scanner.nextInt();

	}

	private void adminMode() { // 관리자모드 메소드
		adminLogin();
		while (isAdmin) {
			System.out.println("───────────────관리자 메뉴───────────────");
			System.out.println("│1. 물품 관리\t\t2. 매출 확인\t\t 3.로그아웃  │");
			System.out.println("────────────────────────────────────");
			System.out.print(">> ");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				showMenu();
				Product drink = choiceDrink();
				addSub(drink);
				break;
			case 2:
				showTotal();
				break;
			case 3:
				adminLogout();
				break;
			default:
				System.out.println("다시 입력해주세요.");
				return;
			}
		}
	}

	private void adminLogin() { //관리자모드 로그인
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
			isAdmin = isLogin;
			System.out.println(isLogin ? "로그인 성공!" : "로그인 실패!");
		} while (!isLogin);

	}

	private void adminLogout() { //관리자모드 로그아웃
		isAdmin = false;
	}

	private void showTotal() { //매출 출력하는 관리자 전용 메소드
		System.out.println("매출 현황 : " + total + "원");
	}

	private void addSub(Product drink) { // 음료,옵션 넣거나 빼는 관리자 전용 메소드
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
		}
	}

	private int checkChange(int inputMoney, int price) { // 거스름돈, 남은돈 출력
		return inputMoney - price;
	}

	private void endVending() { // 자판기 사용 종료
		System.out.println("자판기 사용을 종료합니다.");
		System.exit(0);
	}
}