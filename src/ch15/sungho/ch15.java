package ch15.sungho;
// 예제 Wrapping.java를 instanceof 연산자를 사용하지 않는 형태로 변경해보자. 이를 위해 서는 클래스의 상속 관계를 그대로 유지하면서 멯소드 오버라이딩 기반
// 으로 예제가 동작하도록 코드를 수정해야 한다. 즉 필요하다면 메소드의 이름를 수정해야 한다.



//1. 스태틱으로 선언된 메소드의 파라미터값이 부모객체형일 때
//    1) 무엇을 위해 나온 코드인지 >> 부모 인스턴스로 자식자원에 접근하려면 오버로딩 + 업캐스팅이 되어야 함.
//    2) 여기서는 업케스팅이 아님. 부모 인스턴스를 파라미터로 받는 함수이긴 하나, 결국 자식 자원에 접근하려면, 각체 각각 다 만들어줘야함
//    3) 단순히 여기서는 상속 관계 에서는 자식들이나 부모이나 서로 구분없이 주소를 받는 것 보여주는 것
//    4) 부모 타입에는 자식 주소값이 갈 수 있다. 하지만 그 반대는 안된다.
//    5) 여기서는 오버로딩을 통해, 부모타입의 파라미터를 가진 함수를 사용하는 모습을 외우면 된다.



//키 포인트는 이거다 : 하나의 파라미터 유형을 이용해서 다른 유형의 파라미터객체 에도 접근 가능하다. 오버라이딩 기능 때문이다.




class ch15 {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    public static void wrapBox(Box box){ box.wrap();}

}

class Box{
    public void wrap(){
        System.out.println("Simple Wrapping");
    }
}


class PaperBox extends Box {
    public void wrap(){
        System.out.println("Paper Wrapping");
    }
}


class GoldPaperBox extends PaperBox {
    public void wrap(){
        System.out.println("Gold Wrapping");
    }
}


