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
		this.age = setAge();
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
		return "이름 : " + name + " / " + "전화번호 : " + phoneNumber + " / " + "아이디: " + id + " / " + "비밀번호 : " + password
				+ " / " + "주민번호 : " + securitNumber + "/" + "나이 :" + age + "살";
	}

	private String setJoinDay() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}

	private int setAge() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int age = 0;
		if (securitNumber.charAt(6) == '1' || securitNumber.charAt(6) == '2') {
			// parInt는 ()안에 문자열이온다.
			// Integer.parseInt() : 괄호안의 문자열을 숫자로 변환한다.
			age = year - 1900 - Integer.parseInt(securitNumber.substring(0, 2)); // 문자열의 a번째 문자부터
		} else {
			age = year - 2000 - Integer.parseInt(securitNumber.substring(0, 2));
		}

		return age;
	}
}
