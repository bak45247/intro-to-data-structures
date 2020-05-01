
public class BSTTreeDriver {

	public static void main(String[] args) {
		
		
		IntBSTLinkedBag t1 = new IntBSTLinkedBag();
		
		t1.add(10);
		t1.add(5);
		t1.add(4);
		t1.add(13);
		t1.add(10);
		t1.add(4);
		t1.add(25);
		
		System.out.println("Inorder ");
		t1.inOrderTraversal();
		System.out.println("\nPreorder ");
		t1.preOrderTraversal();
		
		System.out.println("\nPostorder ");
		t1.postOrderTraversal();
		System.out.println();
		
		
		
		IntBSTLinkedBag t2 = new IntBSTLinkedBag();
		
		t2.add(1);
		t2.add(5);
		t2.add(20);
		t2.add(30);
		
		System.out.println("******************************");
		t1.inOrderTraversal();
		
		
		
		
		

	}

}

