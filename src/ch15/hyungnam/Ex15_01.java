package ch15.hyungnam;

public class Ex15_01 {

	public static void main(String[] args) {
		GoldPaperBox2 box2=new GoldPaperBox2();
		box2.wrapping();
	}

}
class Box2{
	public void wrapping() {
		System.out.println("Simple");
	}
}

class PaperBox2 extends Box2{
	
	@Override
	public void wrapping() {
		super.wrapping();
		System.out.println("Paper");
	}
}

class GoldPaperBox2 extends PaperBox2{
	
	@Override
	public void wrapping() {
		super.wrapping();
		System.out.println("Gold");
	}
		
}