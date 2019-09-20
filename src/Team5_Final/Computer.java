package Team5_Final;

import java.util.List;
import java.util.Scanner;

public class Computer {
	int number;
	boolean isUse;
	Scanner scanner;

	public Computer(int number) {
		this.number = number;
		scanner = new Scanner(System.in);
	}

	public boolean login(List<User> users) {
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

	public void logout() {

	}
}
