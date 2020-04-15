
public class Driver {
	
	public static void main(String[] args){
		
		IntBTNode n1 = new IntBTNode(10,null,null);
		IntBTNode n2 = new IntBTNode(5,null,null);
		IntBTNode n3 = new IntBTNode(3,n1,n2);
		IntBTNode n4 = new IntBTNode(7,null,null);
		IntBTNode n5 = new IntBTNode(8,n4,n3);
		IntBTNode n6 = new IntBTNode(1,null,null);
		IntBTNode root = new IntBTNode(4,n5,n6);
		
		
		System.out.println("Inorder: ");
		root.inorderPrint();
		System.out.println("\nPreorder: ");
		root.preorderPrint();
		System.out.println("\nPostorder: ");
		root.postorderPrint();
		System.out.println();
		
		IntBTNode copy = IntBTNode.treeCopy(root);
		
		System.out.println("\n Tree Copy inorder: ");
		copy.inorderPrint();
		
		
		System.out.println("Size "+IntBTNode.treeSize(root));
		System.out.println("Left most item: "+root.getLeftmostData());
		System.out.println("Right most item: "+root.getRightmostData());
		
		System.out.println(root.treeSum());
		
	}

}
