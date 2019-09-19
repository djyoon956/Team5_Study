package Team5_Final;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Revenus {
	private String buyer;
	private String productName;
	private String price;
	private String date;

	public Revenus(String buyer, String productName, String price) {
		this.buyer = buyer;
		this.productName = productName;
		this.price = price;
		this.date = setDate();
	}

	private String setDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}
}
