package lotto;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class CustomDateFormat {

	public static String date() {
		return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
	}

	public static String time() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}

class Lotto {
	private Scanner scanner;
	ArrayList<String> outputs;

	Lotto() {
		scanner = new Scanner(System.in);
		outputs = new ArrayList<>();
	}

	public void start() {
		loop1: while (true) {
			int selectionMenu = selectedMenu();
			switch (selectionMenu) {
			case 1:
				getLotto();
				break;
			case 2:
				saveLotteFile();
				break loop1;
			}
		}
	}

	private int selectedMenu() {
		System.out.println("********************");
		System.out.println("1. 당첨 예상 번호 추출");
		System.out.println("2. 프로그램 종료 및 로또 저장");
		System.out.println("********************");

		int inputNumber = 0;
		while (true) {
			System.out.print(">> ");
			if (scanner.hasNextInt()) {
				inputNumber = scanner.nextInt();
				if (inputNumber > 0 && inputNumber < 3)
					break;
			} else
				scanner.next();
		}

		return inputNumber;
	}

	private void getLotto() {
		int count = inputCount();
		List<Set<Integer>> lottos = getLottoNumber(count);
		printLotto(lottos);
	}

	private int inputCount() {
		System.out.println("로또 출력 횟수를 입력 하세요. (1회부터 최대 5회까지 가능)");
		int inputNumber = 0;
		while (true) {
			System.out.print(">> ");
			if (scanner.hasNextInt()) {
				inputNumber = scanner.nextInt();
				if (inputNumber > 0 && inputNumber < 6)
					break;
			} else
				scanner.next();
		}

		return inputNumber;
	}

	private List<Set<Integer>> getLottoNumber(int count) {
		List<Set<Integer>> lottos = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Set<Integer> numbers = new TreeSet<Integer>();
			while (numbers.size() < 6) {
				int random = (int) (Math.random() * 45) + 1;
				numbers.add(random);
			}
			lottos.add(numbers);
		}

		return lottos;
	}

	private void saveLotteFile() {
		if (outputs.size() < 1)
			return;

		String path = "Lotto.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
			System.out.println("********************");
			for (int i = 0; i < outputs.size(); i++) {
				writer.write((i + 1) + "회차");
				writer.newLine();
				writer.write("발행일 : " + CustomDateFormat.date() + " " + CustomDateFormat.time());
				writer.newLine();
				writer.write(outputs.get(i));
				writer.newLine();
			}
			System.out.println("********************");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void printLotto(List<Set<Integer>> lottos) {
		String lottoString = "";
		String output = "────────────────\n";
		lottoString += output;
		System.out.print(output);
		for (int i = 0; i < lottos.size(); i++) {
			output = (char) (65 + i) + " 자동 ";
			lottoString += output;
			Iterator<Integer> iterator = lottos.get(i).iterator();
			System.out.print(output);
			while (iterator.hasNext()) {
				output = String.format("%02d ", iterator.next());
				lottoString += output;
				System.out.print(output);
			}
			output = "\n";
			lottoString += output;
			System.out.print(output);
		}
		output = "────────────────\n";
		lottoString += output;
		System.out.print(output);

		outputs.add(lottoString);
	}
}

public class Lotto_dajeong {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.start();
	}
}
