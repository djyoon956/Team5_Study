package Team5_Final.sh;

import java.util.*;
import Team5_Final.User;

public class LoginNormal {
	// 일반 사용자 로그인 기능 
	// 사용자 회원 정보를 어떤 식으로 저장 할 지 
	List<User> userList = new ArrayList<>();
	Iterator iterator = userList.iterator();
	boolean loginCheck = false;
	
	LoginNormal(String id , String password){
		while(iterator.hasNext()) {
			User u = (User) iterator.next();
			if(u.getId().equals(id)) {
				if(u.getPassword().equals(password)) {
					loginCheck = true;
					System.out.println("환영 합니다. " + u.getName()+ "님 로그인 되었습니다.");
					
				}
			}
		}
		
	}



	


	
	
	//User(String name, String phoneNumber, String id, String password, String securitNumber
	
	
	
	
	
	
}
