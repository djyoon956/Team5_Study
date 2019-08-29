package ch15.dajeong;

class Box {
	public void Wrap() {
		System.out.println("Simple Wrqpping");
	}
}

class PaperBox extends Box {
	@Override
	public void Wrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	@Override
	public void Wrap() {
		System.out.println("Gold Wrapping");
	}
}

public class ex01 {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	public static void wrapBox(Box box) {
		box.Wrap();
	}
}
