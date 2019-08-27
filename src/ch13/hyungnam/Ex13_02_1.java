package ch13.hyungnam;

public class Ex13_02_1 {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3,4,5},
				{10,20,30,40,50},
				{11,22,33,44,55},
		};
		addTwoDArr(arr,5);
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+"\t\t");
			}
			System.out.println("");
		}
	}
	public static void addOneDArr(int[] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=add;
		}
	}
	public static void addTwoDArr(int[][] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			addOneDArr(arr[i],add);
		}
	}
	
}
