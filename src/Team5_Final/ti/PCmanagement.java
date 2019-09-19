package Team5_Final.ti;

import java.awt.List;
import java.util.Map;
import java.util.Scanner;

import Team5_Final.Product;
import Team5_Final.User;

//매출 확인 기능

public class PCmanagement {
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
public class showTotal {
	
	void showTotal() {
		System.out.println(totalsales);
	}
	
	

	
}
