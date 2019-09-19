package Team5_Final.ti;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.Product;
import Team5_Final.User;

//PC시간 충전 기능
//매출 확인 기능
//재고 확인 기능

//요금판 출력
public class Charge {
	
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "123";

	private Scanner scanner;
	private Map<String, User> users; // 회원리스트 key:id, value:User
	private int totalSales; // 매출
	private int[][] seats; // pc 좌석
	private List<Product> products;
	// 게임 목록
	private boolean isAdmin;
	private String userFilenName;

	public int Charge() {   // 사용자로부터 돈을 입력 받으면, 그 만큼의 시간을 반환합니다. 
		// 1. id 입력받기
		// 2. 회원중 id 일치하는 회원 찾기
		// 3. 시간 추가하기 o
		// 4. 회원 saveTime에 시간 추가해주기.
		System.out.println("시간 추가를 위해 지불할 돈을 입력하세요 : ");
		int money = scanner.nextInt();
		
		System.out.printf("%d 원을 받았습니다. 요금 표에 따라  %d 시간이 충전됩니다", money , money/1000 );

		return money/1000;
		
		switch(money){
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

	public static void main(String[] args) {

	//	long time1 = System.currentTimeMillis();
		//long time2 = System.currentTimeMillis();
	//	System.out.println((time2 - time1) / 1000.0);
		
		
	}
}
