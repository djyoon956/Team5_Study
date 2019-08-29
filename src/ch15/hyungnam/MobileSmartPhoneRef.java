package ch15.hyungnam;

public class MobileSmartPhoneRef {

	public static void main(String[] args) {
		SmartPhone ph1=new SmartPhone("11111", "Nougat");
		MobilePhone ph2=new SmartPhone("22221", "Nougat");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();
		ph2.answer();
	}

}

class MobilePhone{
	protected String number;
	
	public MobilePhone(String number) {
		this.number=number;
	}
	
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String number, String androidVer) {
		super(number);
		this.androidVer=androidVer;
	}
	
	public void playApp() {
		System.out.println("App is runnung in " + androidVer);
	}
}