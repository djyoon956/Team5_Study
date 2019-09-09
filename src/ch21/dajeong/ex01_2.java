package ch21.dajeong;

import ch21.dajeong.lib.*;

public class ex01_2 {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DBox<DBox<String, Integer>, DBox<String, Integer>> dbox = new DBox<>();
		dbox.set(box1, box2);
		System.out.println(dbox);
	}
}
