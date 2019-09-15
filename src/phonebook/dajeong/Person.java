package phonebook.dajeong;

class MyRegex {
	public static final String ID_REGEX = "^[\\d]{4}$";
	public static final String PHONE_REGEX = "^01[016789]-\\d{4}-\\d{4}$";
	public static final String HOME_REGEX = "^(0(2|3[1-3]|4[1-4]|5[1-5]|6[1-4]))-(\\d{3,4})-(\\d{4})$";
	public static final String NAME_REGEX = "^[가-힣]*$";
}

public class Person implements Comparable<Person> {
	private String name;
	private String id;
	private int age;

	private String phoneNumber;
	private String homeNumber;
	private String homeCode;

	private String group;

	public Person(String name, String id, int age, String phoneNumber, String homeNumber, String group) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.homeNumber = homeNumber;
		this.homeCode = setHomeCode();
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getId() {
		return id;
	}

	public String getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "Name : " + name + "\n" 
				+ "Id : " + id + "\n" 
				+ "Age : " + age + "\n" 
				+ "Phone : " + phoneNumber + "\n"
				+ "Home : " + homeNumber + "\n" 
				+ "Home Code : " + homeCode + "\n" 
				+ "Group : " + group + "\n";
	}

	private String setHomeCode() {
		String result = "";
		switch (homeNumber.split("-")[0]) {
		case "02":
			result = "서울";
			break;
		case "031":
			result = "경기";
			break;
		case "033":
			result = "강원";
			break;
		case "041":
			result = "충남";
			break;
		case "043":
			result = "충북";
			break;
		case "054":
			result = "경북";
			break;
		case "055":
			result = "경남";
			break;
		case "061":
			result = "전남";
			break;
		case "063":
			result = "전북";
			break;
		case "051":
			result = "부산";
			break;
		case "053":
			result = "대구";
			break;
		case "032":
			result = "인천";
			break;
		case "062":
			result = "광주";
			break;
		case "042":
			result = "대전";
			break;
		case "052":
			result = "울산";
			break;
		case "064":
			result = "제주";
			break;
		}
		return result;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}
