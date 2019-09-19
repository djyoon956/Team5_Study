package Team5_Final;

import java.util.Scanner;

public class ValidataionHelper {
	private static final String ID_REGEX = "^[a-zA-Z0-9]*$"; // 숫자+영어조합
	private static final String PHONE_REGEX = "^01[016789]-\\d{4}-\\d{4}$";
	private static final String NAME_REGEX = "^[가-힣]*$"; // 한글만
	private static final String SECURIT_REGEX = "^\\d{6}\\-[1-4]\\d{6}$";

	public static boolean validataionRegex(String target, String regex) {
		return target.matches(regex);
	}

	public static boolean checkId(String id) {
		return id.matches(ID_REGEX);
	}

	public static boolean checkName(String name) {
		return name.matches(NAME_REGEX);
	}

	public static boolean checkPhoneNumber(String phoneNumber) {
		return phoneNumber.matches(PHONE_REGEX);
	}

	public static boolean checkSecurit(String securit) {
		return securit.matches(SECURIT_REGEX);
	}

	public static int checkChoiceNumber(Scanner scanner, int startNumber, int endNumber) {
		int choice = 0;
		String word = "입력";
		while (true) {
			System.out.printf("%s >> ", word);
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				if (choice >= startNumber && choice <= endNumber)
					break;
				else
					word = "재 입력";
			} else {
				scanner.next();
				word = "재 입력";
			}
		}

		return choice;
	}
}
