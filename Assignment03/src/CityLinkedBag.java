/**
 * TODO
 * countRange(City, City): int - count Nodes between given start and end (inclusive)
 * positionOf(City): int - find position of given city
 * lessThan(City): CityNode - return linked list of CityNodes less than given City (inclusive)
 * getMax(): City - return "largest" City based on compareTo
 */

 public class CityLinkedBag {

   /**
    * Instance Variables
    * CityNode head - the start of the linked list
    * int manyItems - the number of nodes in the list
    */
    private CityNode head;
    private int manyItems;

    public CityLinkedBag(){
       head = new CityNode(null, null);
       manyItems = 0;
    }

    
    /** 
     * @return int
     */
    public int size(){
       return manyItems;
    }

    public void display(){
       CityNode probe = head.getLink();
       for(int i = 0; i < manyItems; i++){
          System.out.println(probe);

          probe = probe.getLink();
       }
    }

    
    /** 
     * @param newCity
     */
    public void add(City newCity){
       CityNode probe = head;
       while(probe.getLink() != null){
          probe = probe.getLink();
       }

       probe.addNodeAfter(new CityNode(newCity, null));
    }

    
    /** 
     * @param index
     * @param newCity
     */
    public void add(int index, City newCity){
       if(index > manyItems + 1)
         return;
      
      CityNode probe = head;
      for(int i = 0; i < index; i++){
         probe = probe.getLink();
      }
      probe.addNodeAfter(new CityNode(newCity, null));
    }

    
    /** 
     * @param newCity
     */
    public void addLast(City newCity){
       CityNode probe = head;
       while(probe.getLink() != null)
         probe = probe.getLink();
      
      probe.addNodeAfter(new CityNode(newCity, null));
    }

    
    /** 
     * @param toRemove
     * @return boolean
     */
    public boolean remove(City toRemove){
       // TODO Look for city matching toRemove
       // remove that node
       // true if removed, false if the city doesn't exist
       return true;
    }

    
    /** 
     * @param toRemove
     * @return boolean
     */
    public boolean remove(int toRemove){
       if(toRemove > manyItems)
         return false;

      // TODO find index matching toRemove
      // remove that node
      return true;
    }

    public void removeLast(){
       // TODO loop to last node
       // remove
    }

    
    /** 
     * @param index
     * @return CityNode
     */
    public CityNode grab(int index){
       CityNode probe = head;
       
       for(int i = 0; i < index;i ++)
          probe = probe.getLink();

       return probe;
    }

    
    /** 
     * @param index
     * @param newData
     */
    public void set(int index, City newData){
       // this should be called update.
       CityNode probe = head;

       for(int i = 0; i < index; i++){
          probe = probe.getLink();
       }

       probe.setData(newData);
    }

    
    /** 
     * @return int
     */
    public int totalValue(){
       int total = 0;
       CityNode probe = head.getLink();

       while(probe != null){
          total += probe.getData().getPopulation();
          probe = probe.getLink();
       }

       return total;
    }


 }