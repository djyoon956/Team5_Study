package ch14.hayeon;

class Car {
	int gasolineGauge; // 가솔린 잔여량

	public Car(int gasol) {
		gasolineGauge = gasol;
	}
}

class HybridCar extends Car {
	int electricGauge;

	public HybridCar(int gasol, int elect) {
		super(gasol);
		electricGauge = elect;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;

	public HybridWaterCar(int gasol, int elect, int water) {
		super(gasol, elect);
		waterGauge = water;
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린:" + gasolineGauge);
		System.out.println("잔여 전기량:" + electricGauge);
		System.out.println("잔여 워터량:" + waterGauge);
	}
}

public class Ex14_1 {
	public static void main(String[] args) {
		HybridWaterCar car1 = new HybridWaterCar(100, 300, 200);
		car1.showCurrentGauge();

	}

}