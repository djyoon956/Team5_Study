package ch09.dajeong;

public class Circle {
	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	void showCircleInfo() {
		System.out.print("��ǥ : ");
		point.showPointInfo();
		System.out.printf("������ : %d\n", radius);
	}
}
