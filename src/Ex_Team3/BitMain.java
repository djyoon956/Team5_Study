package Ex_Team3;
import java.util.Scanner;

public class BitMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Bit bit=new Bit("형남", "01036423603", bCard)
		String center;
		while(true) {
			System.out.println("* * * * 강의 번호를  선택해주세요 * * * *");
			System.out.println("1. java  / 2. pythone / 3. C ");
			
			int num=Integer.parseInt(sc.nextLine());
			if(num <0 || num>3)
			{
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			else
				center= (num==1) ? "강남(임경균 강사님)" : (num==2) ? "서초본원" : (num==3) ? "종로" : null;
		}
		System.out.println("회원 정보출력 : "  + );
	}

}

class Bit{
	private String bName;
	private String bPhone;
	private String bCard;
	
	public Bit(String bName, String bPhone) {
		System.out.println("내일배움카드가 없으면 신청이 불가능합니다.");

	}
	
	public Bit(String bName, String bPhone, String bCard) {
		this.bName=bName;
		this.bPhone=bPhone;
		this.bCard=bCard;
	}
	
	public void bitInfo() {
		if(bCard ==null) {
			System.out.println(bName + " / " + bPhone);
		}
		else
			System.out.println
			
			(bName + " / " + bPhone + " / ");
	}
	
}
