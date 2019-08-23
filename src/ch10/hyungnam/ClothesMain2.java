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
