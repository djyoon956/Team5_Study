package Team5_Final;

import java.util.Map;
import java.util.Scanner;

public class PCmanagement {
	private Scanner scanner;
	private Map<String, User> users;
	private Computer[] computers;
	User user;

	public PCmanagement(Scanner scanner) {
		this.scanner = scanner;
		computers = initComputers();
		user = new User();
	}

	public void showMenu(Map<String, User> users) {
		this.users = users;

		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 자리이동");
		int choice = ValidataionHelper.checkChoiceNumber(scanner, 1, 3);
		switch (choice) {
		case 1:
			showSeat();
			selectSeat();
			break;
		case 2:
			logout();
			break;
		case 3:
			move();
			break;
		}
	}

	public void showSeat() { // 접근제어자
		for (int i = 1; i <= computers.length - 1; i++) {
			if (computers[i].getIsUse()) {
				System.out.print("■");
			} else {
				System.out.print("□");
			}
			if ((i % 5) == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	private void selectSeat() {
		int seatNum = ValidataionHelper.checkChoiceNumber(scanner, 1, 20);
		Computer selectComputer = computers[seatNum];
		if (!selectComputer.getIsUse()) {
			if (login(selectComputer)) {
				showSeat();
				System.out.println("좌석선택 완료");
			} else
				System.out.println("로그인 실패로 이전 메뉴로 돌아갑니다.");
		} else
			System.out.println("사용중인 좌석입니다.");

		System.out.println();
	}

	private boolean login(Computer selectComputer) {
		int tryCount = 3;
		boolean loginCheck = false;

		for (int i = tryCount; i > 0; i--) {
			System.out.print("ID를 입력해 주세요 : ");
			String id = scanner.next();
			User target = users.get(id);
			// target.setSaveTime(30); // 테스트 용 코드
			if (target != null) {
				System.out.print("비밀번호를 입력해 주세요 : ");
				String password = scanner.next();
				if (target.getPassword().equals(password)) {
					if (target.getIsLogin()) {
						System.out.println("이미 로그인 중인 아이디입니다.");
						break;
					} else if (target.getSaveTime() < 1) {
						System.out.println("사용가능한 시간이 없습니다.");
						break;
					}

					System.out.println("로그인 성공 하셨습니다.");
					selectComputer.powerOn(target);

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

	private Computer[] initComputers() {
		Computer[] computers = new Computer[21];

		for (int i = 0; i < computers.length; i++)
			computers[i] = new Computer(i + 1);

		return computers;
	}

	private void logout() {
		int tryCount = 3;

		for (int i = tryCount; i > 0; i--) {
			System.out.print("ID를 입력해 주세요 : ");
			String id = scanner.next();
			User target = users.get(id);
			if (target != null) {
				System.out.print("비밀번호를 입력해 주세요 : ");
				String password = scanner.next();
				if (target.getPassword().equals(password)) {
					if (target.getIsLogin()) {
						for (Computer computer : computers) {
							if (computer.getUser() != null && computer.getUser().equals(target)) {
								computer.powerOff();
							}
						}
					} else {
						System.out.println("미 사용중인 사용자입니다.");
					}
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
	}

	private void move() {
		System.out.println("ID를 입력해주세요.");
		String id = scanner.nextLine();
		scanner.next();
		
		for (Computer computer : computers) {
			System.out.println(computer.toString());
			if (computer.getIsUse() && computer.getUser().getId().equals(id)) { 
				// 컴퓨터가 사용중이고 컴퓨터에 user 아이디가 같다면
				System.out.println("이동하실 자리번호를 입력해주세요.");
				int comNum = ValidataionHelper.checkChoiceNumber(scanner, 1, 20);
				if (!computers[comNum].getIsUse()) { // 선택한 좌석이 사용중이지 않다면
					computer.powerOff();
					computers[comNum].setUser(computer.getUser());
					computer.powerOn(user);
					break;
				} else {
					System.out.println("사용중인 좌석입니다.");
					break;
				}
			}
		}
	}
}
