
public class StackDriver {
	
	public static void main(String[] args){
		IntStackInterface arrStack = new IntArrayStack(10);
		IntStackInterface linkedStack = new IntLinkedStack();
		
		int num = 0;
		arrStack.push(0);
		arrStack.push(1);
		arrStack.push(2);
		arrStack.push(3);
		
		num = arrStack.pop();
		
		linkedStack.push(num);
		
		num = arrStack.pop();
		linkedStack.push(num);
		
		arrStack.push(5);
		arrStack.push(6);
		
		System.out.println(arrStack);
		System.out.println(linkedStack);
		
		System.out.println(" Sum array stack:" + sumStack(arrStack));
		//make sure the input stack is not changes
		System.out.println(arrStack);
		
		System.out.println(popAtIndex(arrStack,2));
		System.out.println(arrStack);
		
		
		IntArrayStack[] testReturnTwo = returnTwo();
		
		System.out.println(testReturnTwo[0]);
		System.out.println(testReturnTwo[1]);

	}
	
	/*
	 * Implement a static method, called sumStack, 
	 * that takes a stack as input and returns as output the sum 
	 * of all elements in the stack. 
	 * The input stack must remain unchanged.
	 */
	public static int sumStack (IntStackInterface inputStack){
		
		int result = 0;
		IntArrayStack tempStack = new IntArrayStack(inputStack.size());
		
		while (!inputStack.isEmpty()){
			int num = inputStack.pop();
			result += num;
			tempStack.push(num);
		}
		
		while (!tempStack.isEmpty())
			inputStack.push(tempStack.pop());
		
		return result;
	}

	/*
	 * Implement a method that takes two input parameters, 
	 * a stack and an index. The method pops and returns the value 
	 * at the given index from the stack. 
	 * Assume the top of the stack is considered as index 1. 
	 * Your method must not change the remaining values in the stack. 
	 */
	

	public static int popAtIndex(IntStackInterface s, int index){
	
		int answer = -1;
		
		// if index is not in the stack, return -1
		if (index > s.size())
			return answer;
		
		//create a temporary stack to hold elements
		IntStackInterface tempStack = new IntArrayStack(10);
		
		//pop (index-1) items from input stack and store them in the temporary stack
		for (int i = 1; i < index; i++){
			int tempInt = s.pop();
			tempStack.push(tempInt);
		}
		
		//pop the element at index
		answer = s.pop();
		
		//re-build original stack
		for (int i = 1; i < index ; i++){
				int tempInt = tempStack.pop();
				s.push(tempInt);
		}
		
		return answer;
	}

	//A method that returns two stacks as output
	public static IntArrayStack[] returnTwo(){
		
		
		IntArrayStack output1 = new IntArrayStack(10);
		IntArrayStack output2 = new IntArrayStack(10);
		
		output1.push(10);
		output1.push(20);
		
		output2.push(30);
		output2.push(40);
		
		IntArrayStack[] output = new IntArrayStack[2];
		output[0] = output1;
		output[1] = output2;
		
		return output;
		
	}
}
