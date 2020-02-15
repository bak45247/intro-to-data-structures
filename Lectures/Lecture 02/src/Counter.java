
public class Counter {
	private String id;
	private int count;

	public Counter(String id) {
		this.id = id;
		this.count = 0;
	}

	public void increment() {
		this.count++;
	}

	public int tally() {
		return this.count;
	}

	public String toString() {
		return this.id + ": " + this.count;
	}

	public static boolean compareCounter2(Counter c1, Counter c2) {
		return true;
	}
}
