import java.util.Iterator;

public class OutsideIterator implements Iterator<Integer> {
		private int cursor = 0;
		private int[] data;

		public OutsideIterator(int[] data){
			this.data = data;
		}
		@Override
		public boolean hasNext() {
			boolean output = false;
			if (cursor < this.data.length)
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
