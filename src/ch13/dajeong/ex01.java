package ch13.dajeong;

public class ex01 {
	public static void main(String[] args) {
		int[] testArray = { 6, 7, 8, 9, 10, 5, 4, 3, 2, 1 };
		System.out.println("minValue : " + minValue(testArray));
		System.out.println("maxValue : " + maxValue(testArray));
	}

	// for 사용
	public static int minValue(int[] arr) {
		int min = 0;
		if (arr != null && arr.length > 0) {
			min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				min = arr[i] < min ? arr[i] : min;
			}
		}

		return min;
	}

	// foreach 사용
	public static int maxValue(int[] arr) {
		int max = 0;
		if (arr != null && arr.length > 0) {
			max = arr[0];
			for (int n : arr) {
				max = n > max ? n : max;
			}
		}
		return max;
	}
}
