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
