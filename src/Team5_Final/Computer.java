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

	public Computer(int number) {
		this.number = number;
		scanner = new Scanner(System.in);
		timer = new Timer();
	}

	public void powerOn(User user) {
		this.user = user;
		start();
	}

	private void start() {
		testCount = user.getSaveTime();
		TimerTask timeThread = new TimerTask() {
			int time = 0;
			int test = 1000;

			@Override
			public void run() {
				System.out.println(user.getId() + "//SaveTime : " + user.getSaveTime());
				double result = (user.getSaveTime() - 1);
				System.out.println(user.getId() + "result : " + result);
				user.setSaveTime(result);
				System.err.println(user.getId() + "//result saveTime : " + user.getSaveTime());
			};
		};
		timer.schedule(timeThread, 0, 1000);
		// end후...
	}

	private void powerOff() {
		if (user != null) {
			timer.cancel();
			user.setLogin(false);
			user = null;
			isUse = false;
		} else
			System.out.println("미 사용중인 컴퓨터 입니다.");
	}
}
