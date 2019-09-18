package Team5_Final;

public class User {
	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private int age;

	private boolean isLogin;

	private double saveTime; // 잔여 시간
	private double totalTime; // 누적 시간
	
	public User(String name, String phoneNumber, String id, String password, String securitNumber){
		this.name = name; 
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.password = password;
		this.securitNumber = securitNumber;
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getSecuritNumber() {
		return securitNumber;
	}
	public int getAge() {
		return age;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public double getSaveTime() {
		return saveTime;
	}
	public double getTotalTime() {
		return totalTime;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " / " + "휴대폰 번호 : " + phoneNumber + " / " + "아이뒤 : " + id + " / " + "비밀번호 : " + password + 
				" / " + "주민번호 : " + securitNumber;
	}
	
}
