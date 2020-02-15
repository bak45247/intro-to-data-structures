import java.util.ArrayList;

public class MethodsDriver {

	public static void main(String[] args) {
		
		IntArrayBag l1 = new IntArrayBag();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);

		l1.max();
		//IntArrayBag.sumEven(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(10);
		l2.add(20);
		l2.add(30);	
		
		sumEven(l2);
	}
	
	public static int sumEven(ArrayList<Integer> l){
		
		int output = 0;
		
		for (Integer element: l)
			if (element % 2 == 0)
				output = output + element;
		
		return output;
		
	}
	
	public static int sumEven(IntArrayBag b) {

		int total = 0;

		for (int i = 0; i < b.size(); i++)
			if (b.grab(i) % 2 == 0)
				total += b.grab(i);

		return total;
	}

}
