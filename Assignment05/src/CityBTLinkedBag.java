/**
 * Methods to do still
 */

public class CityBTLinkedBag {

    private CityBTNode root;
    
    public CityBTLinkedBag(City rootCity){
        root = new CityBTNode(rootCity, null, null);
    }

    
    /** 
     * @return CityBTNode
     */
    public CityBTNode getRoot(){
        return root;
    }

    
    /** 
     * @param cityData
     */
    public void setRoot(City cityData){
        root.setData(cityData);
    }

    
    public void add(City element){
		
		//Create IntBTNode with data = element
		CityBTNode newNode = new CityBTNode(element,null,null);
		
		
		if (root == null) //if the tree is empty, the new node becomes the root
			root = newNode;
		else{
			
			//if the tree is not empty, start from the root and go down the tree 
			CityBTNode cursor = root;
			CityBTNode parentOfCursor = null;
			
			while (cursor != null){
				//need to keep track of parent of the new node
				parentOfCursor = cursor;
				if (cursor.getData().compareTo(element) < 0)
					cursor = cursor.getLeft();
				else
					cursor = cursor.getRight();
			}
			//at this point of time, the new element can be inserted as a child of parent
	
			if (parentOfCursor.getData().compareTo(element) < 0)
				parentOfCursor.setLeft(newNode);
			else
				parentOfCursor.setRight(newNode);
		}
		
		
	}

    
    /** 
     * @return int
     */
    public int size(){
        return CityBTNode.treeSize(root);
    }
    
    /** 
     * @param find
     */
    public void search(String key){
        searchAux(root, key);
    }

    
    /** 
     * @param root
     * @param key
     */
    private void searchAux(CityBTNode root, String key) {
        if(root.isLeaf())
            return;
        
        if(root.getData().getName().equalsIgnoreCase(key))
            System.out.println(root.getData());
        
        if(root.getLeft() != null)
            searchAux(root.getLeft(), key);
        if(root.getRight() != null)
            searchAux(root.getRight(), key);
	}

    
    /** 
     * @param count
     * @return int
     */
    public int countOccurences(City value){
        return countOccurancesAux(root, value);
    }

    
    /** 
     * @param root
     * @param value
     * @return int
     */
    private int countOccurancesAux(CityBTNode root, City value){
        if(root == null)
            return 0;
        
        int count = 0;
        if(root.getData().equals(value))
            count += 1;
        
        return count + countOccurancesAux(root.getLeft(), value) + countOccurancesAux(root.getRight(), value);
    }

    
    /** 
     * @param find
     * @return boolean
     */
    public boolean contains(String key){
        return containsAux(root, key);
    }

    
    /** 
     * @param root
     * @param key
     * @return boolean
     */
    private boolean containsAux(CityBTNode root, String key) {
        // base cases: leaf, search key found
        if(root.isLeaf() && !root.getData().getName().equalsIgnoreCase(key))
            return false;
        else if(root.getData().getName().equalsIgnoreCase(key))
            return true;
        
        containsAux(root.getLeft(), key); 
        containsAux(root.getRight(), key);

        return false;
	}

    
    /** 
     * @param low
     * @param High
     * @return int
     */
    public int countRange(City low, City High){
        return countRangeAux(root, low, High);
    }

    
    /** 
     * @param root
     * @param high
     * @param low
     * @return int
     */
    private int countRangeAux(CityBTNode root, City high, City low){
        if(root == null)
            return 0;
        
        int count = 0;
        if(root.getData().compareTo(high) <= 0 && root.getData().compareTo(low) >= 0)
            count += 1;
        
        return count + countRangeAux(root.getLeft(), high, low) + countRangeAux(root.getRight(), high, low);
    }

    
    /** 
     * @return int
     */
    public int total(){
        return totalAux(root);
    }

    private int totalAux(CityBTNode root) {
        if(root == null)
            return 0;
        
        return root.getData().getPopulation() + totalAux(root.getLeft()) + totalAux(root.getRight());
	}

    
    
    /** 
     * @param City
     * @return boolean
     */
    public boolean remove(City target){ // This is the code we did in class, adapted to be for my CityBTNode datatype
		
		CityBTNode cursor = root;
		CityBTNode parentOfCursor = null;
		boolean output = true;
		
		while ((cursor!=null) && (!cursor.getData().equals(target))){
			parentOfCursor = cursor;
			if (cursor.getData().compareTo(target) < 0)
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
			cursor.setLeft(cursor.getLeft().removeRightmost());
			
		}
			
		
		return output;
		
	}

    public void displayLowToHigh(){
        root.inorderPrint();
    }

    
    /** 
     * @param toAdd
     */
    public void addAll(CityBTLinkedBag toAdd){
        CityBTNode.treeCopy(toAdd.getRoot());
    }
}