package ch07.dajeong;

class Triangle {
	int width;
	int height;

	Triangle() {
		width = 1;
		height = 1;
	}

	void setWidth(int number) {
		width = number;
	}

	void setHeight(int number) {
		height = number;
	}

	double getArea() {
		return (width * height) / 2;
	}
}

public class ex01 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.setWidth(20);
		triangle.setHeight(10);

		System.out.printf("width : %d, height : %d, area : %.2f\n", triangle.width, triangle.height,
				triangle.getArea());
	}
}
