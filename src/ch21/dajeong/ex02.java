package ch21.dajeong;

import ch21.dajeong.lib.Box;

public class ex02 { // BoxSwapDemo

	private static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);

	}

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		box1.set(99);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
	}
}
