package Team5_Final.hy;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.User;

public class Membership {
	static Scanner sc = new Scanner(System.in);
	private static Map<String, User> users;

	public static void main(String[] args) {
		addMembership();

	}

	public static void addMembership() {
		System.out.println("회원가입을 시작합니다.");
		System.out.print("이름 >> ");
		String name = sc.next();

		System.out.print("ID>> ");
		String id = sc.next();

		System.out.print("비밀번호>> ");
		String password = sc.next();

		System.out.print("핸드폰 번호 >> ");
		String phonenumber = sc.next();

		System.out.print("주민번호 >> ");
		String securitNumber = sc.next();

		User user = new User("이름", "ID", "비밀번호", "핸드폰 번호", "주민번호");
		users.put(user.getId(), user);
	}
}
