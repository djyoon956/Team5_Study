package ch10.hyungnam;

public class UseCalculatorCMVer {

	public static void main(String[] args) {
		System.out.println("3+4="+SC.add(3, 4));
		System.out.println("������ 2.2, ���� ����: " + SC.calCircleArea(2.2));
		
		System.out.println("15-7=" + SC.min(15, 7));
		System.out.println("������ 5.0, ���� �ѷ�:" + SC.calCirclePeri(5.0));
	}

}

class SC{
	
	static double PI=3.1415;
	
	static double add(double n1, double n2) {
		return n1+n2;
	}
	static double min(double n1, double n2) {
		return n1-n2;
	}
	static double calCircleArea(double r) {
		return PI*r*r;
	}
	static double calCirclePeri(double r) {
		return PI * (r*2);
	}
}