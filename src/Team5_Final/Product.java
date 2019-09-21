package Team5_Final;

public class Product {
	protected int price;
	protected int count;
	protected String name;

}

class Drink extends Product {
	public Drink() {
		this.name = "음료수";
		this.price = 1000;
		this.count--;
	}

	public Drink(int count) {
		this.name = "음료수";
		this.price = 1000;
		this.count = count;
	}

	@Override
	public String toString() {
		return this.name + "가격: " + this.price + "원";
	}
}

class Snack extends Product {
	public Snack() {
		this.name = "과자";
		this.price = 1000;
		count--;
	}

	public Snack(int count) {
		this.name = "과자";
		this.price = 1000;
		this.count = count;
	}

	@Override
	public String toString() {
		return this.name + "가격: " + this.price + "원";
	}
}