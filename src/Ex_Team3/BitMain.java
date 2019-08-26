package Ex_Team3;

import java.util.Scanner;

public class BitMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bit bit = new Bit("형남", "01036423603", "1123123123");
		
		bit.bitInfo();
		bit.bRequest();


	}
}

class Bit {
	private String bName;
	private String bPhone;
	private String bCard;

	public Bit(String bName, String bPhone) {
		System.out.println("내일배움카드가 없으면 신청이 불가능합니다.");

	}

	public Bit(String bName, String bPhone, String bCard) {
		this.bName = bName;
		this.bPhone = bPhone;
		this.bCard = bCard;
	}

	public void bRequest() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("* * * * 강의 번호를  선택해주세요 * * * *");
			System.out.println("1. java  / 2. pythone / 3. C / 4. 프로그램 종료 ");
			int num = 0;
			try {
				num = Integer.parseInt(sc.nextLine());
				if (num == 1) {
					System.out.println("강남점으로 가시면 됩니다.");
				} else if (num == 2) {
					System.out.println("서초 본원으로 가시면 됩니다.");
				} else if (num == 3) {
					System.out.println("종로점으로 가시면 됩니다.");
				} else {
					System.out.println("프로그램이 종료됩니다.");
					return;
				}
			} catch (Exception e) {
				System.out.println("1~4의 숫자를 입력해주세요");
				continue;
			}
		}
	}

	public void bitInfo() {
		if (bCard == null) {
			System.out.println(bName + " / " + bPhone);
		} else
			System.out.println(bName + " / " + bPhone + " / " + bCard);
	}

	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
	public String getbName() {
		return bName;
	}
	public String getbCard() {
		return bCard;

	}

}
