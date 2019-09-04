package vending.sample.dj;

public class Option extends Product {

	public Option(int optionCount) {
		this.count = optionCount;
	}

	public void disOptionCount(int count) {
		this.count -= count;
	}
}

class Water extends Option {

	public Water(int optionCount) {
		super(optionCount);
	}

	@Override
	public String toString() {
		return "Water :\t" + "   잔여갯수:" + count + "\t";
	}
}

class Ice extends Option {
	public Ice(int optionCount) {
		super(optionCount);
	}

	@Override
	public String toString() {
		return "Ice :\t" + "   잔여갯수:" + count + "\t";
	}
}

class Pearl extends Option {
	public Pearl(int optionCount) {
		super(optionCount);
	}

	@Override
	public String toString() {
		return "Pearl :\t" + "   잔여갯수:" + count + "\t";
	}
}
