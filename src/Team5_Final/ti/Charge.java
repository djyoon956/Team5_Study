package Team5_Final.ti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.Product;
import Team5_Final.User;

//PC시간 충전 기능
//매출 확인 기능
//재고 확인 기능

//요금판 출력
public class Charge {
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

	public Charge() { // 사용자로부터 돈을 입력 받으면, 그 만큼의 시간을 반환합니다.
		users = new HashMap<String, User>();
		scanner = new Scanner(System.in);
	} // 차지함수끝

	public void charge() {
		// 1. id 입력받기
		// users = new HashMap<String, User>();
		// scanner = new Scanner(System.in);
		System.out.print("시간을 추가 할 회원 ID를 입력하세요 : ");
		String id = scanner.nextLine();
		if (users.containsKey(id)) {
			showMenu();

			System.out.print("번호를 선택해주세요 : ");
			int choicenum = scanner.nextInt();

			// 2. 회원중 id 일치하는 회원 찾기

			switch (choicenum) {
			case 1:
				users.get(id).setTotalTime(1000);
				users.get(id).setSaveTime(1000);
				System.out.print("시간 추가를 위해 지불할 돈을 입력하세요 : ");
				int money1 = scanner.nextInt();
				System.out.println("1시간이 추가 되었습니다.");
				if (money1 > 1000) {
					int change = money1 - 1000;
					System.out.println("거스름 돈 입니다. " + change + "원 입니다.");
				}
				break;
			case 2:
				users.get(id).setTotalTime(5000);
				users.get(id).setSaveTime(5000);
				System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
				int money2 = scanner.nextInt();
				System.out.println("6시간이 충전되었습니다.");
				if (money2 > 5000) {
					int change = money2 - 5000;
					System.out.println("거스름 돈 입니다. " + change + "원 입니다.");
				}
				break;
			case 3:
				users.get(id).setTotalTime(10000);
				users.get(id).setSaveTime(10000);
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

	public void showMenu() {
		System.out.println("=====================");
		System.out.println("==== 회원 시간 요금제  =====");
		System.out.println("==== 1.1000원 1시간   =====");
		System.out.println("==== 2.5000원 6시간   =====");
		System.out.println("==== 3.10000원 15시간 ====");
		System.out.println("=======================");
		System.out.println("1~3번중에 맞는 요금으로 선택해 주세요.");

	}

	private int checkChange(int inputMoney, int price) { // 거스름돈, 남은돈 출력
		return inputMoney - price;
	}

	public static void main(String[] args) {
		// users.put("taeik0303", new User("권태일", "010-3148-1088", 32, "1234",
		// "888888-1111111"));
		Charge charge = new Charge();
		charge.users.put("taeik0303", new User("권태일", "010-3148-1088", "taeik0303", "1234", "888888-1111111"));
		charge.charge();

	}

}