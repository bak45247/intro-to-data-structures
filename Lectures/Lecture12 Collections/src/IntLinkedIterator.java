import java.util.Iterator;

public class IntLinkedIterator implements Iterator<Integer>{
		
		private IntNode current;
		
		public IntLinkedIterator(IntNode head){
			this.current = head;
		}

		@Override
		public boolean hasNext() {
			if (this.current == null)
				return false;
	
			return true;
		}

		@Override
		public Integer next() {
	
			int data = this.current.getData();
	
			this.current = this.current.getLink();
	
			return data;
		}

}

