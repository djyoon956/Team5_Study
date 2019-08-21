package ch06.hyungnam;

public class Ex06_01_2 {
	public static void main(String[] args) {
		abValue(14, 10);
	}
	
	public static void abValue(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num1 - num2);
		}
		else
			System.out.println(num2 - num1);
	}
}
