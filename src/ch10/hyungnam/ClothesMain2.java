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

