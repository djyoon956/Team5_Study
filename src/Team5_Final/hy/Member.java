package Team5_Final.hy;

public class Member {
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	private String securitNumber;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSecuritNumber() {
		return securitNumber;
	}

	public void setSecuritNumber(String securitNumber) {
		this.securitNumber = securitNumber;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "MemberDTO [이름=" + name + ", 아이디=" + id + ", 비밀번호=" + password + ", 핸드폰 번호=" + phoneNumber + ", 주민번호="
				+ securitNumber + "]";
	}
}
