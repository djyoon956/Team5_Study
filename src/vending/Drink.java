package vending;

abstract class Drink {
	String name;
	int price;
	int count;
	
	public Drink(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	abstract void disCount();
	
	@Override
	public String toString() {
		return name + ": " + price + "\t 잔여갯수: " +count;
	}
	
}

class Carbonated extends Drink{ //탄산음료
	public Carbonated(String name, int price, int count) {
		super(name, price, count);
	}

	void disCount() {
		count--;
	}
}

class FruitJuce extends Drink{ //과일주스
	public FruitJuce(String name, int price, int count) {
		super(name, price, count);
	}

	void disCount() {
		count--;
	}
}

class Tea extends Drink{ //차 종류
	public Tea(String name, int price, int count) {
		super(name, price, count);
	}

	void disCount() {
		count--;
	}
}

class Coffee extends Drink{ //커피
	public Coffee(String name, int price, int count) {
		super(name, price, count);
	}

	void disCount() {
		count--;
	}
}



