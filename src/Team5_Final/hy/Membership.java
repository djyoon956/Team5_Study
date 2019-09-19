//1. 아이디형식 안맞을 때 초기 메뉴로 돌아갈 것

package Team5_Final.hy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.User;

class MyRegex {
	public static final String ID_REGEX = "^[a-zA-Z0-9]*$"; // 숫자+영어조합
	public static final String PHONE_REGEX = "^01[016789]-\\d{4}-\\d{4}$";
	public static final String NAME_REGEX = "^[가-힣]*$"; // 한글만

}

public class Membership {
	int index = 0;
	static Map<String, User> users;
	static Scanner sc = new Scanner(System.in);

	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private static int age;

	private boolean isLogin;

	private double saveTime; // 잔여시간
	private double totalTime; // 누적시간

	public static void main(String[] args) {
		users = new HashMap<String, User>();
		addMembership();

	}

	public static void addMembership() {
		// 1. 정규식 적용
		// 2. 중복 방지(id, 주번)
		System.out.println("회원가입을 시작합니다.");
		System.out.print("이름 >> ");
		String name = sc.next();
		if (!validataionRegex(name, MyRegex.NAME_REGEX)) {
			System.out.println("이름 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("ID>> ");
		String id = sc.next();
		if (!validataionRegex(id, MyRegex.ID_REGEX)) {
			System.out.println("ID 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		} else if (users.containsKey(id)) {
			System.out.println("ID가 중복되었습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("비밀번호>> ");
		String password = sc.next();

		System.out.print("휴대폰번호 >> ");
		String phonenumber = sc.next();
		if (!validataionRegex(phonenumber, MyRegex.PHONE_REGEX)) {
			System.out.println("휴대폰번호 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("주민번호('-' 없이)>> ");
		String securitNumber = sc.next().trim(); // 앞뒤로 들어오는 공백을 없애기위해 trim()사용

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		if (securitNumber.charAt(6) == '1' || securitNumber.charAt(6) == '2') {
			// parInt는 ()안에 문자열이온다.
			// Integer.parseInt() : 괄호안의 문자열을 숫자로 변환한다.
			System.out.println(year - 1900 - Integer.parseInt(securitNumber.substring(0, 2)) + "살");// substring(a, b) :
																									// 문자열의 a번째 문자부터
																									// b-1번째 까지의 문자를
																									// 뽑아낸다.
		} else {
			System.out.println(year - 2000 - Integer.parseInt(securitNumber.substring(0, 2)) + "살");
		}

		User user = new User(name, phonenumber, id, password, securitNumber);
		users.put(user.getId(), user);
		System.out.println(user);
	}

	private static boolean validataionRegex(String target, String regex) {
		return target.matches(regex);
	}
}
