package quiz_week01_03.hyungnam;



class Grandparent
{
	int age = 80;
	Grandparent(int age)
	{
		this.age = age;
    }
}

class Parent3 extends Grandparent
{
	Parent3()
	{
		super(50);
	}

	@Override
	public String toString() 
	{
		return "Parent";
	}
}

class Child3 extends Grandparent
{
	Child3()
	{
		super(10);
	}

	@Override
	public String toString() 
	{
		return "Child";
	}

}


public class Quiz_week01_03_ti {
	public static void main(String[] args) {
		Grandparent grandparent = new Grandparent(80);
		System.out.println(grandparent.age);
		System.out.println("---------------------------------");
		
		
		
		Parent3 parent = new Parent3();
		System.out.println(parent.age);
		System.out.println("---------------------------------");

		Child3 child = new Child3();
		System.out.println(child.age);
		System.out.println("---------------------------------");

		
		
	}
}