package ch05.dajeong;

public class ex06_2 {
	public static void main(String[] args) {
		int index = 1;
		int result = 0;
		while (true) {
			if (index % 2 != 0)
				result += index;

			if (result > 1000) {
				System.out.println("гу  : " + result);
				System.out.println(index);
				break;
			}
			index++;
		}
	}
}
