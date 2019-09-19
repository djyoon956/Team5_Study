package Team5_Final.hy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.User;

public class Membership {
	int index = 0;
	static Map<String, User> users;
	static Scanner sc = new Scanner(System.in);

	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private static String age;

	private boolean isLogin;

	private double saveTime; // 잔여시간
	private double totalTime; // 누적시간

	public static void main(String[] args) {
		addMembership();

	}

	public static void addMembership() {
		// 1. 정규식 적용
		// 2. 중복 방지(id, 주번)
		System.out.println("회원가입을 시작합니다.");
		System.out.print("이름 >> ");
		String name = sc.next();

		System.out.print("ID>> ");
		String id = sc.next();
		/*
		 * if (users.containsKey(id)) {
		 * System.out.println("ID가 중복되었습니다. 초기 메뉴로 돌아갑니다."); return addMembership(); }
		 */

		System.out.print("비밀번호>> ");
		String password = sc.next();

		System.out.print("전화번호 >> ");
		String phonenumber = sc.next();

		System.out.print("주민번호 >> ");
		String securitNumber = sc.next();

		int age = Integer.parseInt(securitNumber.substring(0, 2));
		char ch = securitNumber.charAt(7);

		if (ch == '1' || ch == '2') {
			age = 2019 - (1900 + age) + 1;
		} else if (ch == '3' || ch == '4') {
			age = 2019 - (2000 + age) + 1;
		}

		User user = new User(name, phonenumber, age, password, securitNumber);
		users.put(user.getId(), user);
		System.out.println(user);

		list.add(user);

	}

}

/*
 * users.put(user.getId(), user);
 * 
 * for (int i = 0; i < list.size(); i++) { Map users = (HashMap) list.get(i);
 * 
 * System.out.println("index >>" + i);
 * 
 * 
 * 
 * 
 * 
 * if(users.containsKey(id)) { System.out.println("있어용"+id); }else {
 * System.out.println("없습니다."); }
 * 
 * 
 * 
 * 
 * } return list; }
 * 
 * }
 * 
 */

/*
 * 
 * List<Map<String, Object>> list;
 * 
 * for(Map<String, Object> map : list){
 * 
 * for(Map.Entry<String, Object> entry : map.entrySet()){
 * 
 * String key = entry.getKey();
 * 
 * Object value = entry.getValue();
 * 
 * map.put(key, value);
 * 
 * }
 * 
 * }
 */
