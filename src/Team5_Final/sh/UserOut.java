package Team5_Final.sh;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.Product;
import Team5_Final.User;

public class UserOut {
	
	// 사용종료가 되면 로그아웃이 된다. 
	// 로그아웃이 되면 남아 있는 시간이 있는지 없는지 보고 저장한다. 
	// 현재 피씨의 자리를 빈 자리로 만든다. 
	// 메뉴선택 시, 

	
	
	
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
	// 일반 사용자 로그인 기능 
	// 사용자 회원 정보를 어떤 식으로 저장 할 지 
	//id, User
	
	//User(String name, String phoneNumber, String id, String password, String securitNumber
	
	private String name;
	private String phoneNumber;
	private String id;
	private String password;
	private String securitNumber;
	private int age;

	private boolean isLogin;

	private double saveTime; // 잔여시간
	private double totalTime; // 누적시간
	
	public void logout(){    // 일반 사용자 로그아웃(사용종료) 
		if(users.get(id).isLogin()) {// 로그인 상태가  true	일 경우에만 로그아웃이 가능하다. 
			users.get(id).setLogin(false);   //로그아웃 하면 로그인상태는 false 로 바뀐다.
			System.out.println("당신의 남은 시간은 "+ users.get(id).getSaveTime()); //남은시간보여줌 
			
		}else {
			System.out.println("로그인을 먼저 해주세요. ");  // 로그인상태가 false일 경우
			System.exit(0);
		}
	}
	
	                
}
