package ch21.dajeong.lib;

public class DBox<U, D> {
	private U left;
	private D right;

	public void set(U o, D r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
}

