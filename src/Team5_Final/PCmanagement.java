package Team5_Final;

import java.util.*;
import java.io.*;

public class PCmanagement {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";

	private Scanner scanner;
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private int totalSales; // 매출
	private int[][] seats; // pc 좌석
	private List<Product> products;
	// 게임 목록
	private boolean isAdmin;
	private String userFilenName;

	public PCmanagement() {
		scanner = new Scanner(System.in);
		userFilenName = "PcUsers.txt";
		users = initUsers();
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
		adminLoop: while (true) {
			System.out.println("1. 회원 조회");
			System.out.println("2. 파일 저장");
			System.out.println("3. 발주");
			System.out.println("4. 관리자 로그아웃");
			System.out.println("5. 프로그램 종료");

			int choice = validationChoiceNumber(1, 5);
			switch (choice) {
			case 1:
				showSearchMenu();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				adminLogout();
				break adminLoop;
			case 5:
				exitPCmanagement();
				break;
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

	private void exitPCmanagement() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFilenName))) {
			oos.writeObject(users);
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

		System.exit(0);
	}

	private Map<String, User> initUsers() {
		Map<String, User> users = null;
		File file = new File(userFilenName);

		if (file.exists()) {
			try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file))) {
				users = (HashMap<String, User>) oos.readObject();
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}
		} else
			users = new HashMap<String, User>();

		return users;
	}

	private void showSearchMenu() {
		searchLoop: while (true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. ID 조회");
			System.out.println("3. 이름 조회");
			System.out.println("4. 이전 메뉴로 돌아가기");

			int choice = validationChoiceNumber(1, 4);
			switch (choice) {
			case 1:
				searchAllUser();
				break;
			case 2:
				searchId();
				break;
			case 3:
				searchName();
				break;
			case 4:
				break searchLoop;
			}
		}
	}

	private void searchAllUser() {
		Iterator<User> iterator = users.values().iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			user.toString();
		}
	}

	private void searchId() {
		System.out.print("검색 ID를 입력하세요 : ");
		String searchName = scanner.next();

		User user = users.get(searchName);
		if (user != null)
			user.toString();
		else
			System.out.println("검색 결과가 없습니다.");
	}

	private void searchName() {
		System.out.print("검색 이름을 입력하세요 : ");
		String searchName = scanner.next();
		List<User> targets = new ArrayList<>();
		for (User user : users.values()) {
			if (user.getName().contains(searchName))
				targets.add(user);
		}

		if (targets.size() > 0) {
			System.out.println("검색 인원 : " + targets.size());
			targets.forEach(x -> x.toString());
		} else
			System.out.println("검색 결과가 없습니다.");
	}
}
