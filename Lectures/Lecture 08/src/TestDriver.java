import java.util.Stack;

public class TestDriver {

	public static void main(String[] args) {
		int n = 4;
		Stack<Integer> s = new Stack<Integer>();

		while ( n > 0){
			s.push(n);
			n--;
		}
		int result = 1;
		int pos = 1;

		while (!s.isEmpty()){
			int num = s.pop();
			result = result + num * pos;
		    pos = pos + 1;
		    System.out.println(num+"\t"+result+"\t"+pos);
		}
		System.out.println("Result is "+result);



	}

}
