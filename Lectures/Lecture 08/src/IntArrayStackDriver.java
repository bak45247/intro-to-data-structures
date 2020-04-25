public class IntArrayStackDriver {

	public static void main(String[] args) {
		/*
			IntArrayStack s1 = new IntArrayStack(10);
			
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			
			System.out.println(s1);
			s1.popAtIndex(2);
			
			System.out.println(s1);
			System.out.println(s1.size());
			*/
			
			/*
			Stack<Integer> s2 = new Stack<Integer>();
			
			s2.push(10);
			s2.push(20);
			
			System.out.println(s2);
			*/
		
		IntLinkedStack s1 = new IntLinkedStack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		System.out.println(s1);
		//s1.popAtIndex(2);
		
		System.out.println(s1);
		System.out.println(s1.size());
		

	}

}
