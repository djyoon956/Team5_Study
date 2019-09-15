package phonebook.hyungnam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Phone {
	List<Friends> friends;
	Scanner sc;


	public Phone() {
		friends = new ArrayList<>();
		friends.add(new Friends("오형남", "010-3642-3603", "가족", "1234"));
		friends.add(new Friends("윤다정", "010-1111-1111", "조", "1111"));
		friends.add(new Friends("박성호", "010-2222-2222", "조", "2222"));
		friends.add(new Friends("권태일", "010-3333-3333", "조", "3333"));
		friends.add(new Friends("이하연", "010-4444-4444", "조", "4444"));
	}

	public void start() {
		while (true) {
			sc = new Scanner(System.in);
			System.out.println("1. 추가 / 2. 전체 조회 / 3.성으로 조회 / 4. 핸드폰번호, 이름으로 조회 / 5. 관계로 검색 / 6. 고유번호로 삭제 / 7. 처음으로");
			System.out.println("번호를 선택해주세요.");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				addFriends();
				break;
			case 2:
				showListFriends();
				break;
			case 3:
				lastnameSearch();
				break;
			case 4:
				search();
				break;
			case 5:
				relationSearch();
				break;
			case 6:
				deleteFriend();
			case 7:
				continue;
			default:
				break;
			}
		}
	}

	// 번호 추가
	private void addFriends() {
		sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		if (!name.matches(Validation.REG_EXP_Name)) {
			System.out.println("이름을 잘못입력하셨습니다.");
			return;
		}
		System.out.println("핸드폰 번호를 입력해주세요.");
		String phone = sc.nextLine();
		if (!phone.matches(Validation.REG_EXP_PHONE)) {
			System.out.println("핸드폰 번호를 잘못입력하셨습니다.");
			return;
		}

//		System.out.println("집 번호를 입력해주세요.");
//		String home=sc.nextLine();
//		if(!home.matches(Validation.REG_EXP_HOME)) {
//			System.out.println("집 번호를 잘못입력하셨습니다.");
//			return;
//		}
//		System.out.println("나이를 입력해주세요.");
//		int age=Integer.parseInt(sc.nextLine());
//		System.out.println("관계를 입력해주세요.");
//		String relation=sc.nextLine();

		System.out.println("고유번호 4자리를 입력해주세요.");
		String serial = sc.nextLine();

		if (!serial.matches(Validation.REG_EXP_Serial)) {
			System.out.println("고유번호를 잘못입력하셨습니다.");
			return;
		} else if (!serialCheck(serial)) {
			System.out.println("중복된 고유번호입니다. 다시 입력해주세요.");
			serial=null;
			return;
		} else {
			System.out.println("전화번호부에 등록되었습니다.");
			// friends.add(new Friends(name, phone, home, age, relation, serial));
			friends.add(new Friends(name, phone,"가족", serial));
		}

	}

	private void deleteFriend() { // 고유번호 넣어서 삭제
		sc=new Scanner(System.in);
		System.out.println("삭제할 고유번호를 입력해주세요.");
		String serial = sc.nextLine();
		boolean check = false;
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).fSerial.equals(serial)) {
				friends.remove(i);
				check = true;
			}
		}
		if (check) {
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("고유번호를 다시 확인해주세요");
		}
	}

	private void showListFriends() { // 전체조회
		friendSort(friends);
		int count = 0;
		for (Friends friends2 : friends) {
			System.out.println(friends2.toString());
			count++;
		}
		if (count != 0) {
			System.out.println(count + "개 조회되었습니다.");
		} else {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private void search() { // 조건검색(폰번, 이름)
		sc = new Scanner(System.in);
		System.out.println("이름이나 핸드폰 번호를 입력해주세요.");
		String data = sc.nextLine();
		int count = 0;
		for (Friends friends2 : friends) {
			if (friends2.fName.equals(data) || friends2.fPhone.equals(data)) {
				System.out.println(friends2.toString());
				count++;
			}
		}
		if (count != 0) {
			System.out.println(count + "개 조회되었습니다.");
		} else {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private void relationSearch() { // 관계검색
		sc=new Scanner(System.in);
		System.out.println("관계를 입력해주세요.");
		String relation=sc.nextLine();
		int count = 0;
		for (Friends friends2 : friends) {
			if (friends2.fRelation.equals(relation)) {
				System.out.println(friends2.toString());
			}
		}
		if (count != 0) {
			System.out.println(count + "개 조회되었습니다.");
		} else {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private boolean serialCheck(String serial) { // 고유번호 체크
		for (Friends friends2 : friends) {
			if (friends2.fSerial.equals(serial)) {
				return false;
			}
		}
		return true;
	}

	private void friendSort(List<Friends> friends) { // 조회 시 정렬해서 보여줌
		Comparator<Friends> friendComparator = new Comparator<Friends>() {
			@Override
			public int compare(Friends o1, Friends o2) {
				return o1.fName.compareTo(o2.fName);
				// return o1.fName.charAt(0) > o2.fName.charAt(0) ? 1 : o1.fName.charAt(0) <
				// o2.fName.charAt(0) ? -1 : 0;
			}
		};
		// friends.sort(friendComparator);
		Collections.sort(friends, friendComparator);
	}

	private void lastnameSearch() { // 성씨로 검색
		sc = new Scanner(System.in);
		System.out.println("성을 입력해주세요.");
		String lastName = sc.nextLine();
		if (lastName.length() == 1) {
			for (Friends friends2 : friends) {
				if (friends2.fName.substring(0, lastName.length()).contains(lastName)) {
					System.out.println(friends2.toString());
				}
			}
		} else if (lastName.length() == 2) {
			for (Friends friends2 : friends) {
				if (friends2.fName.substring(0, lastName.length()).contains(lastName)) {
					System.out.println(friends2.toString());
				}
			}
		}
	}
	

	private void phonebookImport() {

	}

	private void phonebookExport() {

	}

}
