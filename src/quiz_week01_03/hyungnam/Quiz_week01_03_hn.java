package quiz_week01_03.hyungnam;

public class Quiz_week01_03_hn {

	public static void main(String[] args) {
		/*
		 * 상속관계 기반의 다형성에 간단한 예를 작성해주세요.
		 */
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.polyEx(new Parents1());
		polymorphism.polyEx(new GrandParents1());
		polymorphism.polyEx(new Child1());
	}

}




class GrandParents1 {
	protected void print() {
		System.out.println("grand");
	}
}

class Parents1 extends GrandParents1{

	@Override
	protected void print() {
		System.out.println("parents");
	}
	
}

class Child1 extends Parents1{

	@Override
	protected void print() {
		System.out.println("child");
	}
	
}

class Polymorphism{
	public void polyEx(GrandParents1 para) {
		para.print();
	}
}
