package Ex_Team2;

public class BarcodeMain {

	public static void main(String[] args) {
		Barcode barcode=new Barcode(111, 111, "����", "���λ�ǰ");
		System.out.println(barcode.bCode);
		System.out.println(barcode.bName);
		System.out.println(barcode.bPrice);
		System.out.println(barcode.bSale);
		barcode.bInfo();//ddd
	}

}

class Barcode{
	int bCode;
	int bPrice;
	String bName;
	String bSale;
	
	public Barcode(int bCode, int bPrice, String bName, String bSale) {
		this.bCode=bCode;
		this.bPrice=bPrice;
		this.bName=bName;
		this.bSale=bSale;
	}
	
	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	public String getbSale() {
		return bSale;
	}

	public void setbSale(String bSale) {
		this.bSale = bSale;
	}

	public int getbCode() {
		return bCode;
	}

	public String getbName() {
		return bName;
	}
	
	public void bInfo() {
		System.out.println(bCode + " / " + bPrice + " / " + bName + " / " + bSale );
	}


	
}
