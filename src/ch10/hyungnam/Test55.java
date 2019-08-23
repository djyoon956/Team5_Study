package ch10.hyungnam;

class TestMain{
	public static void main(String[] args) {
		Test55 test55 =new Test55("브랜드", "반팔", 10000);
		Test55 test6 =new Test55("브랜드", "반팔", 10000);
		Test55 test7 =new Test55("브랜드", "반팔", 10000);
		Test55 test8 =new Test55("브랜드", "반팔", 10000);
		Test55 test9 =new Test55("브랜드", "반팔", 10000);
		
		test55.showAsset();
		test55.showSales();
		test55.showSalesnumber();
		test55.showStack();
		
	}
}
class Test55 {

	    private static int asset = 1000000;// 초기자산 100만원
	    private String mk;// 브랜드
	    private String type;// 종류
	    private int sprice;// 판매금액
	    private static int sales;// 총매출
	    private static int stack;// 재고
	    private static int salesnumber;// 판매량
	    private boolean already;// 판매여부 미판매:true 판매: false
	 
	    public Test55(String mk, String type, int sprice) {
	        // 옷은 제작과 동시에 브랜드와 종류와 판매금액을 가지게 됩니다.
	        ++stack;// 재고증가
	        already = true;// 판매여부 미판매
	        this.sprice = sprice;
	        this.mk = mk;
	        this.type = type;
	        asset -= 10000;// 생산비용 자산 차감
	    }
	 
	    public void setSprice(int sprice) {
	        // 특정 메소드를 통해 가격조정은 가능합니다
	        this.sprice = sprice;
	    }
	 
	    public void selling() {// 판매 함수
	        if (already == true) {// 판매여부 확인
	            already = false;// 판매여부 변경
	            stack--;// 총 재고 1감소
	 
	            asset += sprice;// 자산이 판매 금액만큼 더해지며
	            sales += sprice;// 매출액이 판매 금액만큼 더해지며
	 
	            salesnumber++;// 판매량 1 증가
	        } else {// 기판매상품인경우
	            System.out.println("이미 판매된 제품입니다");
	        }
	    }
	 
	    public void showAsset() {// 회사는 현재까지의 자산을 확인할 수 있습니다.
	        System.out.println("현재 총 자산 : " + asset);
	    }
	 
	    public void showSales() {// 회사는 현재까지의 총 매출액을 볼 수 있습니다.
	        System.out.println("현재 총 매출 :" + sales);
	    }
	 
	    public void showStack() {// 회사는 보유중인 옷 갯수를 확 할 수 있습니다.
	        System.out.println("현재 재고 : " + stack);
	    }
	 
	    public void showSalesnumber() {// 회사는 현재까지의 누적 판매량을 볼 수 있습니다.
	        System.out.println("현재 판매량 : " + salesnumber);
	    }
	 
	}
