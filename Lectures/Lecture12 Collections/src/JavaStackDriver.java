import java.util.Stack;

public class JavaStackDriver {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.push(40);
		s.pop();
		s.pop();
		s.push(50);
		System.out.println(s);
	}

}
