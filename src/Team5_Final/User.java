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
	
	
}
