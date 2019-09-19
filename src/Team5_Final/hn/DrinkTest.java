package Team5_Final.hn;


public class DrinkTest extends HnProduct {
	public DrinkTest() {
		count--;
	}
	public DrinkTest(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}

	@Override
	public String toString() {
		return  name +"가격: " + this.price + "   잔여갯수: " + this.count;
	}
	
}