package ch14.dajeong;

public class Ex14_01 {

	public static void main(String[] args) {
		HybridWaterCar2 car2=new HybridWaterCar2(100,200,300);
		car2.showCurrentGauge();
	}

}

class Car2{
	int gasolineGauge;
	
}

class HybridCar2 extends Car2{
	int electricGauge;
}



class HybridWaterCar2 extends HybridCar2{
	int waterGauge;
	HybridWaterCar2(int gasolineGauge, int electricGauge, int waterGauge) {
		this.gasolineGauge=gasolineGauge;
		this.electricGauge=electricGauge;
		this.waterGauge=waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " + gasolineGauge);
		System.out.println("잔여 전기량: " + electricGauge);
		System.out.println("잔여 워터량: " + waterGauge);
	}
}
