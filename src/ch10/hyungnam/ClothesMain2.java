package ch10.hyungnam;
public class ClothesMain2 {

	public static void main(String[] args) {
		
			Clothes clothes1 = new Clothes("루이비통", "신발", 19000);
			Clothes clothes2 = new Clothes("구찌", "티셔츠", 19000);
			Clothes clothes3 = new Clothes("프라다", "가방", 19000);
			Clothes clothes4 = new Clothes("샤넬", "신발", 19000);
			Clothes clothes5 = new Clothes("디올", "바지", 19000);

			clothes1.csales();
			clothes1.csales();
			clothes1.csales();
			clothes1.csales();
			
			System.out.printf("누적 판매 갯수 : %d\n\n", Clothes.getSoldcount());
			System.out.printf("총 판매 금액 : %d\n\n", Clothes.getTotalsales());
			System.out.printf("보유중인 옷 갯수 : %d\n\n", Clothes.getPossessioncount());
			System.out.printf("보유 자산 : %s\n\n", Clothes.getCapital());
			
	}

}

class Clothes {
	
	private int price; // 가격
	private String brand; // 브랜드
	private String kind; // 종류

	private static int soldcount; // 총 판매개수
	private static int totalsales; // 총 판매금액
	private static int possessioncount; // 보유하고 있는 개수
	private static int capital; //자산
	boolean isSale; //판매 여부 스위칭 변수

	static { //초기 자본금을 위한 static variable 초기화
		capital = 1000000;
	}
	//옷은 제작비 1만원이 소요되고 제작과 동시에 브랜드와 종류와 판매금액을 가지게 되며 총 옷의 갯수는 늘어나고 자산은 제작비만큼 줄어듭니다.
	public Clothes(String brand, String kind, int price) {  
		capital -= 10000;
		this.brand = brand;
		this.kind = kind;
		this.price = price;
		possessioncount++;
	}

	public static int getCapital() { //현재 자산을 불러옵니다.
		return capital;
	}

	public void setPrice(int price) { //가격을 재설정할 수 있습니다.
		this.price = price;
	}

	public static int getSoldcount() { //누적 판매량을 확인할 수 있습니다.
		return soldcount;
	}

	public static int getTotalsales() { //총 판매금액을 확인할 수 있습니다.
		return totalsales;
	}

	public static int getPossessioncount() { //현재 보유중인 옷의 갯수를 확인할 수 있습니다.
		return possessioncount;
	}

	public void csales() { //isSale이 false면 판매하고 true로 바뀝니다. isSale이 true면 다른 변수에 영향주지 않고 메세지만 띄웁니다.
		if (isSale == false) {
			soldcount++;
			totalsales += price;
			possessioncount--;
			capital += price;
			isSale = true;
		} else
			System.out.println("****이미 판매 된 상품입니다.**** ");
	}

	public void printClothesInfo() { //옷의 정보를 출력할 수 있습니다.
		System.out.println("브랜드: [" + brand + "]" + " / 종류: [" + kind + "] " + " / 가격: " + "[" + price + "원]");
	}

}

