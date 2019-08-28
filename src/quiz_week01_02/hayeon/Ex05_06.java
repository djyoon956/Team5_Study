package quiz_week01_02.hayeon;

public class Ex05_06 {

	public static void main(String[] args) {
		//5-6-1
		int count=0;
		
		for(int num=1; num<=100; num++) {
			if(((num%5)!=0) || ((num%7)!=0))
				continue;
			count++;
			System.out.println(num);//or가 아니라 and 아닌가? 그리고, or인 경우 키보드 어떻게 침?
		}
		System.out.println("합:"+count);
		
		//5-6-2

	}

}
