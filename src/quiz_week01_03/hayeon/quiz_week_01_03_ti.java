package quiz_week01_03.hayeon;

public class quiz_week_01_03_ti {

	public static void main(String[] args) {
		// ���� ������� ����� ����
		for(int i=1, n=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(((j >=n+1) && (j <=10-n))? " " : "*"); 
			}
			if(i < 5) {
				n++;
			}else {
				n--;
			}
			System.out.println();
		}
	
	
	}
			
		}