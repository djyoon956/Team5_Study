package ch07.hyungnam;

public class Ex07_07_01 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 5);
		triangle.triangleArea();
	}

}

class Triangle {
	int bottom;
	int height;

	public Triangle(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}

	public void triangleArea() {
		System.out.println("≥–¿Ã: " + bottom * height / 2);
	}
}
