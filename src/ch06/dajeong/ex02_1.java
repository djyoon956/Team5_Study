package ch06.dajeong;

public class ex02_1 {
	public static void main(String[] args) {
		double r = 3.14;
		System.out.printf("������ %.2f�� �ѷ��� %.2f ���̴� %.2f �̴�.\n", r, getRound(r), getArea(r));

	}

	public static double getRound(double r) {
		return 2 * Math.PI * r;
	}

	public static double getArea(double r) {
		return Math.PI * r * r;
	}
}
