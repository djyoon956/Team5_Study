package phonebook.dajeong;
import java.util.*;

public class AdressBook {
	private Scanner scanner;
	private Map<String, Person> persons;

	public AdressBook() {
		scanner = new Scanner(System.in);
		persons = new HashMap<String, Person>();
		// 테스트 데이터
		persons.put("1111", new Person("윤다정", "1111", 25, "010-1111-1111", "02-1234-1234", "미등록"));
		persons.put("2222", new Person("정형남", "2222", 25, "010-1111-1111", "02-1234-1234", "조"));
		persons.put("3333", new Person("정성호", "3333", 25, "010-1111-1111", "02-1234-1234", "조"));
		persons.put("4444", new Person("이하연", "4444", 25, "010-1111-1111", "02-1234-1234", "조"));
		persons.put("5555", new Person("권태일", "5555", 25, "010-1111-1111", "02-1234-1234", "조"));
	}

	public void selectedMenu() {
		while (true) {
			System.out.println("1. 주소록 추가");
			System.out.println("2. 주소록 삭제");
			System.out.println("3. 주소록 조회");
			System.out.println("4. 종료");

			int choice = validationChoiceNumber(1, 4);
			switch (choice) {
			case 1:
				addPerson();
				break;
			case 2:
				removePerson();
				break;
			case 3:
				searchMenu();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}
	}

	private void searchMenu() {
		searchLoop: while (true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. 이름 조회");
			System.out.println("3. 번호 조회");
			System.out.println("4. 그룹 조회");
			System.out.println("5. 성으로 조회");
			System.out.println("6. 이전 메뉴로 돌아가기");

			int choice = validationChoiceNumber(1, 6);
			switch (choice) {
			case 1:
				searchAllPerson();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchPhoneNumber();
				break;
			case 4:
				searchGroup();
				break;
			case 5:
				searchFirstName();
				break;
			case 6:
				break searchLoop;
			}
		}
	}

	private void searchAllPerson() {
		System.out.println("총 인원 : " + persons.size());
		List<Person> tttList = new ArrayList<Person>(persons.values());
		Collections.sort(tttList);
		for (Person person : tttList)
			showInfo(person);
	}

	private void searchName() {
		System.out.print("검색 이름 >> ");
		String searchName = scanner.next();

		if (!searchName.matches(MyRegex.NAME_REGEX)) {
			System.out.println("검색 형식이 일치하지 않습니다. 검색 메뉴로 돌아갑니다.");
			return;
		}

		List<Person> findPersons = new ArrayList<Person>();
		for (Person person : persons.values()) {
			if (person.getName().equals(searchName))
				findPersons.add(person);
		}

		showSearchInfo(findPersons);
	}

	private void searchPhoneNumber() {
		System.out.print("검색 핸드폰 번호 >> ");
		String searchNumber = scanner.next();

		if (!searchNumber.matches(MyRegex.PHONE_REGEX)) {
			System.out.println("검색 형식이 일치하지 않습니다. 검색 메뉴로 돌아갑니다.");
			return;
		}

		List<Person> findPersons = new ArrayList<Person>();
		for (Person person : persons.values()) {
			if (person.getPhoneNumber().equals(searchNumber))
				findPersons.add(person);
		}

		showSearchInfo(findPersons);
	}

	private void searchGroup() {
		String searchGroup = convertGroupNumberToString();

		List<Person> findPersons = new ArrayList<Person>();
		for (Person person : persons.values()) {
			if (person.getGroup().equals(searchGroup))
				findPersons.add(person);
		}

		showSearchInfo(findPersons);
	}

	private void searchFirstName() {
		System.out.print("성으로 검색 >> ");
		String searchWord = scanner.next();

		List<Person> findPersons = new ArrayList<Person>();
		for (Person person : persons.values()) {
			if (person.getName().startsWith(searchWord))
				findPersons.add(person);
		}

		showSearchInfo(findPersons);
	}

	private void addPerson() {
		System.out.println("주소록 추가를 시작합니다.");
		System.out.print("이름 >> ");
		String name = scanner.next();
		if (!validataionRegex(name, MyRegex.NAME_REGEX)) {
			System.out.println("이름 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("ID (숫자 4자리) >> ");
		String id = scanner.next();
		if (!validataionRegex(id, MyRegex.ID_REGEX)) {
			System.out.println("ID 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		} else if (persons.containsKey(id)) {
			System.out.println("ID가 중복되었습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("나이 >> ");
		int age = Integer.parseInt(scanner.next());

		System.out.print("핸드폰 번호 >> ");
		String phone = scanner.next();
		if (!validataionRegex(phone, MyRegex.PHONE_REGEX)) {
			System.out.println("핸드폰 번호 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.print("집 번호 >> ");
		String home = scanner.next();
		if (!validataionRegex(home, MyRegex.HOME_REGEX)) {
			System.out.println("집 번호 형식이 맞지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		System.out.println("그룹을 선택하세요.");
		String group = convertGroupNumberToString();

		Person person = new Person(name, id, age, phone, home, group);
		persons.put(person.getId(), person);
	}

	private void removePerson() {
		System.out.println("주소록 삭제를 시작합니다.");
		System.out.print("ID >> ");
		String id = scanner.next();
		if (!id.matches(MyRegex.ID_REGEX)) {
			System.out.println("검색 형식이 일치하지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}
		else if(!persons.containsKey(id)){
			System.out.println("입력하신 ID가 존재하지 않습니다. 초기 메뉴로 돌아갑니다.");
			return;
		}

		persons.remove(id) ;
	}

	private String convertGroupNumberToString() {
		System.out.println("1. 미등록\t2. 친구\t3. 가족\t4. 직장\t5.조");
		int choice = validationChoiceNumber(1, 5);
		String group = "";
		switch (choice) {
		case 1:
			group = "미등록";
			break;
		case 2:
			group = "친구";
			break;
		case 3:
			group = "가족";
			break;
		case 4:
			group = "직장";
			break;
		case 5:
			group = "조";
			break;
		}

		return group;
	}

	private void showSearchInfo(List<Person> findPersons) {
		System.out.println("검색 인원 :" + findPersons.size());
		findPersons.forEach(x -> showInfo(x));
	}

	private void showInfo(Person person) {
		System.out.println("────────────────");
		System.out.println(person.toString());
	}

	private boolean validataionRegex(String target, String regex) {
		return target.matches(regex);
	}

	private int validationChoiceNumber(int startNumber, int endNumber) {
		int choice = 0;
		String word = "입력";
		while (true) {
			System.out.printf("%s >> ", word);
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				if (choice >= startNumber && choice <= endNumber)
					break;
			} else {
				scanner.next();
				word = "재 입력";
			}
		}

		return choice;
	}
}
