package vending.sample.hn;

public abstract class Option {
	int optionCount;
	
	public Option(int optionCount) {
		this.optionCount=optionCount;
	}
	
	abstract void disOptionCount(int dNum);
}

class Water extends Option {
	
	public Water(int optionCount) {
		super(optionCount);
	}
	@Override
	void disOptionCount(int dNum) {
		optionCount-=dNum;
	}

	@Override
	public String toString() {
		return "Water [toString()=" + super.toString() + "]";
	}
	
}

class Ice extends Option {
	
	public Ice(int optionCount) {
		super(optionCount);
	}
	
	@Override
	void disOptionCount(int dNum) {
		optionCount-=dNum;
	}
	
	@Override
	public String toString() {
		return "Water [toString()=" + super.toString() + "]";
	}
}

class Pearl extends Option {
	int pPrice=500;
	public Pearl(int optionCount) {
		super(optionCount);
	}
	
	@Override
	void disOptionCount(int dNum) {
		optionCount-=dNum;
	}
	
	@Override
	public String toString() {
		return "Water [toString()=" + super.toString() + "]";
	}
}
