package Team5_Final;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PCRoom {
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private Admin admin;
	private PCmanagement pcm;
	private Scanner scanner;
	private String userFilenName;

	public PCRoom() {
		userFilenName = "PcUsers.txt";
		scanner = new Scanner(System.in);

		admin = new Admin(scanner);
		pcm = new PCmanagement(scanner);
		users = initUsers();
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
				admin.adminStart(users);
				break;
			}
		}
	}

	private Map<String, User> initUsers() {
		Map<String, User> users = null;
		File file = new File(userFilenName);

		if (file.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				users = (HashMap<String, User>) ois.readObject();
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}
		} else
			users = new HashMap<String, User>();

		return users;
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
			addTime();
			break;
		case 3:
			pcm.pcStart(); // 현재 좌석상태 출력
			break;
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

	private void addTime() {
		System.out.print("시간을 추가 할 회원 ID를 입력하세요 : ");
		String id = scanner.next();
		if (users.containsKey(id)) {
			showPcMenu();

			System.out.print("번호를 선택해주세요 : ");
			int choicenum = scanner.nextInt();

			switch (choicenum) {
			case 1:
				users.get(id).setTotalTime(1.0);
				users.get(id).setSaveTime(1.0);
				System.out.print("시간 추가를 위해 지불할 돈을 입력하세요 : ");
				int money1 = scanner.nextInt();
				System.out.println("1시간이 추가 되었습니다.");
				if (money1 > 1000) {
					int change = money1 - 1000;
					System.out.println("거스름 돈 입니다. " + change + "원 입니다.");
				}
				break;
			case 2:
				users.get(id).setTotalTime(6.0);
				users.get(id).setSaveTime(6.0);
				System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
				int money2 = scanner.nextInt();
				System.out.println("6시간이 충전되었습니다.");
				if (money2 > 5000) {
					int change = money2 - 5000;
					System.out.println("거스름 돈 입니다. " + change + "원 입니다.");
				}
				break;
			case 3:
				users.get(id).setTotalTime(15.0);
				users.get(id).setSaveTime(15.0);
				System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
				int money3 = scanner.nextInt();
				System.out.println("15시간이 충전되었습니다.");

				if (money3 > 10000) {
					int change = money3 - 10000;
					System.out.println("거스름 돈은 " + change + "원 입니다.");
				}
				break;
			default:
				System.out.println("요금표에 맞는 금액을 충전해주세요.");
			}

		} else {
			System.out.println("ID를 확인해주세요.");
		}

	}

	public void showPcMenu() {
		System.out.println("=====================");
		System.out.println("==== 회원 시간 요금제  =====");
		System.out.println("==== 1.1000원 1시간   =====");
		System.out.println("==== 2.5000원 6시간   =====");
		System.out.println("==== 3.10000원 15시간 ====");
		System.out.println("=======================");
		System.out.println("1~3번중에 맞는 요금으로 선택해 주세요.");

	}
}
