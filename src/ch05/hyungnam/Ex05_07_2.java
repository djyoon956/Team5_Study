package ch05.hyungnam;

public class Ex05_07_2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if((i+j)==9) {
					System.out.println("[" + i + "," + j +"]");
				}
			}
		}
	}
}
