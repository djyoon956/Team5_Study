package quiz_week01_03.taeil;

public class Quiz_week01_03_hn {
//상속을 사용해서 반지름이 3인 원의 넓이를 구하세요
	public static void main(String[] args) {
		Child child=new Child();
		child.circleArea(14.2);
	}

}

class Parents {
	final double pi=3.14;
}

class Child extends Parents{
	public void circleArea(double r) {
		System.out.println("원의 넓이는 " + r * r * pi + " 입니다.");
	}
}