package Team5_Final;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Computer {
	private Scanner scanner;
	private int number;
	private boolean isUse;
	private User user;
	private Timer timer;
	private double testCount;
	PCmanagement pcm;

	public Computer(int number) {
		this.number = number;
		scanner = new Scanner(System.in);
		timer = new Timer();
		pcm=new PCmanagement(scanner);
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
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
		isUse = true;
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
				} else
					powerOff();
			};
		};

		timer.schedule(timeThread, 1000, 1000); // timeThread 작업을 delay없이 1초씩 반복한다.
	}

	public void powerOff() {
		if (user != null) {
			System.out.println(user.getName() + "님 사용을 종료합니다.");
			timer.cancel();
			user.setLogin(false);
			user = null;
			isUse = false;
			
		} else
			System.out.println("미 사용중인 컴퓨터입니다.");
	}
}
