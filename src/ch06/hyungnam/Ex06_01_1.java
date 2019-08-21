package ch06.hyungnam;

public class Ex06_01_1 {

	public static void main(String[] args) {
		oper(10, 5);
	}
	
	
	public static void oper(int num1, int num2) {
		System.out.println("µ¡¼À: " + (num1 + num2));
		System.out.println("»¬¼À: " + (num1 - num2));
		System.out.println("°ö¼À: " + num1 * num2);
		System.out.println("³ª´°¼À: " + num1 / num2);
	}

}
