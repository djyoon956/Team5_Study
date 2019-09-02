package ch09.sungho;
public class ch09 {
    public static void main(String[] args){


        //다음 클래스를 기반으로 원을 의미하는 써클 클래스를 정의하자. 서클 클래스는 좌표상의 위치 정보와 반지름의 길이 정보를 저장 할 수 있어야한다.
        //그리고 다음 수준의 main 메소드를 기반으로 서클 클래스를 테스트하자.

        Circle c = new Circle(2,2,4);
        c.showCircleInfo();

    }
}

class Point{
    int xPos, yPos;
    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPointInfo(){
        System.out.println("[" + xPos + " , " + yPos + " ] ");
    }
}

class Circle {
    int r;
    Point p;

    Circle(int x, int y, int r){
        this.r = r;
        p = new Point(x, y);
    }

    void showCircleInfo(){
        p.showPointInfo();
        System.out.println("[" + this.r + "]");
    }
}




