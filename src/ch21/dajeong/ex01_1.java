package ch21.dajeong;

import ch21.dajeong.lib.*;

public class ex01_1 {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DDBox<DBox<String, Integer>, DBox<String, Integer>> dbox = new DDBox<>();
		dbox.set(box1, box2);
		System.out.println(dbox);
	}
}
