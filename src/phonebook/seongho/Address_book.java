package phonebook.seongho;

import java.util.ArrayList;

public class Address_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.addPerson("박성호", "010-5233-3208");
		b1.addPerson("권태일", "010-4322-4082");
		b1.addPerson("오형남", "010-2222-3333");
		b1.addPerson("박우관", "010-5303-2292");
		b1.addPerson("윤다정", "010-2342-2323");
		b1.addPerson("이하연", "010-2342-2323");
		
		b1.printAll();   							    // 전체 리스트 출력 
		b1.deletePerson("오형남");   						// 이름으로 삭제하기 
		System.out.println();
		System.out.println();
		
		b1.printByName("박성호");							// 이름으로 찾아 출력하기 
		System.out.println();
		
		b1.printByNumber("010-5233-3208");				// 번호로 찾아 출력하기 
		System.out.println();
		
		b1.makeGroup("박성호","가족");						// 박성호를 찾아 가족 그룹에 넣기 
		b1.makeGroup("박우관", "가족");					// 박우관를 찾아 가족 그룹에 넣기 
		b1.printByGroup("가족");	
		// 가족 그룹 모두 출력하기 
		System.out.println();
		System.out.println();
		
		b1.addHomeNumber("박성호", "070-4322-3208"); 	    // 이름으로 찾아 집번호 넣기 
		b1.printByName("박성호");	
		
		
	}

}




class Book{
	ArrayList<Person> list = new ArrayList<Person>();
	
	void printAll(){
		for(Person p : list) {
			System.out.println(p.getName() + " / " + p.getNumber()+" / " + p.getGroup() + " / " + p.getOld()+ " / " + p.getHomeNumber());
		}
		
	}
	

	
	
	void addPerson(String name, String number) {
		list.add(new Person(name, number));
		
	}
	
	void deletePerson(String name) {
		for(int i = 0 ; i < list.size() ; i++){
			if(name.equals(list.get(i).getName())) {
				list.remove(i);
			}
		}
	}
	
	void printByName(String name) {
		for(int i = 0 ; i < list.size() ; i++){
			if(name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).toString());
			}
		}
	}
	
	void printByNumber(String number) {
		for(int i = 0 ; i < list.size() ; i++){
			if(number.equals(list.get(i).getNumber())) {
				System.out.println(list.get(i).toString());
			}
		}
	}
	
	void makeGroup(String name, String group) {
		for(int i = 0 ; i < list.size() ; i++){
			if(name.equals(list.get(i).getName())) {
				list.get(i).setGroup(group);
			}
		}
	}

	
	void printByGroup(String group) {
		for(int i = 0 ; i < list.size() ; i++){
			if(group.equals(list.get(i).getGroup())) {
				System.out.println(list.get(i).toString());
			}
		}
	}
	
	void addHomeNumber(String name, String homenumber) {
		for(int i = 0 ; i < list.size() ; i++){
			if(name.equals(list.get(i).getName())) {
				list.get(i).setHomeNumber(homenumber);
			}
		}
	}
	
	void autoLocalNumber() {
		
	}
	
	
	
}
//
//사람
//* 이름 
//* 핸드폰 번호  
//* 집 전화 
//* 나이
//* 관계(그룹) 
//
//기능
//* 사람을 추가할 수있다.
//* 사람을  고유번호를 통해 삭제 할 수있다.
//* 전제 조회 할 수있다.
//* 이름으로  정보를 조회 할 수 있다.
//* 핸드폰 번호로 정보를 조회 할 수 있다.
//* 그룹을 조회할 수 있다. (미등록, 친구, 가족, 직장, 조)
//* 집 번호로 지역번호 자동 판별할 수 있다. 


class Person{                                                               
	private String name;                                                        
	private String number;                                                      
	private String Group;
	private String homeNumber;
	private int old; 
	
	Person(String name, String number){
		this.name = name;
		this.number = number;	
	}
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGroup() {
		return Group;
	}

	public void setGroup(String group) {
		Group = group;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	
	
	@Override
	public String toString() {
		return name +" / "+ number+ " / " +Group + " / "+ homeNumber + " / "+ old; 
		
	}
	
}


















