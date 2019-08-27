package ch13.dajeong;

public class ex02_2 {
	public static void main(String[] args) {
		int[][] tests = { { 1 }, { 2, 2 }, { 3, 3, 3 }, { 4, 4, 4, 4 } };

		System.out.println("Shift 전 >>");
		printArrayInfo(tests);

		shiftDownArray(tests);

		System.out.println("Shift 후 >>");
		printArrayInfo(tests);
	}

	public static void shiftDownArray(int[][] arr) {
		int[] last = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
	}

	private static void printArrayInfo(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int value : arr[i])
				System.out.print(value + " ");
			System.out.println();
		}
	}
}
