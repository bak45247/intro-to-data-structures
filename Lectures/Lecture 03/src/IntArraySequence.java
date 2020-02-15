public class IntArraySequence {
	
	private int[] data;
	private int manyItems;
	private int current;
	
	public IntArraySequence(){
		this.data = new int[10];
		this.manyItems = 0;
		this.current = 0;
	}
	
	public IntArraySequence(int capacity){
		this.data = new int[capacity];
		this.manyItems = 0;
		this.current = 0;
	}
	
	public void addAfter(int element){
		
		if (this.manyItems == 0){
			this.data[current] = element;
			this.manyItems++;
		}else{
			for (int i=this.manyItems-1; i > this.current; i--)
				this.data[i+1] = this.data[i];
			this.current++;
			this.data[current] = element;
			this.manyItems++;
		}
	}
	
	public void addBefore(int element){
		
		if (this.manyItems == 0){
			this.data[current] = element;
			this.manyItems++;
		}else{
			for (int i=this.manyItems-1; i >= this.current; i--)
				this.data[i+1] = this.data[i];
				this.data[current] = element;
				this.manyItems++;
		}
	}
	
	public void removeCurrent(){
		
		for (int i=this.current+1; i < this.manyItems-1; i++)
			this.data[i-1] = this.data[i];
		
		this.manyItems--;
	}

	public int size() { return this.manyItems;}
	public void start() {	this.current = 0 ;}
	public void advance() { this.current += 1; }
	public int getCurrent() {return this.data[this.current];}
	
	@Override
	public String toString(){
		
		String output = "[";
		
		for (int i=0; i < this.manyItems; i++)
			output +=this.data[i]+",";
		
		output +="]";
		
		return output;
	}
	
	public void addAll(IntArraySequence otherSeq){
		
		int pos = this.manyItems;
		
		for (int i=0 ; i<otherSeq.manyItems; i++){
			this.data[pos] = otherSeq.data[i];
			pos++;
			this.manyItems++;
		}
		
	}
	
	
	public static IntArraySequence catenation(IntArraySequence  seq1, IntArraySequence  seq2){
		   IntArraySequence  seq3 = new IntArraySequence(seq1.manyItems + seq2.manyItems);
		   System.arraycopy(seq1, 0, seq3, 0, seq1.manyItems);
		   System.arraycopy(seq2, 0, seq3, seq1.manyItems, seq2.manyItems);
		   seq3.manyItems = (seq1.manyItems + seq2.manyItems);
		   return seq3;		
	  }
	
	//reverse: a method that returns another sequence that has the same
	//elements but in reverse order
	
	public IntArraySequence reverse(){
		
		IntArraySequence output = new IntArraySequence(this.data.length);
		
		for (int i = this.manyItems -1; i >= 0; i--)
			output.addAfter(this.data[i]);
		
		return output;
	}
	
	public int capacity(){ return this.data.length;}
	
	
}


