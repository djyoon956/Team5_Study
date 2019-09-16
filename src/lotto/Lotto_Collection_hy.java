package lotto;

import java.util.Random;
import java.util.TreeSet;

class Lotto12 {
	Random rd;
	TreeSet<Integer> ts;

	public void test() {
		rd = new Random(); // random으로 뽑힌 게 변수 rd에 담긴다.
		ts = new TreeSet<>(); // 순서와 상관없고 중복이 허용되지 않는다. 정렬이 된다. 변수 ts에 담긴다
		
		while (true) { // 반복문 while
			ts.add(rd.nextInt(45) + 1); // ts에 숫자 1~45가 추가된다.
			if (ts.size() == 6) { // 만약 6개의 숫자가 ts에 담기면 종료된다.
				break;
			}
		}
		System.out.println(ts);
	}
}

//메인//
public class Lotto_Collection_hy {
	public static void main(String[] args) {

		Lotto12 lotto = new Lotto12(); // Lotto의 객체를 생성해준다.
		lotto.test(); // test()메소드 실행
	}
}
