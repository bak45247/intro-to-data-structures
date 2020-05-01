import java.util.NoSuchElementException;

/**
* Invariant of the ArrayQueue class:
*1- The number of items in the queue is stored in the instance variable manyItems
*2- for a non-empty queue, the items are stored in a circular array beginning at data[front] 
*   and continuing through data[rear]
*3- for an empty queue, manyItems is zero and data is a reference to an array, 
*   but we do not care about front and rear
*/

public class IntArrayQueue implements IntQueueInterface {
	
	private int[] data;
	private int front;
	private int rear;
	private int manyItems;
	
	public IntArrayQueue(int cap){	
		this.front = 0;
		this.rear = 0;
		this.manyItems = 0;
		this.data = new int[cap];
	}
	
	public void printDataArray(){
		
		System.out.println("Printing the data array: ");
		System.out.println("Front is at "+this.front);
		System.out.println("Rear is at "+this.rear);
		for (int i=0; i < this.data.length; i++)
			System.out.println(this.data[i]);
	}
	
	
	public void add(int item) {
		
		if (this.manyItems == this.data.length){
			System.out.println("Queue is full");
			return;
		}
		if (this.manyItems == 0){
			this.front = 0;
			this.rear = 0;
		}else{
			rear = nextIndex(rear);
		}
		//System.out.println("inserting at "+rear);
		
		this.data[rear] = item;
		this.manyItems++;
		
	}
	/**This method is used to implement the circular array
	 * The method checks if there are empty slots in the array
	 * if rear index reaches length, then the following index will
	 * be the start of the array again
	 * @param i -- current index
	 * @return next index in a circualr array
	 */
	private int nextIndex(int i){
		
		int next = i + 1;
		
		if (next == data.length)
			next = 0;
		
		return next;
		
	}
	public int remove() {
		int answer;
		if (this.manyItems == 0){
			throw new NoSuchElementException();
		}
		answer = this.data[front];
		this.front = nextIndex(front);
		this.manyItems--;
		return answer;
	}
	
	
	
	public int size() {
		return this.manyItems;
	}
	
	
	
	public boolean isEmpty() {	
		return (this.manyItems == 0);
	}
	
	public String toString() {
    		String output = "[ ";
    		if (manyItems == 0)
    			return "[]";
    		if (front <= rear){
    			for (int i= front; i <= rear; i++)
    				output += this.data[i]+"\t";
    		}else{
    			for (int i=front; i < this.data.length; i++)
    				output += this.data[i]+"\t\t";
    			for (int i = 0; i <= rear; i++)
    				output += this.data[i]+"\t\t";
    		}
    	
    		output  += " ] \n";
    		return output;
    }
	
	
	
	
	
	

}
