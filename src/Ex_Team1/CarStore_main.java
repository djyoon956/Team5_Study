package Ex_Team1;

public class CarStore_main {
	public static void main(String[] args) {
		CarStore smartCar = new CarStore("smart", 10000);
		smartCar.getPrice();
		smartCar.getType();
		smartCar.printInfo();
		CarStore smartCar2 = new CarStore("smart", 10000);
		CarStore smartCar3 = new CarStore("smart", 10000);

		CarStore webCar = new CarStore("web", 10000);
		webCar.getPrice();
		webCar.getType();
		webCar.printInfo();
		CarStore webCar2 = new CarStore("web", 10000);
		CarStore webCar3 = new CarStore("web", 10000);

		// 차종이 맞지 않습니다.
		CarStore javaCar0 = new CarStore("java12", 10000);

		CarStore javaCar = new CarStore("java", 10000);
		javaCar.getPrice();
		javaCar.getType();
		javaCar.printInfo();

		javaCar.printSmartTypeTotalCount();
		javaCar.printWebTypeTotalCount();
		javaCar.printJavaTypeTotalCount();
		javaCar.printTotalCount();
	}
}

