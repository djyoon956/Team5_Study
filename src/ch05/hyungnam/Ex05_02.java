package ch05.hyungnam;

public class Ex05_02 {

	public static void main(String[] args) {
		int num1= 1;
		int num2= 100;
		int big;
		int diff;
		
		if(num1 > num2) {
			big= num1 - num2;
		}
		else
			big= num2 - num2;
		System.out.println("큰 수: " + big);
		if(num1 > num2) {
			diff= num1 - num2;
		}
		else
			diff= num2 - num1;
		System.out.println("절대값: " + diff);
	}

}
