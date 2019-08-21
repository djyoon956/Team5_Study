package ch10.hyungnam;

public class ClassVarAccess {

	public static void main(String[] args) {
		AccessWay accessWay=new AccessWay();
		accessWay.num++;
		AccessWay.num++;
		System.out.println("num = "  + AccessWay.num);
	}

}

class AccessWay {
	static int num=0;
	
	AccessWay() {
		incrCnt();
	}
	
	void incrCnt() {
		num++;
	}
}
