package Team5_Final.hn;

import java.util.*;

import Team5_Final.Product;
import Team5_Final.User;

public class PCmanagement {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";

	private Scanner scanner;
	private List<User> users; // 회원리스트
	private int totalSales; // 매출
	private boolean[] seats;
	private boolean isSeats;
	public List<HnProduct> products;
	public DrinkTest drink;
	public SnackTest snack;
	public int totalPrice = 0;

	// 게임 목록
	private boolean isAdmin;

	public PCmanagement() {
		scanner = new Scanner(System.in);
		products = new ArrayList<HnProduct>(); // 장바구니
		drink = new DrinkTest(100);
		snack = new SnackTest(100);
		seats = new boolean[21];
	}

	public void start() {
		while (true) {
			System.out.println("1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			int choice = validationChoiceNumber(1, 2);
			switch (choice) {
			case 1:
				order();
				checkChange();
				break;
			case 2:
				adminLogin();
				break;
			}
		}
	}


	private void adminLogin() {
		System.out.println("관리자 로그인을 시작합니다.");

		isAdmin = checkLoginCount(3);
		if (isAdmin) {
			System.out.println("관리자 로그인 성공!");
			showAdminMenu();
		} else
			System.out.println("관리자 로그인에 실패했습니다. 초기화면으로 이동합니다.");
	}

	private boolean checkLoginCount(int tryCount) {
		boolean result = false;
		String id = "";
		String password = "";
		for (int i = tryCount; i > 0; i--) {
			System.out.print("ID : ");
			id = scanner.next();
			System.out.print("Password : ");
			password = scanner.next();

			if (id.equals(ADMIN_ID) && password.equals(ADMIN_PW)) {
				result = true;
				break;
			} else if (tryCount > 1) {
				System.out.println("입력하신 정보가 일치하지 않습니다.");
				System.out.println("재시도 기회 : " + (i - 1) + "/" + tryCount);
			}
		}

		return result;
	}

	private void adminLogout() {
		isAdmin = false;
		System.out.println("관리자 모드를 종료합니다.");
	}

	private void showAdminMenu() {
		adminLoop: while (true) {
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. 관리자 로그아웃");

			int choice = validationChoiceNumber(1, 4);
			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				adminLogout();
				break adminLoop;
			}
		}
	}

	private int validationChoiceNumber(int startNumber, int endNumber) { // 천재...
		int choice = 0;
		String word = "입력";
		while (true) {
			System.out.printf("%s >> ", word);
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				if (choice >= startNumber && choice <= endNumber)
					break;
				else
					word = "재 입력";
			} else {
				scanner.next();
				word = "재 입력";
			}
		}

		return choice;
	}

	private void order() {

		

		int choice = 0;
		while (choice != 4) {
			showMenu();
			choice = validationChoiceNumber(1, 4);
			switch (choice) {
			case 1: // 음료수 장바구니에 담음
				products.add(new DrinkTest());
				totalPrice += drink.price;
				break;
			case 2: // 과자 장바구니에 담음
				products.add(new SnackTest());
				totalPrice += snack.price;
				break;
			case 3: // 결제
				checkChange();
				choice=0;
				break;
			case 4: // 주문취소
				System.out.println("주문이 취소되었습니다.");
				totalPrice = 0;
				products.clear();
				break;
			}
		}
	}
	
	private void checkChange() {
		System.out.println("주문확인");
		System.out.println("===========================");
		for (HnProduct hnProduct : products) {
			System.out.println(hnProduct.name + "\t" + hnProduct.price+ "원");
		}
		System.out.println("===========================");
		System.out.println("총 금액: "+ totalPrice+"원");
		System.out.println("[1]결제    [2]주문취소");
		
		int choice = validationChoiceNumber(1, 2);
		payLoop: switch (choice) {
		case 1:
			System.out.println("지불 금액을 입력해주세요.");
			int payout=scanner.nextInt();
			if (payout < totalPrice) {
				payout = 0;
				System.out.println("다시 입력해주세요.");
				System.out.print(">> ");
				break payLoop;
			} else {
				totalSales+=totalPrice;
				System.out.println("거스름돈: "+ (payout - totalPrice));
				System.out.println("주문이 완료되었습니다.");
			}
			break;
		case 2:
			System.out.println("결제가 취소되었습니다.");
			break;
		}
	}


	private void showMenu() {
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("[1]" + drink.toString() + "//[2]" + snack.toString() + "[3]결제//[4]주문취소");
	}

	void selectSeat(int seatNum) {
		if (seatNum != 0 && seatNum < seats.length) {
			if (!seats[seatNum]) {
				seats[seatNum] = true;
			} else {
				System.out.println("사용중인 좌석입니다.");
			}
		} else {
			System.out.println("잘못된 좌석번호입니다.");
		}
	}

	void showSeat() {
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
	}


}
