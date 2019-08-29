package ch13.hyungnam;

public class Ex13_02_2 {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		Ex13_02_2Test ex13_02_2Test=new Ex13_02_2Test();
		ex13_02_2Test.shift(arr);
		ex13_02_2Test.showArr(arr);
		ex13_02_2Test.shift(arr);
		ex13_02_2Test.showArr(arr);
		ex13_02_2Test.shift(arr);
		ex13_02_2Test.showArr(arr);
	}
}

class Ex13_02_2Test{
	int[] temp=new int[3];
	
	public void showArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
	public void shift(int[][] arr) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				temp[i]=arr[2][i];
			}
		}
		
		for(int i=arr.length-1; i>=1; i--) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=arr[i-1][j];
			}
		}
		
			for(int i=0; i<3; i++) {
					arr[0][i]=temp[i];
			}
			
	}
	
}
