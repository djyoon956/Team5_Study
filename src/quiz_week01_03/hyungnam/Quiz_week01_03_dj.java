package quiz_week01_03.hyungnam;

class Parent {
	// do something...
}

class Child extends Parent {
	// do something...
}

public class Quiz_week01_03_dj {
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.printf("parent instanceof Parent : %b\n", parent instanceof Parent);
		System.out.printf("parent instanceof Child : %b\n", parent instanceof Child);
		System.out.println("---------------------------------");

		Child child = new Child();
		System.out.printf("child instanceof Parent : %b\n", child instanceof Parent);
		System.out.printf("child instanceof Child : %b\n", child instanceof Child);
		System.out.println("---------------------------------");

		Parent poly = new Child();
		System.out.printf("poly instanceof Parent : %b\n", poly instanceof Parent);
		System.out.printf("poly instanceof Child : %b\n", poly instanceof Child);
	}
}
