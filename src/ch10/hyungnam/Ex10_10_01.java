package ch10.hyungnam;

public class Ex10_10_01 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}

}

class Accumulator{
	static int sum;
	public static void add(int i) {
		sum+=i;
	}
	public static void showResult() {
		System.out.println("sum="+sum);
	}
}
