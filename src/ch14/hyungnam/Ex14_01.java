package ch14.hyungnam;

public class Ex14_01 {

	public static void main(String[] args) {
		HybridWaterCar car=new HybridWaterCar();
		car.showCurrentGauge();
	}

}

class Car3{
	int gasolineGauge;
	
	public Car3() {
		this.gasolineGauge=100;
	}
	
}

class HybridCar extends Car3{
	int electricGauge;
	
	public HybridCar() {
		this.electricGauge=1000;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	public HybridWaterCar() {
		this.waterGauge=10000;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: " +gasolineGauge );
		System.out.println("잔여 전기량: " +electricGauge );
		System.out.println("잔여 워터량: " +waterGauge );
	}
}
