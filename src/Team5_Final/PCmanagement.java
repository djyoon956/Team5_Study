package Team5_Final;

import java.util.*;
import java.io.*;

public class PCmanagement {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";

	private Scanner scanner;
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private int totalSales; // 매출
	private List<Product> products;
	private boolean[] seats;
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
				userMode();
				break;
			case 2:
				adminLogin();
				break;
			}
		}
	}

	private void userMode() {
		System.out.println("1.회원가입");
		System.out.println("2.시간 충전");
		System.out.println("3.PC이용");
		int choice = validationChoiceNumber(1, 3);
		switch (choice) {
		case 1:
			// 회원가입
			break;
		case 2:
			// 시간충전
			break;
		case 3:
			showSeat(); // 현재 좌석상태 출력
			break;
		}
	}

	private void showSeat() {
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
		selectSeat();
	}

	void selectSeat() {
		int seatNum = validationChoiceNumber(1, 20);
		if (!seats[seatNum]) {
			seats[seatNum] = true;
		} else {
			System.out.println("사용중인 좌석입니다.");
		}
		System.out.println();
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
				saveUserInfoFile();
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

	public void searchAllUser() {
		List<User> targets = new ArrayList<User>(users.values());
		showSearchUsers(targets);
	}

	private void searchId() {
		System.out.print("검색 ID를 입력하세요 : ");
		String searchName = scanner.next();
		List<User> targets = new ArrayList<>();
		targets.add(users.get(searchName));

		showSearchUsers(targets);
	}

	private void searchName() {
		System.out.print("검색 이름을 입력하세요 : ");
		String searchName = scanner.next();
		List<User> targets = new ArrayList<>();
		for (User user : users.values()) {
			if (user.getName().contains(searchName))
				targets.add(user);
		}

		showSearchUsers(targets);
	}

	private void showSearchUsers(List<User> users) {
		if (users.size() > 0) {
			System.out.println("번호\t이름\t아이디\t전화번호\t나이\t주민 번호");
			System.out.println("─────────────────────────────────");
			for (int i = 0; i < users.size(); i++) {
				User user = users.get(i);
				System.out.printf("%02d\t%s\t%s\t%s\t%d\t%s\n", (i + 1), user.getName(), user.getId(),
						user.getPhoneNumber(), user.getAge(), user.getSecuritNumber().split("-")[0]);
			}
		} else
			System.out.println("검색 결과가 없습니다.");
	}

	public boolean login() {
		int tryCount = 3;
		boolean loginCheck = false;

		for (int i = tryCount; i > 0; i--) {
			System.out.print("ID를 입력해 주세요 : ");
			String id = scanner.next();
			User target = users.get(id);
			if (target != null) {
				System.out.print("비밀번호를 입력해 주세요 : ");
				String password = scanner.next();
				if (target.getPassword().equals(password)) {
					System.out.println("로그인 성공 하셨습니다.");
					loginCheck = true;
					break;
				} else {
					System.out.println("비밀번호를 다시 한 번 확인해주세요");
					System.out.println("재시도 기회 : " + (i - 1) + "/" + tryCount);
				}
			} else {
				System.out.println("일치하는 ID가 없습니다.");
				System.out.println("재시도 기회 : " + (i - 1) + "/" + tryCount);
			}
		}

		return loginCheck;
	}

	private void saveUserInfoFile() {
		String userCsv = "users.csv";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream(userCsv);
			osw = new OutputStreamWriter(fos, "EUC-KR");
			bw = new BufferedWriter(osw);

			bw.write("번호,이름,아이디,핸드폰 번호,나이,주민번호,누적 시간,가입일");
			bw.newLine();
			int index = 0;
			for (User user : users.values()) {
				bw.write(++index + "," + user.getName() + "," + user.getId() + "," + user.getPhoneNumber() + ","
						+ user.getAge() + "," + user.getSecuritNumber() + "," + user.getTotalTime() + ","
						+ user.getJoinDay());
				bw.newLine();
			}
			System.out.println("파일 저장을 완료했습니다.");
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			try {
				bw.close();
				osw.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
