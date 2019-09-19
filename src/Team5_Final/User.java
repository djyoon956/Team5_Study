package Team5_Final;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User implements Serializable {
	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private int age;
	private boolean isLogin;
	private double saveTime; // 잔여시간
	private double totalTime; // 누적시간
	private String joinDay; // 가입일

	public User(String name, String phoneNumber, String id, String password, String securitNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.password = password;
		this.securitNumber = securitNumber;
		// 나이해줘야함
		this.joinDay = setJoinDay();
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

	public void setSaveTime(double saveTime) {
		this.saveTime = saveTime;
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

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
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
	

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public String getJoinDay() {
		return joinDay;
	}

	public void setJoinDay(String joinDay) {
		this.joinDay = joinDay;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / " + "전화번호 : " + phoneNumber + " / " + "나이: " + id + " / " + "비밀번호 : " + password
				+ " / " + "주민번호 : " + securitNumber;
	}

	private String setJoinDay() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
