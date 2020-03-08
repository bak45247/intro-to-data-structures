import java.util.Iterator;

public class CityLinkedBag implements Iterable<City> {

   /**
    * Instance Variables CityNode head - the start of the linked list int manyItems
    * - the number of nodes in the list
    */
   private CityNode head;
   private int manyItems;

   public CityLinkedBag() {
      head = new CityNode(null, null);
      manyItems = 0;
   }

   /**
    * @return int
    */
   public int size() {
      return manyItems;
   }

   public void display() {
      CityNode probe = head.getLink();
      for (int i = 0; i < manyItems; i++) {
         System.out.println(probe.getData());

         probe = probe.getLink();
      }
   }

   /**
    * @param newCity
    */
   public void add(City newCity) {
      CityNode probe = head;
      while (probe.getLink() != null) {
         probe = probe.getLink();
      }

      probe.addNodeAfter(new CityNode(newCity, null));
   }

   /**
    * @param index
    * @param newCity
    */
   public void add(int index, City newCity) {
      if (index > manyItems + 1)
         return;

      CityNode probe = head;
      for (int i = 0; i < index; i++) {
         probe = probe.getLink();
      }
      probe.addNodeAfter(new CityNode(newCity, null));
   }

   /**
    * @param newCity
    */
   public void addLast(City newCity) {
      CityNode probe = head;
      while (probe.getLink() != null)
         probe = probe.getLink();

      probe.addNodeAfter(new CityNode(newCity, null));
   }

   /**
    * @param toRemove
    * @return boolean
    */
   public boolean remove(City toRemove) {
      CityNode probe = head;

      while (probe.getLink() != null) {
         if (toRemove.equals(probe.getLink().getData())) {
            probe.removeAfter();
            return true;
         }

         probe = probe.getLink();
      }
      return false;
   }

   /**
    * @param toRemove
    * @return boolean
    */
   public boolean remove(int toRemove) {
      if (toRemove > manyItems)
         return false;

      CityNode probe = head;

      for (int i = 0; i < toRemove - 1; i++) {
         probe = probe.getLink();
      }

      probe.removeAfter();
      return true;
   }

   public void removeLast() {
      CityNode probe = head;

      while (probe.getLink().getLink() != null)
         probe = probe.getLink();

      probe.removeAfter();
   }

   /**
    * @param index
    * @return CityNode
    */
   public CityNode grab(int index) {
      CityNode probe = head;

      for (int i = 0; i < index; i++)
         probe = probe.getLink();

      return probe;
   }

   /**
    * @param index
    * @param newData
    */
   public void set(int index, City newData) {
      CityNode probe = head;

      for (int i = 0; i < index; i++) {
         probe = probe.getLink();
      }

      probe.setData(newData);
   }

   /**
    * @return int
    */
   public int totalValue() {
      int total = 0;
      CityNode probe = head.getLink();

      while (probe != null) {
         total += probe.getData().getPopulation();
         probe = probe.getLink();
      }

      return total;
   }

   /**
    * @param start
    * @param end
    * @return int
    */
   public int countRange(City start, City end) {
      CityNode probe = head.getLink();
      int count = 0;

      while (probe != null) {
         if (start.compareTo(probe.getData()) >= 0 && end.compareTo(probe.getData()) <= 0)
            count += 1;

         probe = probe.getLink();
      }

      return count;
   }

   /**
    * @param findCity
    * @return int
    */
   public int positionOf(City findCity) {
      CityNode probe = head.getLink();
      int position = 1;

      while (probe != null) {
         if (findCity.equals(probe.getData()))
            return position;

         probe = probe.getLink();
         position += 1;
      }

      return -1;
   }

   /**
    * @return City
    */
   public City getMax() {
      CityNode probe = head.getLink();
      City max = probe.getData();

      while (probe != null) {
         if (max.compareTo(probe.getData()) == -1)
            max = probe.getData();

         probe = probe.getLink();
      }

      return max;
   }

   /**
    * @param city
    * @return CityNode
    */
   public CityNode lessThan(City city) {
      CityNode probe = head.getLink();
      CityNode less = new CityNode(null, null);

      while (probe != null) {
         if (city.compareTo(probe.getData()) >= 0) {
            less.addNodeAfter(new CityNode(probe.getData(), null));
            less = less.getLink();
         }

         probe = probe.getLink();
      }

      return less;
   }

   /**
    * @return Iterator<City>
    */
   @Override
   public Iterator<City> iterator() {

      return new CityLinkedBagIterator(head);
   }
}