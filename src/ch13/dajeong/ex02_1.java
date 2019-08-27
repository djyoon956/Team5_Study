package ch13.dajeong;

public class ex02_1 {
	public static void main(String[] args) {
		int[][] tests = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		int add = 10;

		System.out.println("증가 전");
		printArrayInfo(tests);

		addTwoDArr(tests, add);

		System.out.println(add + " 증가 후");
		printArrayInfo(tests);
	}

	public static void addOneDArr(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += add;
		}
	}

	public static void addTwoDArr(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			addOneDArr(arr[i], add);
		}
	}

	private static void printArrayInfo(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int value : arr[i])
				System.out.print(value + " ");
			System.out.println();
		}
	}
}
