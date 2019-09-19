package Team5_Final.ti;

import java.util.Scanner;

//PC시간 충전 기능
//매출 확인 기능
//재고 확인 기능
public class Charge {
	
	Scanner sc = new Scanner(System.in);
	private int time;
	private int money;

	public Charge(int time) {
		this.time = time;
		System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
		time = sc.nextInt();
		switch(time){
		case 1: 
			System.out.println("한시간이 추가 되었습니다.");
			break;
		case 2:
			System.out.println("두시간이 추가 되었습니다.");
			break;
		case 3:
			System.out.println("세시간이 추가 되었습니다.");
			break;
		case 4:
			System.out.println("네시간이 추가 되었습니다.");
			break;
			
						
		}

	}

	public static void main(String[] args) {

	//	long time1 = System.currentTimeMillis();
		//long time2 = System.currentTimeMillis();
	//	System.out.println((time2 - time1) / 1000.0);
		
		
	}
}
