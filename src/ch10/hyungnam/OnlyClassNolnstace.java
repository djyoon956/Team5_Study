package ch10.hyungnam;

public class OnlyClassNolnstace {

	public static void main(String[] args) {
		InstCnt2.instNum-=15;
		System.out.println(InstCnt2.instNum);
	}

}

class InstCnt2{
	static int instNum=100;
	
	InstCnt2(){
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
	
}

