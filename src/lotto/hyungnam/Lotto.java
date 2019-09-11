package lotto.hyungnam;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {
	// private int[] numbers; //원칙적으로 필드멤버의 초기화는 생성자에서 함
	public  int a=1;
	private Random random;
	private Scanner scanner;
	private TreeSet<Integer> ts;
	private FileWriter fw;
	private BufferedWriter bw;
	private SimpleDateFormat format1;
	private Date date;
	private String time;
	private int gameCount;
	private int selectNum;

	public Lotto() { // 예쁜 설계도
		this.ts = new TreeSet<Integer>();
		this.random = new Random();
		this.scanner = new Scanner(System.in);
		this.format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.date = new Date();
		this.time = format1.format(date);
		try {
			this.fw = new FileWriter("Lotto2.txt", true);
			this.bw = new BufferedWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void seletLotto() {
		while (true) {
			showManu(scanner);
			switch (selectNum) {
			case 1:
				repeatLotto();
				continue;
			case 2:
				selecExit();
				break;
			default:
				System.out.println("Not in Operation");
				break;
			}
		}
	}

	private void makeLotto(Random random, TreeSet<Integer> ts) {
		for (int i = 0; ts.size() < 6; i++) {
			ts.add((int) (Math.random() * 45) + 1);
		}
		Iterator<Integer> iterator = ts.iterator();
		while (iterator.hasNext()) {
			int it = iterator.next();
			System.out.printf("[%02d]", it);
				String a = String.format("[%02d]", it);
				try {
					bw.write(a);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		try {
			bw.write("\t\t\t\t" + time);
			bw.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ts.clear();
		System.out.println("");
	}

	private void repeatLotto() {
		System.out.println("게임 수를 입력해주세요. (최대 5게임)");
		while (true) {
			if (scanner.hasNextInt()) {
				gameCount = scanner.nextInt();
				if (gameCount > 0 && gameCount < 6)
					break;
			} else {
				System.out.println("잘못입력하셨습니다. 1~5의 숫자를 입력해주세요.");
				scanner.next();
			}
		}
		for (int i = 0; i < gameCount; i++) {
			System.out.print((char) (65 + i) + ": ");
			makeLotto(random, ts);
		}
	}

//		
//		 for(int i=0; i<numbers.length; i++) {
//			 numbers[i]=random.nextInt(45)+1;
//	            
//	            for(int j=i-1; j>=0; j--) {    //
//	                if(numbers[i]==numbers[j]) {    //lot[i]와 같은숫자가 나오면 i--하고 다시 바깥쪽 for문으로가서 같은 로직 수행
//	                    i--;
//	                }
//	            }
//	        }
//	}
	// 규칙: 배열의 합이 특정범위 해당되면 추출, 안되면 재추출
//	private boolean checkAverrage(TreeSet<Integer> ts) {
//		int sum=0;
//		int average=0;
//		
//		for (int i : ts) {
//			sum+=i;
//		}
//		if(sum!=0) {
//			average=sum/6;
//			System.out.println("평균: " + average);
//			return (average>=15 && average <=30);
//		}
//		return false;
//	}
	// 메뉴 설정기능 함수
	private int showManu(Scanner scanner) {
		System.out.println("**********************");
		System.out.println("1. 당첨 예상번호 추출하기");
		System.out.println("2. 프로그램 종료하기");
		System.out.println("**********************");
		System.out.println("원하는 작업번호를 선택하세요");
		selectNum = scanner.nextInt();

		return selectNum;
	}

	private void selecExit() {
		try {
			bw.close();
			fw.close();
		} catch (Exception e) {
		}

		System.exit(0);
	}

//	private void showNumbers(TreeSet<Integer> ts) {
//		int min = 0; // 비교해서 작은값을 담을 변수
//		for (int i = 0; i < ts.length - 1; i++) { // 모든값을 비교
//			for (int j = 0; j < ts.length - 1; j++) {
//				if (ts[j + 1] < ts[j]) { // 앞뒤로 비교해서 앞에 값이 더 크면
//					min = ts[j + 1]; // 뒤에 값을 min에 저장
//					ts[j + 1] = ts[j]; // 앞에 값을 뒤로 옮기고
//					ts[j] = min; // 뒤에 값을 저장했던 min값을 앞으로 옮김
//				}
//			}
//		}
//		System.out.print("선택한 번호: "  );
//		for(int i=0; i<ts.length; i++) {
//			System.out.printf("[%2d]",ts[i]);
//		}
//		System.out.println("");
//	}

}
