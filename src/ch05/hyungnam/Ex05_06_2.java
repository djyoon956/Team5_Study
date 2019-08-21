package ch05.hyungnam;

public class Ex05_06_2 {

	public static void main(String[] args) {
		int aCount=0;
		int add=1;
		while(true) {
			if(aCount>1000) {
				break;
			}
			aCount+=add;
			add+=2;
		}
		System.out.println(aCount);
	}

}
