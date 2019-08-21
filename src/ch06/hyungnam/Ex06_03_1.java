package ch06.hyungnam;

public class Ex06_03_1 {

	public static void main(String[] args) {
		System.out.println(fac1(5));
	}
	
	public static int fac1(int count) {
		if(count==1) {
			return 2;
		}
		else
			return 2* fac1(count-1);
	}

}
