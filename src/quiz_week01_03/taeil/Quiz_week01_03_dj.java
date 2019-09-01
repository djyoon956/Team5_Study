package quiz_week01_03.taeil;

class Shape {
	public void getArea() {

	}
}

class Circle extends Shape {
	int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void getArea() {
		System.out.printf("원의 넓이 : %.2f", r * r * Math.PI);
	}
}

public class Quiz_week01_03_dj {
// 상속을 사용해서 반지름이 3인 원의 넓이를 구하세요
	public static void main(String[] args) {
		Shape circleShape = new Circle(4);
		circleShape.getArea();
	}
}
