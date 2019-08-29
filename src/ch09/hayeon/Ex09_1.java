package ch09.hayeon;

public class Ex09_1 {

	class Point {
		int xPos, yPos;

		public Point(int x, int y) {
			xPos = x;
			xPos = y;
		}

		public void Info() {
			System.out.println("[" + xPos + ", " + yPos + "]");
		}
	}

	class Circle {
		int rad;
		Point center;

		public Circle(int x, int y, int r) {
			center = new Point(x, y);
			rad = r;
		}

		public void Info() {
			System.out.println("반지름: " + rad);
			center.Info();
		}
	}
}

class Round {
	public Round(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Round r = new Round(3, 2, 6);

		r.Info();
	}

	private void Info() {
		// TODO Auto-generated method stub

	}
}
