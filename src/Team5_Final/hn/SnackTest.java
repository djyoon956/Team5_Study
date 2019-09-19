package Team5_Final.hn;

public class SnackTest extends HnProduct {
	public SnackTest() {
		this.name = "과자";
		this.price = 1000;
		count--;
	}

	public SnackTest(int count) {
		this.name = "과자";
		this.price = 1000;
		this.count = count;
	}

	@Override
	public String toString() {
		return name + "가격: " + this.price + "   잔여갯수: " + this.count;
	}
}