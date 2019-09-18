package Team5_Final.hn;

import java.util.List;

public class HnProduct {
	protected String name;
	protected int price;
	protected int count;

}

class Drink extends HnProduct {
	public Drink() {
		count--;
	}
	public Drink(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}

	@Override
	public String toString() {
		return  name +"가격: " + this.price + "   잔여갯수: " + this.count;
	}
	
}

class Snack extends HnProduct {
	public Snack() {
		count--;
	}
	public Snack(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return  name +"가격: " + this.price + "   잔여갯수: " + this.count;
	}
}