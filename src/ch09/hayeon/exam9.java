package ch09.hayeon;
class Point { 
    int xPos, yPos;
    public Point(int x, int y) {
        xPos = x;
        xPos = y;
    }
    public void showPointInfo() { 
        System.out.println("[" + xPos + ", " + yPos + "]"); 
    }
}



class Circle
{
	int center;
	Point length;
	
	Public Circle(int a, int b, int c) {
		center=a;
		length=b;
	}
	Public void bookInfor() {
		System.out.println("좌표:"+center+"길이"+length);
	}
	
}

class UseCircle {
    public static void main(String[] args) {
        // 좌표 [2, 2] 반지름 4인 원의 생성
        Circle c = new Circle(2, 2, 4);

        // 원의 정보 출력
        c.showCircleInfo();
    }
}

