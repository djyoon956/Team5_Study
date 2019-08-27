package ch14.dajeong;

import Ex_Team3.three;

class Car {
	int gasolinGauge;

	public Car(int gasolinGauge) {
		this.gasolinGauge = gasolinGauge;
	}
}

class HybridCar extends Car {
	int electricGauge;

	public HybridCar(int gasolinGauge, int electricGauge) {
		super(gasolinGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;

	public HybridWaterCar(int gasolinGauge, int electricGauge, int waterGauge) {
		super(gasolinGauge, electricGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}

public class ex01 {
	public static void main(String[] args) {
		HybridWaterCar car = new HybridWaterCar(100, 100, 100);
		car.showCurrentGauge();
	}

}
