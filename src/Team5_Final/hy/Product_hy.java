package Team5_Final.hy;

import java.util.List;

public class Product_hy {
	protected int price;
	protected int count;
	protected String name;

}

class Drink_hy extends Product_hy {
	public Drink_hy() {
		this.name = "음료수";
		this.price = 1000;
		count--;
	}

	public Drink_hy(int count) {
		this.name = "음료수";
		this.price = 1000;
		this.count = 100;
	}

	@Override
	public String toString() {
		return this.name + "가격: " + this.price + "원";
	}

	public char[] count() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Snack_hy extends Product_hy {
	public Snack_hy() {
		this.name = "과자";
		this.price = 1000;
		count--;
	}

	public Snack_hy(int count) {
		this.name = "과자";
		this.price = 1000;
		this.count = 100;
	}

	@Override
	public String toString() {
		return this.name + "가격: " + this.price + "원";
	}
}