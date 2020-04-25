
public class StackDriver {

	public static void main(String[] args) {
		
			IntArrayStack arrS = new IntArrayStack(10);
			IntLinkedStack linS = new IntLinkedStack();
			IntStackInterface s = new IntLinkedStack();
			
			
			arrS.push(10);
			arrS.push(20);
			arrS.push(30);
			arrS.push(40);
			
			System.out.println("Stack before method ");
			System.out.println(arrS);
			System.out.println(popAtIndex(arrS,4));
			System.out.println("Stack after method ");
			System.out.println(arrS);
			

	}
	
	public static int sumStack(IntArrayStack s){
		
		int output = 0;
		IntLinkedStack temp = new IntLinkedStack();
		
		while (!s.isEmpty()){
			int num = s.pop();
			temp.push(num);
			output = output + num;
		}
		
		while (!temp.isEmpty()){
			int num = temp.pop();
			s.push(num);
		}
			
		return output;
		
	}
	
	public static int popAtIndex(IntStackInterface s, int index){
		
		
		int output = 0;
		IntLinkedStack temp = new IntLinkedStack();
		
		if (index > s.size()) return -1;
		
		for (int i = 1 ; i < index; i++){
			int num = s.pop();
			temp.push(num);
		}
		
		s.pop(); // popping the element at index
		
		while (!temp.isEmpty())
			s.push(temp.pop());
		
		
		
		return output;
		
		
	}

}
