package vending;

import java.util.Scanner;

public class VendingMachine {   //자판기 클래
	private Drink[] drinks;	   //Drink 타입으로 배열 선언
	private int inputMoney;		//사용자에게 받을 돈을 담는  변수 선언
	Scanner scanner;		//입력받기위한 Scanner 변수 선언 

	public VendingMachine() {  //생성 될  때 관리자로부터(처음부터) 기본 음료랑 가격 수량이 결정됨 
		scanner = new Scanner(System.in);
		drinks = new Drink[] { new Carbonated("탄산", 1300, 10)  // 드링크
									, new Tea("차", 800, 20)
									, new Coffee("맥심", 500, 50) };
	}

	public void start() { // 완전 처음 시작     자판기프로그램 시작 
		
		while (true) {   //와일문 시작 여기서 일반모드와 관리자모드를 선택 할 수 있음. 
				System.out.println("번호를 선택해주세요.");
				System.out.println("1. 자판기 사용\t2. 관리자모드 실행\t3.종료");
				int num = scanner.nextInt();  // 사용자에게 모드 입력받음 1번 이면 자판기 사용 함수 호
				switch (num) {
				case 1:
					startVending();
					break;
				case 2:								// 2번이면, 관리자모드 함수를 호출 
					adminMode();
					break;
				case 3:
					System.out.println("시스템을 종료합니다."); //3번 누르면 걍 아무것도 안하고 종
					System.exit(0);
					break;
				default:
				System.out.println("다시 입력해주세요.\n");
				return;
			}
		}
	}

	private void startVending() { // 자판기 사용 시작  // 만약 위에 While 문에서 1을 선택했다면 이 함수를 호출 
		System.out.println("자판기 사용을 시작합니다~");  
		while (true) {				//While문 무한 반복 , 밑에 3가지의 함수를 계속해서 호출하고 계속 반복함.
				showDrinkPrice();   
				input();
				comparison();
		}
	}

	private void showDrinkPrice() { // 메뉴 출력   // drinks 배열의 모든 값들의 속값들을 출력함 (= 음료수 정보 출력) 
		for (int i = 0; i < drinks.length; i++) { 
			System.out.println((i + 1) + ".\t" + drinks[i].toString());  //toString() 은 해당 클래스의 변수들의 정보를 출력해줌 
		}											//원래 toString() 은 자신(클래스)의 주소값을 반환하는 함수이나
	}													// 여기선 오버라이드해서 재활용
														//개발자들의 가장 만만한 함수가 toString() 함수임	
														//뭔가 동네북임. 원래 자기 용도로 쓰이질 않음.
														//항상 오버라이드 당함. 
	private void input() { // 금액 투입					
		System.out.println("금액을 넣어주세요.");  //위에서 음료정보를 출력받았으니, 이제 돈을 넣을 차례임 
		try {								
			this.inputMoney = scanner.nextInt();   // 사용자으로 부터 돈을입력받습니다. 
		}catch (Exception e) {
			System.out.println("다시 입력해주세요.\n"); //만약 위 try구문으로부터 오류가 발생한다면 뻑나지않고 예외처리
		}		
	}

	private void comparison() { // 실질적으로 음료선택, 비교하는 메소드
		Drink drink = choiceDrink();
		if (drink.count > 0) {
			if (inputMoney < drink.price) {
				System.out.println("잔액이 부족합니다.");
				showDrinkPrice();
				comparison();
			} else {
				inputMoney -= drink.price;
				drink.disCount();
				System.out.println(drink.name + "가(이) 나왔습니다. \n");
				checkChange();
			}
		} else {
			System.out.println("품절입니다.");
		}
	}

	private Drink choiceDrink() { // 음료 선택(comparison 도와주는 메소드
		System.out.println("음료 번호를 선택해주세요.");
		int num = scanner.nextInt();
		Drink drink = null;
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
			drink = drinks[num - 1];
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			System.out.println("다시 입력해주세요.");
			showDrinkPrice();
			comparison();
			break;
		}
		return drink;
	}

	private void adminMode() { // 관리자모드 메소드
		showDrinkPrice();
		Drink drink = choiceDrink();
		addSub(drink);
	}

	private void addSub(Drink drink) { // 음료 넣거나 빼는 메소드
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
			showDrinkPrice();
			comparison();
		}
	}





	private void endVending() { // 자판기 사용 종료
		System.out.println("자판기 사용을 종료합니다.");
		System.exit(0);
	}
}