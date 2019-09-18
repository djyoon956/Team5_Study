package Team5_Final.hy;

import java.util.ArrayList;

import Team5_Final.User;

public class Test_hy {
	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<User>();
		int index = 0;
		User element = null;
		list.add(index, element);

		System.out.println("<<회원가입 양식>>");
		System.out.println("차례대로 모두 입력해주세요.");
		System.out.println("이름 입력 : ");
		System.out.println("아이디 입력 : ");
		System.out.println("비밀번호 입력 : ");
		System.out.println("핸드폰 입력 : ");
		System.out.println("주민번호 입력 : ");

		System.out.println("회원가입이 완료되었습니다.");
	}
}
