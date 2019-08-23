package Ex_Team2;

public class Product_main {
	public static void main(String[] args) {
		Product product = new Product(1010, 1000, "요거트", "디저트", "할인상품");
		System.out.printf("product.getBacord() : %d\n", product.getBacord());
		System.out.printf("product.getKind() : %s\n", product.getKind());
		System.out.printf("product.getName() : %s\n", product.getName());
		product.printInfo();

		product.setPrice(2000);
		product.setSaleInfo("비할인상품");
		product.printInfo();
	}
}

class Product {
	private int bacord;
	private int price;
	private String name;
	private String kind;
	private String saleInfo;

	// 상품의 이름, 바코드, 상품 종류는 특정기능을 통해서만 볼 수 있으며 상품이 등록된 이후 수정 불가능하다.
	public int getBacord() {
		return bacord;
	}

	public String getName() {
		return name;
	}

	public String getKind() {
		return kind;
	}

	// 상품의 가격, 할인유무는 등록된 이후 수정이 가능하다.
	public void setPrice(int price) {
		this.price = price;
	}

	public void setSaleInfo(String saleInfo) {
		this.saleInfo = saleInfo;
	}

	// 상품을 등록하려면 반드시 바코드, 가격, 상품명, 상품종류, 할인유무를 가지고 있어야 한다.
	public Product(int bacord, int price, String name, String kind, String saleInfo) {
		this.bacord = bacord;
		this.price = price;
		this.name = name;
		this.kind = kind;
		this.saleInfo = saleInfo;
	}

	// 바코드, 가격, 상품명의 정보는 확인 가능하다.
	public void printInfo() {
		System.out.printf("바코드 : %d, 가격 : %d, 상품명 : %s\n", bacord, price, name);
	}
}
