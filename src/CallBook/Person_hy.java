package CallBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 주소록은 사람 객체를 관리한다.
 
기능
사람을 추가할 수있다.
사람을  고유번호를 통해 삭제 할 수있다.
전제 조회 할 수있다.
이름으로  정보를 조회 할 수 있다.
핸드폰 번호로 정보를 조회 할 수 있다.
그룹을 조회할 수 있다. (미등록, 친구, 가족, 직장, 조)
집 번호로 지역번호 자동 판별할 수 있다.
*/

public class Person_hy {

	String name1;
	int phonenumber;
	int homenumber;
	int age;
	String relation;
	Scanner sc;
	private ArrayList<Person_hy> person;

	public Person_hy(String name, int phonenumber, int homenumber, int age, String relation) { // 생성자
		this.name1 = name;
		this.phonenumber = phonenumber;
		this.homenumber = homenumber;
		this.age = age;
		this.relation = relation;
		this.person = new ArrayList<Person_hy>();
		sc = new Scanner(System.in);
	}

	public void addPerson(String name, int phonenumber, int homenumber, int age, String relation) {
		person.add(new Person_hy(name, phonenumber, homenumber, age, relation));
	}

	public Person_hy getPerson(String name) {
		for (Person_hy personlist : person) {
			if (personlist.name1.equals(name)) {
				return personlist;
			}
		}
		return null;
	}

	public Person_hy getPerson(int phonenumber) {
		for (Person_hy personlist : person) {
			if (personlist.phonenumber == (phonenumber)) {
				return personlist;
			}
		}
		return null;
	}

	public ArrayList<Person_hy> getPerson1() {
		return person;
	}

	public void remove(int i) {

	}

}
