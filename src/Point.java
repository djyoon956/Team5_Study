

public class Point {

	int xPos, yPos;
	public Point(int x, int y) { // ������
		xPos = x;
		yPos = y;
	
	} 
	
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	       }
	}
	class Circle
	{
		int rad; // ������
		Point center; //����Ʈ Ŭ���� ����
		
		public Circle(int x, int y, int r) {  // ������
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

