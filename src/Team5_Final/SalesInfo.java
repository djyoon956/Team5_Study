package Team5_Final;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SalesInfo {
	private User buyer;
	private String productName;
	private int price;
	private String dateFormat;

	public SalesInfo(User buyer, String productName, int price) {
		this.buyer = buyer;
		this.productName = productName;
		this.price = price;
		this.dateFormat = setDateFormat();
	}

	public User getBuyer() {
		return buyer;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public String getDate() {
		return dateFormat;
	}

	private String setDateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}
}
