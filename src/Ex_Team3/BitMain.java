package Ex_Team3;
import java.util.Scanner;

public class BitMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Bit bit=new Bit("����", "01036423603", bCard)
		String center;
		while(true) {
			System.out.println("* * * * ���� ��ȣ��  �������ּ��� * * * *");
			System.out.println("1. java  / 2. pythone / 3. C ");
			
			int num=Integer.parseInt(sc.nextLine());
			if(num <0 || num>3)
			{
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			else
				center= (num==1) ? "����(�Ӱ�� �����)" : (num==2) ? "���ʺ���" : (num==3) ? "����" : null;
		}
		System.out.println("ȸ�� ������� : "  + );
	}

}

class Bit{
	private String bName;
	private String bPhone;
	private String bCard;
	
	public Bit(String bName, String bPhone) {
		System.out.println("���Ϲ��ī�尡 ������ ��û�� �Ұ����մϴ�.");

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
