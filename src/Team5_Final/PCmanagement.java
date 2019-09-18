package Team5_Final;

import java.util.*;

public class PCmanagement {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";

	private Scanner scanner;
	private List<User> users; // 회원리스트
	private int totalSales; // 매출
	private int[][] seats; // pc 좌석
	private 	List<Product> products;
	// 게임 목록
	private boolean isAdmin;

	public PCmanagement() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		while (true) {
			System.out.println("1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			int choice = validationChoiceNumber(1, 2);
			switch (choice) {
			case 1:

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

	private int validationChoiceNumber(int startNumber, int endNumber) {
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
}
