package ch10.hayeon;

class exam10 {

	static int count = 0;

	static void add(int n) {
		count += n;
	}

	static void result() {

		System.out.println("Ãâ·Â:" + count);

	}

	
	
	
	
	
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
			exam10.add(i);
		exam10.result();
	}
}
