package Team5_Final.hn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import Team5_Final.User;

public class Test {

	public static void main(String[] args) {
//		Computer computer =new Computer(1);
//		Computer computer2 =new Computer(2);
//		computer.powerOn(new User("형남", "010", "형남", "950506-2222222", "950506-2222222"));
//		computer2.powerOn(new User("다정", "010", "다정", "950506-2222222", "950506-2222222"));
		
		Computer computer=new Computer(1);
		computer.powerOn(new User("형남", "010", "형남", "010506-2222222", "950506-2222222"));
		computer.ageCheck();
		




	}

}

class Computer {
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
				long result = (user.getSaveTime() - 1);
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
	
	boolean ageCheck() {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.HOUR, 10);
		cal.set(Calendar.MINUTE, 0);
		if(cal.get(Calendar.HOUR) > 9) {
			if(user.getAge() <20) {
				System.out.println("청소년 보호법으로 사용을 종료합니다.");
				powerOff();
				return false;
			}
			else {
				System.out.println("성인입니다.");
			}
		}
		return true;
	}
}
