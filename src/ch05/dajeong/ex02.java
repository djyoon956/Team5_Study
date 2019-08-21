package ch05.dajeong;

public class ex02 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;

		int big = num1 > num2 ? num1 : num2;
		System.out.println("Å« ¼ö : " + big);

		int diff = num1 > num2 ? num1 - num2 : num2 - num1;
		System.out.println("Àý´ñ°ª : " + diff);
	}
}
