package ch10.hyungnam;

public class ClassMethod {

	public static void main(String[] args) {
		NumberPrinter numberPrinter=new NumberPrinter();
		numberPrinter.showDouble(3.14);
		numberPrinter.setMyNumber(75);
		numberPrinter.showMyNumer();
		
	}

}

class NumberPrinter{
	private int myNum=0;
	static void showInt(int n) {
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum=n;
	}
	void showMyNumer() {
		showInt(myNum);
	}
}