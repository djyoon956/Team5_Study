package vending;

class Drink extends Product {
	int price;
	boolean isCostomIce;
	boolean isCostomWater;
	boolean isCostomPearl;

	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}


	public String toString() {
		return name + ":\t" + price + "\t잔여갯수:" + count + "\t";
	}
	
	void disCount() {
		count--;
	}
}

class Carbonated extends Drink { // 탄산음료
	public Carbonated(String name, int price, int count) {
		super(name, price, count);
		isCostomIce = true;
		isCostomPearl = false;
		isCostomWater = false;
	}
	
}

class Tea extends Drink { // 차 종류
	public Tea(String name, int price, int count) {
		super(name, price, count);
		isCostomIce = true;
		isCostomPearl = true;
		isCostomWater = true;
	}
	
}

class Coffee extends Drink { // 커피
	public Coffee(String name, int price, int count) {
		super(name, price, count);
		isCostomIce = true;
		isCostomPearl = true;
		isCostomWater = true;
	}
	
}
