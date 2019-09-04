package vending;

abstract class Drink {
	protected String name;
	protected int price;
	protected int count;
	
	public Drink(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	abstract void disCount();
	
	@Override
	public String toString() {
		return name + ":\t" + price + "   잔여갯수:" +count + "\t";
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



