package prob02;

public class Sub implements Arithmetic {
	private int a;
	private int b;

	public Sub() {

	}

	public Sub(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate(int a, int b) {
		return a - b;
	}
}
