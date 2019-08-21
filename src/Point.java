

public class Point {

	int xPos, yPos;
	public Point(int x, int y) { // 생성자
		xPos = x;
		yPos = y;
	
	} 
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	       }
	}
	class Circle
	{
		int rad; // 반지름
		Point center; //포인트 클래스 변수
		
		public Circle(int x, int y, int r) {  // 생성자
	    center = new Point(x, y);
	    rad = r;
		}
  	
	
		public void showCircleInfo(){  
		System.out.println("radius: " + rad);
		center.showPointInfo();
	    }
	}
		class UseCircle {
			public static void main(String[] args) {
				Circle c = new Circle(2, 2, 4);
				
					c.showCircleInfo();
			}
		}

