package ch14.hyungnam;

public class MyBusinessMan {

	public static void main(String[] args) {
		BusinessMan businessMan=new BusinessMan("Oh", "Hybrid ELD", "Staff Eng.");
		businessMan.tellYourInfo();
	}

}

class Man{
	String name;
	public void tellYourName() {
		System.out.println("my name is " + name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		this.name=name;
		
		this.company=company;
		this.position=position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

