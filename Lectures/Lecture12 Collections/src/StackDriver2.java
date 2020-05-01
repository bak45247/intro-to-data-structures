import java.util.Stack;

public class StackDriver2 {

	public static void main(String[] args) {
		
			IntArrayStack s1 = new IntArrayStack(10);
			IntLinkedStack s2 = new IntLinkedStack();
			Stack<Integer> s3 = new Stack<Integer>();
			IntStackInterface s4 = new IntArrayStack(10);
			IntStackInterface s5 = new IntLinkedStack();
			
			
			
			s1.push(10);
			s1.push(20);
			
			
			
			s2.push(10);
			s2.push(20);
			
	
			
			s3.push(10);
			s3.push(20);
			
			
			
			System.out.println("s1 before method call "+s1);
			
			//System.out.println(s2);
			
			//System.out.println(s3);
			
			System.out.println("Sum of s1 " +sumStack(s1));
		
			System.out.println("s1 after method call "+s1);
			

	}

	public static int sumStack(IntStackInterface inputS){
		
		int sum = 0;
		
		Stack<Integer> tempStack = new Stack<Integer>();
	
		while (!inputS.isEmpty()) {
			int num = inputS.pop();
			tempStack.push(num);
			sum = sum + num;
		}
		
		while (!tempStack.isEmpty())
			inputS.push(tempStack.pop());
		
		return sum;
	}
}
