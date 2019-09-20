package Team5_Final.sh;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.Product;
import Team5_Final.User;

public class LoginNormal {
	
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
	
	
	
	public boolean login() {
		
		int tryCount = 3;
		boolean loginCheck = false;
		Scanner sc  = new Scanner(System.in);
		for( int i = tryCount ; i > 0; i--) {
			System.out.printf("아이뒤를 입력해 주세요 : ");
			String id = sc.nextLine();
			if(users.containsKey(id)) {
				System.out.println("비밀번호를 입력해 주세요");
				String password = sc.nextLine();
				if ( users.get(id).getPassword().equals(password)) {
					System.out.println("로그인 성공 하셨습니다.");
					loginCheck = true;
					break;
				}else {
					System.out.println("비밀번호를 다시 한 번 확인해주세요");
					System.out.println("재시도 기회 : " + (i - 1) + "/" + tryCount);
				}
			}else {
				System.out.println("일치하는 ID가 없습니다.");
				System.out.println("재시도 기회 : " + (i - 1) + "/" + tryCount);
			
			}
		}
		
		return loginCheck;
	}
	
	
	
	
	
}
