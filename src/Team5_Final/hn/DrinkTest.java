package Team5_Final.hn;

public class DrinkTest extends HnProduct {
	public DrinkTest() {
		this.name = "음료수";
		this.price = 1000;
		count--;
	}

	public DrinkTest(int count) {
		this.name = "음료수";
		this.price = 1000;
		this.count = count;
	}

	@Override
	public String toString() {
		return name + "가격: " + this.price + "   잔여갯수: " + this.count;
	}

}