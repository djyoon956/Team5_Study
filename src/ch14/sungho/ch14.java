package ch14.sugnho;
public class ch14 {
    public static void main(String[] args){
            //다음 클래스 각각에 적절한 생성자를 삽입해 보자, 물론 상속 관계를 고려하여 각 클래스 별로 필요한 생성자를 삽입해야한다.
       HybridWaterCar hwCar = new HybridWaterCar(18, 23,4);
       hwCar.showCurrentGauge();
    }
}

//상속을 할 때 생성자차원에서 이어지겠금 해라 .
class Car {
    int gasolineGauge;

    Car(int g){
        this.gasolineGauge = g;
    }
}

class HybridCar extends Car {
    int electricGauge;

    HybridCar(int g, int e) {
        super(g);
        this.electricGauge = e;

    }
}

class HybridWaterCar extends HybridCar{
    int waterGauge;

    HybridWaterCar(int g, int e, int w){
        super(g,e);
        this.waterGauge = w;
    }
    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 :" + gasolineGauge);
        System.out.println("잔여 전기량: " + electricGauge);
        System.out.println("잔여 워터량: " + waterGauge);
    }
}