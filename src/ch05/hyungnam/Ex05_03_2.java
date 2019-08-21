package ch05.hyungnam;

public class Ex05_03_2 {

	public static void main(String[] args) {
		int n= 24;
		
		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("0 이상 10 미만의 수");
			break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("10 이상 20 미만의 수");
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
			System.out.println("20 이상 30 미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30 이상의 수");
			break;
		}
	}
}
