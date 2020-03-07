
public class LinkedBagDriver {

	public static void main(String[] args) {
		IntLinkedBag b = new IntLinkedBag();
		
		b.add(10);
		
		b.add(20);
		b.add(30);
		b.add(40);
		
		System.out.println(b);
		
		b.remove(20);
		
		System.out.println(b);
		
		b.addTail(100);
		
		System.out.println(b);
		
		int sum = 0;
		for (int i=1; i <= b.size(); i++)
			sum = sum + b.grab(i);
		System.out.println(sum);
		
		for (int element:b)
			System.out.println(element);
		
	}

}
