
public class BagDriver {

	public static void main(String[] args) {
		
		
		IntBSTLinkedBag b = new IntBSTLinkedBag();
		
		b.inorderTraversal();
		
		b.add(10);
		b.add(20);
		b.add(5);
		b.add(3);
		b.add(10);
		b.add(10);
		
		//b.inorderTraversal();
		System.out.println(b);
		
		System.out.println();
		
		//System.out.println(b.countOccurrences(10));
		
		b.remove(3);
		
		System.out.println(b);
		
		

	}

}
