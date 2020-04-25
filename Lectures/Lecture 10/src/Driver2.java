
public class Driver2 {

	public static void main(String[] args) {
		
		
		IntBSTLinkedBag t1 = new IntBSTLinkedBag();
		
		t1.add(10);
		t1.add(5);
		t1.add(4);
		t1.add(13);
		t1.add(10);
		t1.add(4);
		t1.add(25);
		
		System.out.println(t1);
		
		System.out.println("Inorder ");
		t1.inorderTraversal();
		System.out.println("\nPreorder ");
		t1.preorderTraversal();
		System.out.println("\nPostorder ");
		t1.postorderTraversal();
		System.out.println();
		
		System.out.println(t1.countOccurrences(10));
			
	}

}
