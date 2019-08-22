package ch10.hyungnam;

public class Clothes {
	private int price; // ����


	private String brand; // �귣��
	private String kind; // ����

	private static int soldcount; // �� �ǸŰ���
	private static int totalsales; // �� �Ǹűݾ�
	private static int possessioncount; // �����ϰ� �ִ� ����
	private static int capital;
	boolean isSale;

	static {
		capital = 100000;
	}
	public Clothes(String cbrand, String ckind, int cprice) {

		capital -= 10000;
		if (capital < 0) {
			System.out.println("���ۺ� �����մϴ�.");
			capital += 10000;
			return;
		} else {
			brand = cbrand;
			kind = ckind;
			price = cprice;
			possessioncount++;
		}
	}

	public static int getCapital() {
		return capital;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public static int getSoldcount() {
		return soldcount;
	}

	public static int getTotalsales() {
		return totalsales;
	}

	public static int getPossessioncount() {
		return possessioncount;
	}

	public void csales() {
		if (isSale == false) {
			soldcount++;
			totalsales += price;
			possessioncount--;
			capital += price;
			isSale = true;
		} else
			System.out.println("****�̹� �Ǹ� �� ��ǰ�Դϴ�.**** ");
	}

	public void printClothesInfo() {
		System.out.println("�귣��: [" + brand + "]" + " / ����: [" + kind + "] " + " / ����: " + "[" + price + "��]");
	}

}
