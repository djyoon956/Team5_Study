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
	public int totalPrice=0;
	
	// 게임 목록
	private boolean isAdmin;

	public PCmanagement() {
		scanner = new Scanner(System.in);
		products = new ArrayList<HnProduct>(); // 장바구니
		drink=new DrinkTest("음료수", 1000, 100);
		snack=new SnackTest("과자", 1500, 100);
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
		while (true) {
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. 관리자 로그아웃");

			int choice = validationChoiceNumber(1, 4);
			adminLoop: switch (choice) {
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

	private int validationChoiceNumber(int startNumber, int endNumber) { //천재...
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
		
		showMenu();
		int choice = validationChoiceNumber(1, 3);
		switch (choice) {
		case 1: //음료수 장바구니에 담음
			products.add(new DrinkTest());
			totalPrice+=drink.price;
			break;
		case 2: //과자 장바구니에 담음
			products.add(new SnackTest());
			totalPrice+=snack.price;
			break;
		case 3: //결제
			System.out.println("총 금액은 " + totalPrice + "원 입니다.");
			break;
		
		default:
			break;
		}

	}

	private void showMenu() {
		System.out.println("메뉴를 선택해주세요.");
		System.out.println(drink.toString() + "//" + drink.toString());
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
	
	void whileTest() {
		
		while (true) {
			showSeat();
			System.out.println("좌석을 선택해주세요.");
			int select = scanner.nextInt();
			selectSeat(select);
			if(isSeats) {
				
			}
		}
	}
}
