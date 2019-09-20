package Team5_Final;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Admin {
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";
	private boolean isAdmin;
	private String userFilenName;
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private Scanner scanner;

	public Admin() {
		users = initUsers();
		scanner = new Scanner(System.in);
		userFilenName = "PcUsers.txt";
	}
	
	
	public void adminStart() {
		adminLogin();
	}
	public void adminLogin() {
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

			int choice = ValidataionHelper.checkChoiceNumber(scanner, 1, 5);
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

			int choice = ValidataionHelper.checkChoiceNumber(scanner, 1, 4);
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