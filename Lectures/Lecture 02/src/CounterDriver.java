public class CounterDriver {

	public static void main(String[] args) {
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");

		heads.increment();
		tails.increment();

		int num = (int) (Math.random() * 1000);

		if (num % 2 == 0)
			heads.increment();
		else
			tails.increment();

		System.out.println("number is " + num + "\t" + heads.tally() + "\t" + tails.tally());

		Counter.compareCounter2(heads, tails);

	}

	public static boolean compareCounter(Counter c1, Counter c2) {
		return true;
	}

}
