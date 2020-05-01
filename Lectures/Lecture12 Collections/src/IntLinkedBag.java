import java.util.Iterator;

public class IntLinkedBag implements Iterable<Integer>{
	
	private IntNode head;
	private int manyNodes;
	
	public IntLinkedBag(){
		this.head= null;
		this.manyNodes = 0;
	}
	
	public void add(int element){
		this.head = new IntNode(element,head);
		manyNodes++;
	}
	
	public int countOccurances(int element){
		int count = 0;
		IntNode cursor = head;
		while (cursor != null){
			if (cursor.getData() == element)
				count++;
			cursor = cursor.getLink();
		}
		return count;
	}

	
	@Override
	public String toString(){
		
		String output = "[ ";
		
		IntNode cursor = head;
		
		while (cursor != null){
			output += cursor.getData()+" ,";
			cursor = cursor.getLink();
		}
		
		output +=" ]";
				
		return output;
	}
	
	public int grab(int index){
		
		int pos = 0;
		IntNode cursor = this.head;
		
		while (cursor != null){
			pos++;
			if (pos == index)
				return cursor.getData();
			cursor = cursor.getLink();
		}
		
		System.out.println("Error! No such index");
		return -1;
	}
	
	public boolean remove(int target){
		
		IntNode cursor = this.head;
		
		while (cursor != null){
			if (cursor.getData()==target){
				int headData = this.head.getData();
				cursor.setData(headData);
				manyNodes--;
				this.head = this.head.getLink();
				return true;
			}
			cursor = cursor.getLink();
		}
		return false;
		
	}
	public int size() { return this.manyNodes;}
	

	@Override
	public Iterator<Integer> iterator() {
		
		return new IntLinkedIterator(this.head);
		//return new InnerLinkedIterator();
	}
	
	public int countRange(int start, int end){
		
		int count = 0;
		
		IntNode cursor = head;
		
		while (cursor != null){
			
			int data = cursor.getData();
			
			if (data >= start && data <= end)
				count++;
			
			cursor = cursor.getLink();
		}
		
		return count;
	}
	/*
	public class IntLinkedIterator implements Iterator<Integer>{
		
		private IntNode current = head;
		
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
*/
}
	



