package Team5_Final;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Computer {
	private int number;
	private boolean isUse;
	private User user;
	private Timer timer;
	private double testCount;
	private String a = "ComputerInfo";

	public Computer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean getIsUse() {
		return isUse;
	}

	public void setIsUse(boolean isUse) {
		this.isUse = isUse;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public double getTestCount() {
		return testCount;
	}

	public void setTestCount(double testCount) {
		this.testCount = testCount;
	}

	public void powerOn(User user) {
		this.user = user;
		this.user.setLogin(true);
		isUse = true;
		test("Login");
		start();
	}

	private void start() {
		TimerTask timeThread = new TimerTask() {
			@Override
			public void run() {
				long currentSaveTime = user.getSaveTime();
				if (currentSaveTime > 0) {
					long result = (currentSaveTime - 1);
					user.setSaveTime(result);
				} else {
					if (isUse)
						powerOff(true);
				}
			};
		};

		timer = new Timer();
		timer.schedule(timeThread, 0, 1000); // timeThread 작업을 delay 1초 후 없이 1초씩 반복한다.
	}

	public void powerOff(boolean isAuto) {
		if (user.getId() != null) {
			isUse = false;
			timer.cancel();
			user.setLogin(false);
			if (!isAuto)
				System.out.println(user.getName() + "님 사용을 종료합니다.");
			System.out.println("test 함ㅅ 수 시작");
			test("Logout");
			System.out.println("test 함ㅅ 수 끝");
			user = null;
			// computer.showSeat(); 시간 끝날때마다 자리 출력. . .
		} else {
			System.out.println("미 사용중인 컴퓨터입니다.");
			isUse = false;
		}
	}

	boolean ageCheck() { // 시간이 안흐름..
		long cur = System.currentTimeMillis();
		// (2) 출력 형태를 지정하기 위해 Formatter를 얻는다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh");
		// (3) 출력 형태에 맞는 문자열을 얻는다.
		String datetime2 = sdf2.format(new Date(cur));
		boolean isAge = false;
		if (Integer.parseInt(datetime2) > 9) {
			if (user.getAge() < 20) {
				System.out.println("청소년 보호법으로 사용을 종료합니다.");
			} else {
				isAge = true;
			}
		} else {
			isAge = true;
		}
		return isAge;
	}

	private void test(String status) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(a + File.separator + number + ".txt", true))) {
			bw.write(user.getName() + "님 " + status);
			bw.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
