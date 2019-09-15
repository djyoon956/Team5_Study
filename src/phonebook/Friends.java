package phonebook;

public class Friends {
	String fName;
	String fPhone;
	String fHome;
	int fAge;
	String fRelation;
	String fSerial;
	
//	public Friends(String name, String phone, String home, int age, String relation, String serial) {
//		this.fName=name;
//		this.fPhone=phone;
//		this.fHome=home;
//		this.fAge=age;
//		this.fRelation=relation;
//		
//	}
	
	public Friends(String name, String phone, String relation, String serial) {
		this.fName=name;
		this.fPhone=phone;
		this.fRelation=relation;
		this.fSerial=serial;
	}

	@Override
	public String toString() {
		return "Friends [이름=" + fName + ", 핸드폰 번호=" + fPhone + ", 집 번호=" + fHome + ", 나이=" + fAge + ", 관계="
				+ fRelation + ", 고유번호=" + fSerial + "]";
	}
	
}
