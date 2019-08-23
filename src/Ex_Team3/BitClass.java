package Ex_Team3;

public class BitClass {
	private String name;
	private String phoneNumber;
	private String cardNumber;

	// 7. 이름, 휴대폰번호, 카드번호 정보는 각각 확인할 수 있다.
	public String getNameString() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	// 1. 수강신청자는 반드시 이름, 휴대폰번호를 가지고 있다.
	public BitClass(String nameString, String phoneNumber) {
		this(nameString, phoneNumber, "");
	}

	public BitClass(String nameString, String phoneNumber, String cardNumber) {
		this.name = nameString;
		this.phoneNumber = phoneNumber;
		this.cardNumber = cardNumber;
	}

	// 3. 만약 내일 배움카드가 없으면 수강 신청이 불가능하다는 내용이 출력된다.
	public void apply() {
		System.out.println("내일 배움카드가 없으면 수강 신청이 불가능합니다.");
	}

	// 2. 수강신청에 성공하기 위해서는 반드시 내일배움 카드번호를 가지고 있어야 한다.
	public void apply(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	// 4. 수강신청자의 정보(이름, 휴대폰번호,(내일 배움카드 번호))만을 출력할 수 있는 특정 기능이 있다.
	public void printInfo() {
		System.out.printf("이름 : %s, 휴대폰번호 : %s", name, phoneNumber);
		if (!cardNumber.isEmpty())
			System.out.printf("내일 배움카드 번호 : %s", cardNumber);
		else
			System.out.println();
	}
}
