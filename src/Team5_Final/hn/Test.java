//package Team5_Final.hn;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import Team5_Final.User;
//
////1시간에 10초
//public class Test {
//
//	public static void main(String[] args) {
////		Computer computer =new Computer(1);
////		Computer computer2 =new Computer(2);
////		computer.powerOn(new User("형남", "010", "형남", "950506-2222222", "950506-2222222"));
////		computer2.powerOn(new User("다정", "010", "다정", "950506-2222222", "950506-2222222"));
//
//		Computer computer = new Computer(1);
//		computer.powerOn(new User("형남", "010", "형남", "960506-2222222", "9605062222222"));
//	}
//
//}
//
//class Computer {
//	
//	private Scanner scanner;
//	private int number;
//	private boolean isUse;
//	private User user;
//	private Timer timer;
//	private double testCount;
//	private boolean offCheck;
//	static Calendar cal = Calendar.getInstance();
//
//	public Computer(int number) {
//		this.number = number;
//		scanner = new Scanner(System.in);
//		timer = new Timer();
//
//	}
//
//	public Scanner getScanner() {
//		return scanner;
//	}
//
//	public void setScanner(Scanner scanner) {
//		this.scanner = scanner;
//	}
//
//	public int getNumber() {
//		return number;
//	}
//
//	public void setNumber(int number) {
//		this.number = number;
//	}
//
//	public boolean getIsUse() {
//		return isUse;
//	}
//
//	public void setIsUse(boolean isUse) {
//		this.isUse = isUse;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Timer getTimer() {
//		return timer;
//	}
//
//	public void setTimer(Timer timer) {
//		this.timer = timer;
//	}
//
//	public double getTestCount() {
//		return testCount;
//	}
//
//	public void setTestCount(double testCount) {
//		this.testCount = testCount;
//	}
//
//	public void powerOn(User user) {
//		this.user = user;
//		start();
//	}
//
//	private void start() {
//		user.setSaveTime(30);
//
//		TimerTask timeThread = new TimerTask() {
//
//			@Override
//			public void run() {
//				long currentSaveTime = user.getSaveTime();
//
//				if (ageCheck() && currentSaveTime > 0) { //컴퓨터가 켜져있을 때
//					long result = (currentSaveTime - 1);
//					user.setSaveTime(result);
//					System.err.println(result);
//				} else {
//					powerOff();
//				}
//			};
//		};
//
//		timer.schedule(timeThread, 1000, 1000); // timeThread 작업을 delay없이 1초씩 반복한다.
//	}
//
//	private void powerOff() {
//		if (user != null) {
//			timer.cancel();
//			user.setLogin(false);
//			user = null;
//			isUse = false;
//			offCheck=true;
//			System.out.println("시스템이 종료됩니다.");
//		} else
//			System.out.println("미 사용중인 컴퓨터 입니다.");
//	}
//
//}
