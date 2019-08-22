package ch10.hyungnam;

public class Clothes {
	private int price; // 가격
	private String brand; // 브랜드
	private String kind; // 종류

	private static int soldcount; // 총 판매개수
	private static int totalsales; // 총 판매금액
	private static int possessioncount; // 보유하고 있는 개수
	private static int capital;
	boolean isSale;
	static {
		capital = 100000;
	}

	public static int getCapital() {
		return capital;
	}

	public static int getSoldcount() {
		return soldcount;
	}

	public static int getTotalsales() {
		return totalsales;
	}

	public static int getPossessioncount() {
		return possessioncount;
	}

	public Clothes(String cbrand, String ckind, int cprice) {
		brand = cbrand;
		kind = ckind;
		price = cprice;
		possessioncount++;
		capital-=10000;
	}

	public void csales() {
		if(isSale==false) {
			soldcount++;
			totalsales += price;
			possessioncount--;
			capital+=price;
			isSale=true;
		}
		else
			System.out.println("****이미 판매 된 상품입니다.**** ");
	}
	
	public void printClothesInfo(){
		System.out.println("브랜드: ["  +brand + "]" +  " / 종류: [" + kind +"] " +" / 가격: " + "[" + price + "원]");
	}

}
