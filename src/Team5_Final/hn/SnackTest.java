package Team5_Final.hn;


public class SnackTest extends HnProduct {
	public SnackTest() {
		count--;
	}
	public SnackTest(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return  name +"가격: " + this.price + "   잔여갯수: " + this.count;
	}
}