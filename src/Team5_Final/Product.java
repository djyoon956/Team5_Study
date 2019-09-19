package Team5_Final;

import java.util.List;

public class Product {
	protected String name;
	protected int price;
	protected int

	

}

class Drink extends Product {
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

class Snack extends Product {
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