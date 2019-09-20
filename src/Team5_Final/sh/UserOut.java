package Team5_Final.sh;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
	
	private long startTime;  // 로그인한 시점의 시각  
	private long endTime;    // 로그아웃한 시점의 시각
	private long usedTime;   //  endTime - startTime 을 한 시간 
	
public boolean login() {
		users = new HashMap<String, User>();
	
		users.put("kos157", new User("psh","010","kos157","15243","900226-1081621"));
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초", Locale.KOREA);
		
		
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
					users.get(id).setLogin(true);					            // 로그인 성공 
					loginCheck = true;
					startTime = System.currentTimeMillis();         // 로그인 시간
					Date time = new Date(startTime);                // currentTime 반환값을 넣음.
					String format_time = format.format(time);	    // 위에서 정한 포맷으로 변경 
					System.out.println("로그인 시각: " + format_time);				// 최종적으로 변경된 날짜와 시간 반환
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
	
	public void logout(){    // 일반 사용자 로그아웃(사용종료) 
			
		String id = "kos157";
		
		if(users.get(id).isLogin()) {// 로그인 상태가  true	일 경우에만 로그아웃이 가능하다. 
			users.get(id).setLogin(false);   //로그아웃 하면 로그인상태는 false 로 바뀐다.
			
			endTime = System.currentTimeMillis();         // 로그아웃 시간
			Date time = new Date(endTime);                // currentTime 반환값을 넣음.
			SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초", Locale.KOREA);
			String formatTimeOut = format.format(time);	    // 위에서 정한 포맷으로 변경 
			System.out.println("로그아웃 시각: " + formatTimeOut);	
			
			
			
			
			usedTime = endTime - startTime;
			System.out.println(usedTime/(1000*60*60) + "시간" + usedTime/(1000*60) + "분" + usedTime/1000 + "초"
														+ " 이용 하셨습니다. ");
			
			
			
			
			
			
			
		// 남은 시간을표시하려면 ??   커렌트밀리타임에서 나온 그 차이 값을 시간단위로만 바꿔서시간에 넣는다. 
			
			
			
			System.out.println("당신의 남은 시간은 "+ users.get(id).getSaveTime()); //남은시간보여줌 
			
			
			
			
			
			
			
		}else {
			System.out.println("로그인을 먼저 해주세요. ");  // 로그인상태가 false일 경우
			System.exit(0);
		}
	}
	
	// 로그아웃이 되기 전에는 
	// 현재 로그인중인지를 확인 
	// 쿠키 정보 존재, 세션 존재 확인
	// 둘 다 존재하지 않는 경우 로그아웃 절차 시작
	// 둘 다 존재하는 경우 10분 뒤에 다시 확인 
	// 둘 다 없는 경우 프로세스 종료 
	
	// 로그인을 한 순간 시간이 흐르고, 다음 로그아웃을 하면,  시작시간 - 현재시간으로 할지  흐른시간을 바로 리턴할 지  
	 

    
	// 실험할 코드 추가	// 
	        
//	long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//	long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
//	System.out.println("시간차이(m) : "+secDiffTime);
	
	
	
	
	
	                
}
