import java.util.Iterator;

///outer class IntArrayBagIterator

public class IntLinkedBagIterator implements Iterator<Integer>{
			
			private IntNode cursor;
			
			public IntLinkedBagIterator(IntNode head){
				this.cursor = head;
			}
			@Override
			public boolean hasNext(){
				if (cursor != null)
					return true;
				return false;
			}
			@Override
			public Integer next(){
				
				int output = cursor.getData();
				cursor = cursor.getLink();
				return output;
				
			}
}
