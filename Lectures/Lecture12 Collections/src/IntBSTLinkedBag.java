
/** 
 * This class implements a Bag where element are organized in a BST
 * 
 * Invariant of the IntBSTreeBag:
 * 1. the elements in the bag are stored in a binary search tree
 * 2. the instance variable root is a reference to the root of the binary search
 * tree or null for an empty tree.
 * */

public class IntBSTLinkedBag {
	
	private IntBTNode root;
	
	/**
	 * constructor to create an empty bag
	 */
	
	public IntBSTLinkedBag(){ this.root = null;}
	
	public int size() { return IntBTNode.treeSize(this.root); }
	
	public void add(int element){
		
		//Create IntBTNode with data = element
		IntBTNode newNode = new IntBTNode(element,null,null);
		
		
		if (root == null) //if the tree is empty, the new node becomes the root
			root = newNode;
		else{
			
			//if the tree is not empty, start from the root and go down the tree 
			IntBTNode cursor = root;
			IntBTNode parentOfCursor = null;
			
			while (cursor != null){
				//need to keep track of parent of the new node
				parentOfCursor = cursor;
				if (element <= cursor.getData())
					cursor = cursor.getLeft();
				else
					cursor = cursor.getRight();
			}
			//at this point of time, the new element can be inserted as a child of parent
	
			if (element <= parentOfCursor.getData())
				parentOfCursor.setLeft(newNode);
			else
				parentOfCursor.setRight(newNode);
		}
		
		
	}
	/**
	 * Accessor method to count the number of occurrences of a particular element in this bag
	 * @param target -- value to count
	 * @return -- number of occurrences of target
	 */
	/*
	public int countOccurrences(int target){
		
		//start from the root, and go down the tree
		IntBTNode cursor = root;
		int count = 0;
		
		while (cursor != null){
			
			if (cursor.getData() == target)
				count++;
			else if (cursor.getData() > target)
				cursor = cursor.getLeft();
			else
				cursor = cursor.getRight();
		}
		
		return count;
	}
	*/
	/**
	 * The methos removes a specified element from a binary search tree
	 * The method returns true if it finds and removes one copy of the target
	 * otherwise, it returns false without changing the tree.
	 * @param target
	 * @return
	 */
	
	public boolean remove(int target){
		
		IntBTNode cursor  = root;
		IntBTNode parentOfCursor = null;
		boolean output = true;
		
		while ((cursor!=null) && (cursor.getData()!= target)){
			parentOfCursor = cursor;
			if ( target < cursor.getData() )
				cursor = cursor.getLeft();
			else
				cursor = cursor.getRight();
		}
		
		//Case 1: if cursor is null, target is not found
		if (cursor == null)
			return false;
		else if (cursor.getLeft() == null){
			//case 2: if cursor is root, change root
			if (cursor == root)
				root = cursor.getRight();
			else{
				//case 3: replace cursor with its right subtree
				if (cursor == parentOfCursor.getLeft())
					parentOfCursor.setLeft(cursor.getRight());
				else
					parentOfCursor.setRight(cursor.getRight());
			}
				
		}else{
			//case 4: replace the cursor with the rightmost element in the left subtree
			cursor.setData(cursor.getLeft().getRightmostData());
			cursor.setLeft(cursor.getLeft().removeRightMost());
			
		}
			
		
		return output;
		
	}
	
	
	
	public void inOrderTraversal(){
		root.inorderPrint();
	}
	
	public void postOrderTraversal(){
		root.postorderPrint();
	}
	
	public void preOrderTraversal(){
		root.preorderPrint();
	}
	
	public int countOccurrences(int value) {
		return countOccurrencesAux(this.root,value);
	}
	private int countOccurrencesAux(IntBTNode root, int value) {
    	if (root == null) {
    		return 0;
    	}
    	int tempCount = 0;
    	if (root.getData() == value) {
    		tempCount = 1;
    	}
    	return tempCount + countOccurrencesAux(root.getLeft(), value) +
    	countOccurrencesAux(root.getRight(), value);
    	}
	
}

