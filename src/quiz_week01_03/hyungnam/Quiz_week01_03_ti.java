package quiz_week01_03.hyungnam;



class Grandparent
{
	int age = 80;
	Grandparent(int age)
	{
		this.age = age;
    }
}

class Parent extends Grandparent
{
	Parent()
	{
		super(50);
	}

	@Override
	public String toString() 
	{
		return "Parent";
	}
}

class Child extends Grandparent
{
	Child()
	{
		super(10);
	}

	@Override
	public String toString() 
	{
		return "Child";
	}

}


public class Quiz_hyungnam_kwon {
	public static void main(String[] args) {
		Grandparent grandparent = new Grandparent(80);
		System.out.println(grandparent.age);
		System.out.println("---------------------------------");
		
		
		
		Parent parent = new Parent();
		System.out.println(parent.age);
		System.out.println("---------------------------------");

		Child child = new Child();
		System.out.println(child.age);
		System.out.println("---------------------------------");

		
		
	}
}