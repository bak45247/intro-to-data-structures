import java.util.Iterator;

public class IntLinkedBag implements Iterable<Integer>{
	
	private int manyItems;
	private IntNode head;
	
	public IntLinkedBag(){
		this.manyItems = 0;
		this.head = null;
	}

	
	public void add(int element){
		
		this.head = new IntNode (element, head);
		this.manyItems++;
	}
	
	public String toString(){
		
		String output = "[";
		
		IntNode cursor = this.head;

		while (cursor != null){
			output += cursor.getData() + ",";
			cursor = cursor.getLink();
		}

		output += "]";

		return output;
		
		
	}
	
	
	public int countOccurances(int target) {

		int count = 0;

		IntNode cursor = head;
		while (cursor != null){
			if (cursor.getData() == target)
				count++;
			cursor = cursor.getLink();
		}

		return count;
	}
	
	
	public boolean remove(int element) {

		boolean found = false;
		
		IntNode cursor = this.head;

		while (cursor != null){
			if (cursor.getData() == element) {
				cursor.setData(head.getData());
				this.head = this.head.getLink();
				this.manyItems--;
				found = true;
				break;
			}
			cursor = cursor.getLink();
		}

		return found;
	}
	
	/*
	public void addTail(int element){
		
		IntNode.addTail(this.head, element);
	}
	*/
	
	public void addTail(int val){
		
		IntNode cursor = this.head;
		
		while (cursor.getLink() != null)
			cursor = cursor.getLink();
		
		cursor.addNodeAfter(val);
		this.manyItems++;
	}
	
	public int size(){
		return this.manyItems;
	}
	
	public int grab(int index) {

		int output = -1;
		
		//System.out.println("ManyItems "+this.manyItems);
		
		if (index <= this.manyItems){
			//output = this.data[index];
			IntNode cursor = this.head;
			int pos = 1;
			while (pos < index){
				cursor = cursor.getLink();
				pos++;
			}
			output = cursor.getData();
			
		}

		return output;
	}


	@Override
	public Iterator<Integer> iterator() {
		
		return new IntLinkedBagIterator(this.head) ;
	}
	
	
}
