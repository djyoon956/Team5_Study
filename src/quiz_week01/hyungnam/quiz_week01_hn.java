package quiz_week01.hyungnam;

import java.util.Scanner;

public class quiz_week01_hn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수: ");
		int num=sc.nextInt();
		for(int i=1; i<10; i++) {
			for(int j=num-1; j<=num+1; j++) {
				System.out.print(j + " * " + i +" = " + j*i + "\t\t");
			}
			System.out.println("");
		}
	}

}
