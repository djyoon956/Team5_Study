package ch05.dajeong;

public class ex03_2 {
	public static void main(String[] args) {
		int number = 24;
		String result;
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			result = "0이상 10미만의 수";
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			result = "0이상 10미만의 수";
			break;
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
			result = "0이상 10미만의 수";
			break;
		default:
			result = "음수 혹은 30 이상의 수";
		}
		System.out.println(result);
	}
}
