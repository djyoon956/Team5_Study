package quiz_week01_03.hyungnam;
import java.util.Scanner;


//package quiz_week01_03.hyungnam;

public class Quiz_week01_03_sh {

    public static void main(String[] args) {
        //다형성을 이용하기 위해 오버라이딩과 상속을 이용
        gojoHALBAE northKorea = new normalHALBAE();
        //여기서 위 줄 출력 코드를 예상 할 줄 알아야 함.

        System.out.println(northKorea.toString());
        //자 이것도 출력을 예상 해보자. 원래는 자식 자원에는 접근하지 못한다. 하지만 오버라이딩을 하여 자식쪽에서 재성의 해버렸다. 그럼 자식쪽의 메서드를 사용 할 수 있다.

    }

}


class gojoHALBAE{
    gojoHALBAE(){
        System.out.println("고조 남조선 아이가 나를 왜 부르는기레, 일 없다우");
    }

    @Override
    public String toString(){
        return "고조 할배입니다.";
    }

}

class normalHALBAE extends gojoHALBAE{
    normalHALBAE(){
        System.out.println("마 서울 촌놈들 강알리 등킨드나쓰 못무봤제? 마 붓싼오면 연락 함 해라 할배가 하나 싸주께 등킨드나쓰!");
    }
    @Override
    public String toString(){
        return "그냥 할베입니다. ";
    }
}

class father extends normalHALBAE{
    father(){
        System.out.println("와이리 애볐노...니 영 파이다");
    }
}

class iAM extends father{
    iAM(){
        System.out.println("무싱 거옌 고릅디가?, 호꼼 있당 와 줍서");
    }
}
