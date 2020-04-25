/**
 * Methods to do still
 * search, contains, countRange, remove
 */

public class CityBTLinkedBag {

    private CityBTNode root;
    
    public CityBTLinkedBag(City rootCity){
        setRoot(rootCity);
        root.setLeft(null);
        root.setRight(null);
    }

    public CityBTNode getRoot(){
        return root;
    }

    public void setRoot(City cityData){
        root.setData(cityData);
    }

    
    /** 
     * @param newCity
     */
    public void add(City toAdd){
        // todo: add an element to the tree
        CityBTNode addBelow = addAux(root, toAdd);
        if(addBelow.getData().compareTo(toAdd) >= 0)
            addBelow.setRight(new CityBTNode(toAdd, null, null));
        else
            addBelow.setLeft(new CityBTNode(toAdd, null, null));
    }

    private CityBTNode addAux(CityBTNode node, City toAdd){
        if(node.isLeaf())
            return node;

        if(node.getData().compareTo(toAdd) <= 0)
            return addAux(node.getRight(), toAdd);
        else
            return addAux(node.getLeft(), toAdd);
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
        // todo: print all the things including the search key
    }

    
    /** 
     * @param count
     * @return int
     */
    public int countOccurences(City value){
        return countOccurancesAux(root, value);
    }

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
        // todo: search for the provided search key
        // true if found, false if not
        return false;
    }

    
    /** 
     * @param low
     * @param High
     * @return int
     */
    public int countRange(City low, City High){
        // todo: return the number of items between low and high (inclusive)
        return -1;
    }

    
    /** 
     * @return int
     */
    public int total(){
        return root.treeSum();
    }

    
    /** 
     * @param target
     * @return boolean
     */
    public boolean remove(City toRemove){
        //todo: remove exactly 1 instance of the provided search term from the tree
        // true if removed false if not
        return false;
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