package Team5_Final.sh;
import java.util.HashMap;
import java.util.Iterator;
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
	
	
	public boolean login(String id, String password) {
		//HashMap<String, User> test = new HashMap<>();
		//test.put("kos157" , new User("박성호", "010-5233-3208", "kos157", "15243", "900226-1081621"));
		Iterator<String> keyId = users.keySet().iterator();       // test 가 해쉬맵 변수명이어야함 
		boolean loginCheck = false;
		while(keyId.hasNext()) {
			String key = keyId.next();
			if(users.get(key).getId().equals(id)){
				if( users.get(key).getPassword().equals(password)) {
					System.out.println("로그인 성공 하셨습니다.");
					loginCheck = true;           //로그인 성공하면  true 집어 넣음. 혹시 나중에 로그인상태 알아보기 위해 쓸려면 쓰샘 
				}else {
					System.out.println("비밀번호가 틀렸습니다 다시 한 번 확인해주세요.");
				}
			}else {
				System.out.println("일치하는 ID가 없습니다.");
			}
			
		}
		return loginCheck;
	}
	
	
	public LoginNormal(){
		
			}

}
