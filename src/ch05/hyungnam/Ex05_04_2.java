package ch05.hyungnam;

public class Ex05_04_2 {

	public static void main(String[] args) {
		int num1= 1;
		while(num1<100) {
			System.out.println(num1);
			num1++;
		}
		
		do {
			System.out.println(num1);
			num1--;
		} while(num1>0);
	}

}
