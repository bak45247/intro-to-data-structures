
/**
 * This class provides a node for a binary tree that hold integer elements.
 * Invariant of the CityBTNode class: 1. Each node has one integer, stored in the
 * instance variable data. 2. The instance variables left and right are
 * references to the node's left and right children.
 */

public class CityBTNode {

	private City data;
	private CityBTNode left;
	private CityBTNode right;

	/**
	 * Initialize CityBTNode with a specified initial data and links to children.
	 * Note that a child link may be the null reference, which indicates that the
	 * new node does not have that child.
	 * 
	 * @param initialData  -- the initial data of this new node
	 * @param initialLeft  -- a reference to the left child of this new node-
	 * @param initialRight -- a reference to the right child of this new node-
	 **/
	public CityBTNode(City initialData, CityBTNode initialLeft, CityBTNode initialRight) {
		this.data = initialData;
		this.left = initialLeft;
		this.right = initialRight;
	}
	
	/** 
	 * @return City
	 */
	// Getters and Setters

	public City getData() {
		return data;
	}

	
	/** 
	 * @param data
	 */
	public void setData(City data) {
		this.data = data;
	}

	
	/** 
	 * @return CityBTNode
	 */
	public CityBTNode getLeft() {
		return left;
	}

	
	/** 
	 * @param left
	 */
	public void setLeft(CityBTNode left) {
		this.left = left;
	}

	
	/** 
	 * @return CityBTNode
	 */
	public CityBTNode getRight() {
		return right;
	}

	
	/** 
	 * @param right
	 */
	public void setRight(CityBTNode right) {
		this.right = right;
	}

	/**
	 * Accessor method to get the data from the leftmost node of the tree below this
	 * node. This is the minimum value if the tree is a Binary Search Tree
	 * 
	 * @return -- the data from the deepest node that can be reached from this node
	 *         by following left links.
	 **/
	public City getLeftmostData() {
		if (left == null)
			return data;
		else
			return left.getLeftmostData();
	}

	/**
	 * Accessor method to get the data from the rightmost node of the tree below
	 * this node. This is the maximum value if the tree is a Binary Search Tree
	 * 
	 * @return -- the data from the deepest node that can be reached from this node
	 *         by following right links.
	 **/
	public City getRightmostData() {
		if (right == null)
			return data;
		else
			return right.getRightmostData();
	}

	/**
	 * Accessor method to determine whether a node is a leaf.
	 * 
	 * @return -- true (if this node is a leaf) or false otherwise.
	 **/
	public boolean isLeaf() {
		return (this.left == null) && (this.right == null);
	}

	/**
	 * Count the number of nodes in a binary tree.
	 * 
	 * @param root -- a reference to the root of a binary tree which may be null
	 *             when the tree is empty
	 * @return -- the number of nodes in the binary tree
	 **/
	public static int treeSize(CityBTNode root) {
		if (root == null)
			return 0;
		else
			return 1 + treeSize(root.left) + treeSize(root.right);
	}

	
	/** 
	 * @param root
	 * @return CityBTNode
	 */
	public static CityBTNode treeCopy(CityBTNode root) {
		
		if ( root == null)
			return null;
		else {
			CityBTNode leftCopy = treeCopy(root.left);
			CityBTNode rightCopy = treeCopy(root.right);
			return new CityBTNode(root.data,leftCopy,rightCopy);
		}
	}
	/////////// TREE TRAVESALS//////////////////

	/**
	 * Uses a preorder traversal to print the data from each node of the binary
	 * tree.
	 **/
	public void preorderPrint() {
		System.out.print(this.data + "\t");
		if (left != null)
			left.preorderPrint();
		if (right != null)
			right.preorderPrint();
	}

	/**
	 * Uses a postorder traversal to print the data from each node of the binary
	 * tree.
	 **/
	public void postorderPrint() {
		if (left != null)
			left.postorderPrint();
		if (right != null)
			right.postorderPrint();

		System.out.print(this.data + "\t");
	}

	

	/**
	 * * Uses a inorder traversal to print the data from each node of the binary
	 * tree.
	 */
	public void inorderPrint() {
		if (left != null)
			left.inorderPrint();
		System.out.print(data + "\t");
		if (right != null)
			right.inorderPrint();
	}

	/**
	 * removes the right most node of the tree with this node as its root
	 */

	public CityBTNode removeRightmost() {

		if (right == null)
			// the right most node is at the root becuase there is no right child
			return left;
		else {
			// a recursive call removes the rightmost node if my own right child
			right = right.removeRightmost();
			return this;
		}

	}
	
	
	/** 
	 * @return CityBTNode
	 */
	public CityBTNode removeLeftmost() {

		if (left == null)
			// the right most node is at the root becuase there is no right child
			return right;
		else {
			// a recursive call removes the rightmost node if my own right child
			left = left.removeLeftmost();
			return this;
		}

	}
	
	
	/** 
	 * @return int
	 */
	public int treeSum() {

		if (isLeaf())
			return this.getData().getPopulation();
		else
			return this.getData().getPopulation() + this.getLeft().treeSum() + this.getRight().treeSum();
	}
}
