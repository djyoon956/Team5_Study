package ch10.hyungnam;

public class ClassVer {

	public static void main(String[] args) {
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();
		
	}

}

class InstCnt{
	static int instum=0;
	
	InstCnt(){
		instum++;
		System.out.println("인스턴스 생성: " + instum);
	}
}
