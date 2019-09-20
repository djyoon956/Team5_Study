package Team5_Final;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SalesInfo {
	private User buyer;
	private String productName;
	private int price;
	private String date;

	public SalesInfo(User buyer, String productName, int price) {
		this.buyer = buyer;
		this.productName = productName;
		this.price = price;
		this.date = setDate();
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
		return date;
	}

	private String setDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}

	private void test() {
		List<SalesInfo> salesInfos = new ArrayList<SalesInfo>();
		String salesInfoCsv = "salesInfos.csv";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream(salesInfoCsv);
			osw = new OutputStreamWriter(fos, "EUC-KR");
			bw = new BufferedWriter(osw);

			bw.write("번호,제품명,구매자,구매 날짜,구매 시간,가격");
			bw.newLine();
			int index = 0;
			for (SalesInfo user : salesInfos) {
				bw.write(++index + "," + user.getProductName() + "," + user.getBuyer() + ","
						+ user.getDate().split(" ")[0] + "," + user.getDate().split(" ")[1] + "," + user.getPrice());
				bw.newLine();
			}
			System.out.println("파일 저장을 완료했습니다.");
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		} finally {
			try {
				bw.close();
				osw.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
