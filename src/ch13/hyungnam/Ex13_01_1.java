package ch13.hyungnam;

public class Ex13_01_1 {

	public static void main(String[] args) {
		int[] arr= {1,13,45,61,16,42,31};
		System.out.println(Ex13_01_1.minValue(arr));
		System.out.println(Ex13_01_1.maxValue(arr));
		
	}
	
	public static int minValue(int []arr) {
		int min=10;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int []arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
