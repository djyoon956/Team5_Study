package Team5_Final;

import java.util.*;

import java.io.*;

public class PCmanagement {

	private Scanner scanner;

	private int totalSales; // 매출
	private List<Product> products;
	private boolean[] seats;
	private String userFilenName;
	Admin admin;

	public PCmanagement() {
		scanner = new Scanner(System.in);
		userFilenName = "PcUsers.txt";
		admin = new Admin();
	}

	public void start() {
		while (true) {
			System.out.println("1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			int choice = ValidataionHelper.checkChoiceNumber(scanner, 1, 2);
			switch (choice) {
			case 1:
				userMode();
				break;
			case 2:
				admin.adminLogin();
				break;
			}
		}
	}

	private void userMode() {
		System.out.println("1.회원가입");
		System.out.println("2.시간 충전");
		System.out.println("3.PC이용");
		int choice = ValidataionHelper.checkChoiceNumber(scanner, 1, 3);
		switch (choice) {
		case 1:
			signUp();
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
		int seatNum = ValidataionHelper.checkChoiceNumber(scanner, 1, 20);
		if (!seats[seatNum]) {
			seats[seatNum] = true;
		} else {
			System.out.println("사용중인 좌석입니다.");
		}
		System.out.println();
	}

	public boolean login() {
		int tryCount = 3;
		boolean loginCheck = false;

		for (int i = tryCount; i > 0; i--) {
			System.out.print("ID를 입력해 주세요 : ");
			String id = scanner.next();
			User target = admin.users.get(id);
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

	private void signUp() {
		System.out.println("회원가입을 시작합니다.");
		System.out.print("이름 >> ");
		String name = scanner.next().trim();

		if (!ValidataionHelper.checkName(name)) {
			System.out.println("이름 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("ID >> ");
		String id = scanner.next().trim();
		if (!ValidataionHelper.checkId(id)) {
			System.out.println("ID 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		} else if (users.containsKey(id)) {
			System.out.println("ID가 중복되었습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("비밀번호 >> ");
		String password = scanner.next().trim();

		System.out.print("휴대폰번호 (- 포함) >> ");
		String phoneNumber = scanner.next().trim();
		if (!ValidataionHelper.checkPhoneNumber(phoneNumber)) {
			System.out.println("휴대폰번호 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("주민등록번호 (- 포함)>> ");
		String securitNumber = scanner.next().trim(); // 앞뒤로 들어오는 공백을 없애기위해 trim()사용
		if (!ValidataionHelper.checkSecurit(securitNumber)) {
			System.out.println("주민등록번호 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		User user = new User(name, phoneNumber, id, password, securitNumber);
		users.put(user.getId(), user);
		System.out.println(user.getName() + "님 회원가입이 완료되었습니다.");
	}

	public void logout(String id) { // 일반 사용자 로그아웃(사용종료)
		if (users.get(id).isLogin()) {// 로그인 상태가 true 일 경우에만 로그아웃이 가능하다.
			users.get(id).setLogin(false); // 로그아웃 하면 로그인상태는 false 로 바뀐다.
			// 먼저 충전시간 - 사용시간 해서 saveTime 에 넣어줘야함
			System.out.println("당신의 남은 시간은 " + users.get(id).getSaveTime()); // 남은시간보여줌
			// 그리고 현재 좌석을 빈 좌석으로 다시 바꿔야함.

		} else {
			System.out.println("로그인을 먼저 해주세요. "); // 로그인상태가 false일 경우
			System.exit(0);
		}
	}
}
