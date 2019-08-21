package ch05.hyungnam;

public class Ex05_06_1 {

	public static void main(String[] args) {
		int num= 0;
		int count= 0;
		
		for(int i=1; i<100; i++) {
			if(i%35==0) {
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("count: "+ count);
	}

}
