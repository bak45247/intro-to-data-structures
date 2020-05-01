/**This class provides a node for a binary tree that hold integer elements. 
 * Invariant of the IntBTNode class:
 * 1. Each node has one integer, stored in the instance variable data.
 * 2. The instance variables left and right are references to the node's left and right children.
 */

public class IntBTNode {
	
			
		   private int data;
		   private IntBTNode left;
		   private IntBTNode right;

		   
		   /**
		    * Initialize IntBTNode with a specified initial data and links to children.
		    * Note that a child link may be the null reference, which indicates that the new node does not have that child.
		    * @param initialData -- the initial data of this new node
		    * @param initialLeft -- a reference to the left child of this new node-
		    * @param initialRight -- a reference to the right child of this new node-
		    **/   
		    public IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight)
		    {
		       this.data = initialData;
		       this.left = initialLeft;
		       this.right = initialRight;
		    }

		    //Getters and Setters
		    
		    public int getData() {	return data; }
		    public void setData(int data) {	this.data = data;	}
		    public IntBTNode getLeft() {	return left;	}
		    public void setLeft(IntBTNode left) {	this.left = left;	 }
		    public IntBTNode getRight() {	return right;	}
		    public void setRight(IntBTNode right) {	this.right = right;	}   
		    
		    
		    
		    
		    
		    /**
		     * Accessor method to get the data from the leftmost node of the tree below this node.
		     * This is the minimum value if the tree is a Binary Search Tree
		     * @return -- the data from the deepest node that can be reached from this node by following left links.
		     **/
		     public int getLeftmostData( ) {
		        if (left == null)
		           return data;
		        else
		           return left.getLeftmostData( );
		     }
		        
		     
		     /**
		     * Accessor method to get the data from the rightmost node of the tree below this node.
		     * This is the maximum value if the tree is a Binary Search Tree
		     * @return -- the data from the deepest node that can be reached from this node by
		     *   following right links.
		     **/
		     public int getRightmostData( ){
		        if (right == null)
		           return data;
		        else
		           return right.getRightmostData( );
		     }
		     
		     /**
		      * Accessor method to determine whether a node is a leaf. 
		      * @return -- true (if this node is a leaf) or false otherwise.
		      **/
		      public boolean isLeaf( ){
		         return (left == null) && (right == null);                                               
		      } 
		     
		      
		      /**
		       * Count the number of nodes in a binary tree.
		       * @param root -- a reference to the root of a binary tree which may be null when the tree is empty
		       * @return -- the number of nodes in the binary tree
		       **/ 
		       public static int treeSize(IntBTNode root){
		          if (root == null)
		             return 0;
		          else
		             return 1 + treeSize(root.left) + treeSize(root.right);
		       }   
		      
		      ///////////TREE TRAVESALS//////////////////
		       
		       
		       /**
		        * Uses a preorder traversal to print the data from each node of the binary tree.
		        **/
		        public void preorderPrint( ){
		           System.out.print(data+"\t");
		           if (left != null)
		              left.preorderPrint( );
		           if (right != null)
		              right.preorderPrint( );
		        } 
		        
		           
		        /**
		        * Uses a postorder traversal to print the data from each node of the binary tree.
		        **/
		        public void postorderPrint( ){
		           if (left != null)
		              left.postorderPrint( );
		           if (right != null)
		              right.postorderPrint( );
		           System.out.print(data+"\t");
		        }  
		        
		        
		        /**
		         * * Uses a inorder traversal to print the data from each node of the binary tree.
		         */
		        public void inorderPrint( ){
		        	if (left != null)
		        		left.inorderPrint( );
		        	System.out.print(data+"\t");
		        	if (right != null)
		        		right.inorderPrint( );
		        }  
		        
		        /**
		         * 
		         */
		        
		        public IntBTNode removeRightMost(){
		        	
		        	if (right == null)
		        		//the right most node is at the root becuase there is no right child
		        		return left;
		        	else {
		        		//a recursive call removes the rightmost node if my own right child
		        		right = right.removeRightMost();
		        		return this;
		        	}
		        	
		        }
}
