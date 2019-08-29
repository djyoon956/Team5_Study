package ch09.hyungnam;

public class Ex09_09_01 {

	public static void main(String[] args) {
		
		Circle3 circle3=new Circle3(3, 1, 4);
		circle3.showPointInfo();
	}

}

	
class Circle3{
	int xPos, yPos, r;
	public Circle3(int x, int y, int r) {
		xPos=x;
		yPos=y;
		this.r=r;
		
	}
	
	public void showPointInfo() {
		System.out.println("["+xPos + " , " + yPos + ", ������:  " + r + "]");
	}
}
