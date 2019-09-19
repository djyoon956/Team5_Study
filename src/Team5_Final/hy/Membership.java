package Team5_Final.hy;

import java.util.ArrayList;
import java.util.Scanner;

import Team5_Final.User;

public class Membership {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> id = new ArrayList<String>();
	ArrayList<String> passward = new ArrayList<String>();
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> phonenumber = new ArrayList<String>();
	ArrayList<String> securitNumber = new ArrayList<String>();
	ArrayList<User> list = new ArrayList<User>();
	User user;

	public void addMembership() {
		for (int i = 0; i < 100; i++) {
			User user = new User("이름", "ID", "비밀번호", "핸드폰 번호", "주민번호");
			user.setIndex(i);

			System.out.println("회원가입을 시작합니다.");
			System.out.print("이름 >> ");
			String name = sc.next();
			id.add(name);
			user.setName(sc.nextLine());
			list.add(user);

			System.out.print("ID>> ");
			String id = sc.next();
			user.setId(sc.nextLine());
			list.add(user);

			System.out.print("비밀번호>> ");
			String password = sc.next();
			user.setPassword(sc.nextLine());
			list.add(user);

			System.out.print("핸드폰 번호 >> ");
			String phonenumber = sc.next();
			user.setPhoneNumber(sc.nextLine());
			list.add(user);

			System.out.print("주민번호 >> ");
			String securitNumber = sc.next();
			user.setPhoneNumber(sc.nextLine());
			list.add(user);

		}
		/*(
		for(HashMap map : users) { 
		  String id= list.add(map); 
		  String user= list.add(map); 
		  */
		} 
	}


