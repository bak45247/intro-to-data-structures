
import java.util.Iterator;

/**
 * @author Thanaa Ghanem
 * 
 *         Invariant of this bag implementation:
 * 
 *         1- The number of items contained in the bag is stored in an instance
 *         variable called manyItems 2- The bag entries are stored in an
 *         instance array variable called data, from position data[0] to
 *         position data[manyItems-1]
 *
 */
public class IntArrayBag implements Iterable<Integer> {

	private int[] data;
	private int manyItems;

	/**
	 * instianties a bag with a defualt size of 10
	 */
	public IntArrayBag() {
		this.data = new int[10];
		this.manyItems = 0;
	}

	/**
	 * instantiates a bag with a given capacity
	 * 
	 * @param capacity
	 *            -- required bag's capacity
	 */
	public IntArrayBag(int capacity) {
		this.data = new int[capacity];
		this.manyItems = 0;
	}

	/**
	 * @param element
	 *            -- value to be added to the bag
	 */
	public void add(int element) {
			data[manyItems] = element;
			manyItems++;
		
	}

	/**
	 * removes only one occurrence of element
	 * 
	 * @param element
	 *            -- value to be removed
	 * @return true or false based on whether an element is removed or not.
	 */
	public boolean remove(int element) {

		boolean found = false;

		for (int i = 0; i < manyItems; i++)
			if (data[i] == element) {
				data[i] = data[manyItems - 1];
				this.manyItems--;
				found = true;
				break;
			}

		return found;
	}

	/**
	 * 
	 * @return the number of elements in the bag.
	 */
	public int size() {
		return this.manyItems;
	}

	/**
	 * 
	 * @param index
	 *            --
	 * @return bag element that is located at index
	 */
	public int grab(int index) {

		int output = -1;
		if (index < this.manyItems)
			output = this.data[index];

		return output;
	}

	/**
	 * 
	 * @param target
	 *            -- value to count
	 * @return how many times target exist in the bag
	 */
	public int countOccurances(int target) {

		int count = 0;

		for (int i = 0; i < this.manyItems; i++)
			if (data[i] == target)
				count++;

		return count;
	}

	/**
	 * returns a string representation of the bag
	 */
	public String toString() {

		String output = "[";

		for (int i = 0; i < this.manyItems; i++)
			output += this.data[i] + ",";

		output += "]";

		return output;
	}

	/**
	 * 
	 * @return the maximum value on the bag
	 */
	public int max() {

		int max = this.data[0];

		for (int i = 0; i < this.size(); i++)
			if (this.data[i] > max)
				max = this.data[i];

		return max;
	}

	/**
	 * calculates and returns the sum of all even elements in the bag.
	 *
	 * @return -- sum of even elements
	 */
	public int sumEven() {

		int total = 0;

		for (int i = 0; i < this.size(); i++)
			if (this.data[i] % 2 == 0)
				total += this.data[i];

		return total;
	}

	/**
	 * changes each oldVal in the bag to newVal
	 * 
	 * @param oldVal
	 * @param newVal
	 * @return -- the number of values changed.
	 */

	public int change(int oldVal, int newVal) {

		int counter = 0;

		for (int i = 0; i < this.manyItems; i++) {
			if (this.data[i] == oldVal) {
				this.data[i] = newVal;
				counter++;
			}

		}

		return counter;
	}

	/**
	 * outputs a bag that contains all elements from the two input arrays --
	 * duplicates are not eliminated
	 * 
	 * @param bag1
	 * @param bag2
	 * @return
	 */
	public static IntArrayBag union(IntArrayBag bag1, IntArrayBag bag2) {

		IntArrayBag newBag = new IntArrayBag(bag1.size() + bag2.size());

		for (int i = 0; i < bag1.size(); i++)
			newBag.add(bag1.data[i]);

		for (int i = 0; i < bag2.size(); i++)
			newBag.add(bag2.data[i]);

		return newBag;

	}

	/**
	 * adds all elements from secondBag to the current bag
	 * 
	 * @param secondBag
	 */
	public void addAll(IntArrayBag secondBag) {

		for (int i = 0; i < secondBag.size(); i++)
			this.add(secondBag.data[i]);

	}

	public int getCapacity() {
		return this.data.length;
	}

	/**
	 * makes sure that the bag's capacity is at least equal to newCapacity and
	 * if not, a larger bag is created
	 * 
	 * @param newCapacity
	 */
	public void ensureCapacity(int newCapacity) {

		int[] biggerArray;

		if (data.length < newCapacity) {

			biggerArray = new int[newCapacity];
			for (int i = 0; i < data.length; i++)
				biggerArray[i] = data[i];

			this.data = biggerArray;
		}
	}

	/**
	 * add all the input parameters to the bag
	 * 
	 * @param elements
	 *            -- this can be one or more elements
	 */
	public void addAll(int... elements) {

		int numElements = elements.length;

		for (int i = 0; i < numElements; i++)
			this.add(elements[i]);
	}

	/**
	 * returns true if otherBag and the bag that activates the method have
	 * exactly the same number of every element. Otherwise the method return
	 * false. Note that the locations of the elements in the data arrays are not
	 * necessarily the same, it is only the number of occurrences of each
	 * element that must be the same
	 * 
	 * @param otherBag
	 *            -- the bag to check equality with
	 * @return -- true or false
	 */
	public boolean equalsTo(IntArrayBag otherBag) {

		boolean output = true;

		for (int i = 0; i < this.manyItems; i++) {

			int count1 = this.countOccurances(data[i]);
			int count2 = otherBag.countOccurances(data[i]);

			if (count1 != count2)
				output = false;
		}

		return output;
	}

	/**
	 * A static method the calculate and return the sum of all even values in
	 * the array
	 * 
	 * @param b
	 *            -- the bag
	 * @return -- sum of even values in b
	 */
	public static int sumEven(IntArrayBag b) {

		int total = 0;

		for (int i = 0; i < b.size(); i++)
			if (b.grab(i) % 2 == 0)
				total += b.grab(i);

		return total;
	}

	//////////////////////////////////////
	public class IntArrayBagIterator implements Iterator<Integer> {
		private int cursor = 0;

		@Override
		public boolean hasNext() {
			boolean output = false;
			if (cursor < manyItems)
				output = true;
			else
				output = false;
			return output;
		}

		@Override
		public Integer next() {
			Integer output = data[cursor];
			cursor++;
			return output;
		}
	}

	//////////////////////////////////////

	@Override
	public Iterator<Integer> iterator() {
		return new IntArrayBagIterator();
	}

/*
	@Override
	public Iterator<Integer> iterator() {
		return new OutsideIterator(this.data);
	}
*/
}
