package ch10.hyungnam;
public class ClothesMain2 {

	public static void main(String[] args) {
		
			Clothes clothes1 = new Clothes("���̺���", "�Ź�", 19000);
			Clothes clothes2 = new Clothes("����", "Ƽ����", 19000);
			Clothes clothes3 = new Clothes("�����", "����", 19000);
			Clothes clothes4 = new Clothes("����", "�Ź�", 19000);
			Clothes clothes5 = new Clothes("���", "����", 19000);

			clothes1.csales();
			clothes1.csales();
			clothes1.csales();
			clothes1.csales();
			
			System.out.printf("���� �Ǹ� ���� : %d\n\n", Clothes.getSoldcount());
			System.out.printf("�� �Ǹ� �ݾ� : %d\n\n", Clothes.getTotalsales());
			System.out.printf("�������� �� ���� : %d\n\n", Clothes.getPossessioncount());
			System.out.printf("���� �ڻ� : %s\n\n", Clothes.getCapital());
			
	}

}

class Clothes {
	
	private int price; // ����
	private String brand; // �귣��
	private String kind; // ����

	private static int soldcount; // �� �ǸŰ���
	private static int totalsales; // �� �Ǹűݾ�
	private static int possessioncount; // �����ϰ� �ִ� ����
	private static int capital; //�ڻ�
	boolean isSale; //�Ǹ� ���� ����Ī ����

	static { //�ʱ� �ں����� ���� static variable �ʱ�ȭ
		capital = 1000000;
	}
	//���� ���ۺ� 1������ �ҿ�ǰ� ���۰� ���ÿ� �귣��� ������ �Ǹűݾ��� ������ �Ǹ� �� ���� ������ �þ�� �ڻ��� ���ۺ�ŭ �پ��ϴ�.
	public Clothes(String brand, String kind, int price) {  
		capital -= 10000;
		this.brand = brand;
		this.kind = kind;
		this.price = price;
		possessioncount++;
	}

	public static int getCapital() { //���� �ڻ��� �ҷ��ɴϴ�.
		return capital;
	}

	public void setPrice(int price) { //������ �缳���� �� �ֽ��ϴ�.
		this.price = price;
	}

	public static int getSoldcount() { //���� �Ǹŷ��� Ȯ���� �� �ֽ��ϴ�.
		return soldcount;
	}

	public static int getTotalsales() { //�� �Ǹűݾ��� Ȯ���� �� �ֽ��ϴ�.
		return totalsales;
	}

	public static int getPossessioncount() { //���� �������� ���� ������ Ȯ���� �� �ֽ��ϴ�.
		return possessioncount;
	}

	public void csales() { //isSale�� false�� �Ǹ��ϰ� true�� �ٲ�ϴ�. isSale�� true�� �ٸ� ������ �������� �ʰ� �޼����� ���ϴ�.
		if (isSale == false) {
			soldcount++;
			totalsales += price;
			possessioncount--;
			capital += price;
			isSale = true;
		} else
			System.out.println("****�̹� �Ǹ� �� ��ǰ�Դϴ�.**** ");
	}

	public void printClothesInfo() { //���� ������ ����� �� �ֽ��ϴ�.
		System.out.println("�귣��: [" + brand + "]" + " / ����: [" + kind + "] " + " / ����: " + "[" + price + "��]");
	}

}

