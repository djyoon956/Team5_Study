package Team5_Final.ti;

import java.util.Scanner;

//PC시간 충전 기능
//매출 확인 기능
//재고 확인 기능
public class Charge {
	
	Scanner sc = new Scanner(System.in);
	private int time;
	private int money;

	public int Charge(int money) {   // 사용자로부터 돈을 입력 받으면, 그 만큼의 시간을 반환합니다. 
		this.money = money;
		System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
		money = sc.nextInt();
		
		System.out.printf("%d 원을 받았습니다. 요금 표에 따라  %d 시간이 충전됩니다", money , money/1000 );
		
		return money/1000;
		
//		switch(time){
//		case 1: 
//			System.out.println("한시간이 추가 되었습니다.");
//			break;
//		case 2:
//			System.out.println("두시간이 추가 되었습니다.");
//			break;
//		case 3:
//			System.out.println("세시간이 추가 되었습니다.");
//			break;
//		case 4:
//			System.out.println("네시간이 추가 되었습니다.");
//			break;
//			
//						
//		}

	}

	public static void main(String[] args) {

	//	long time1 = System.currentTimeMillis();
		//long time2 = System.currentTimeMillis();
	//	System.out.println((time2 - time1) / 1000.0);
		
		
	}
}
