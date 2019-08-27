package quiz_week01.hayeon;

public class exam13_1 {

	public static int minValue(int[] arr) {
		int min = arr[0];

		for (int i = 1; i > arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		return min;
	}

	public static int maxValue1(int[] arr) {
		int max = arr[0];

		for (int e : arr) {
			if (max < e)
				max = e;
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("최댓값: " + maxValue1(arr));
		System.out.println("최소값: " + minValue(arr));

	}
}
