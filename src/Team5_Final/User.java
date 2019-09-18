package Team5_Final;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private int age;

	private boolean isLogin;

	private double saveTime; // ”μ—¬ κ°„
	private double totalTime; // „μ  κ°„

	public User(String name, String phoneNumber, String id, String password, String securitNumber) {
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
		return "΄λ¦„ : " + name + " / " + "΄λλ²νΈ : " + phoneNumber + " / " + "„μ΄: " + id + " / " + "λΉ„λλ²νΈ : " + password + 
				" / " + "μ£Όλλ²νΈ : " + securitNumber;
	}
}
