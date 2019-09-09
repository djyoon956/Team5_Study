package ch21.dajeong.lib;

public class DDBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + "\n" + right;
	}
}
