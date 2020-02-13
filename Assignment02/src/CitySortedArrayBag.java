import java.util.Iterator;

public class CitySortedArrayBag {

    private int numCities;
    private City[] cities;

    public CitySortedArrayBag(int maxCities){
        numCities = 0;
        cities = new City[maxCities];
    }

    public void add(String name, String population){
        //TODO: add to cities based on sorted order
    }

    public int size(){
        return numCities;
    }

    public String toString(){
        String toReturn = "City\tPopulation\n --------------------\n";

        for(int i = 0; i < numCities; i++){
            toReturn += cities[i].getName() + "\t" + cities[i].getPopulation() + "\n";
        }

        return toReturn;
    }

    public int indexOf(City city){
        //TODO: Find the index (if exists) of the item matching search
        return 0;
    }

    public void remove(City city){
        //TODO: remove "city" from "cities" and shuffle down if necessary
    }

    public int countOccurences(String name){
        //TODO: search cities for matching "name" return number of matching instances
        return 0;
    }

    public City grab(int index) throws Exception{
        if(index <= numCities)
            return cities[index];
        else
            throw new Exception("This city does not exist");
    }

    public boolean replace(City oldCity, City newCity){
        //TODO: replace oldcity with new city if old city exists
        // return true is replace happened
        return true;
    }

    public boolean sameContents(CitySortedArrayBag other){
        //TODO: search the two, if they contain the same stuff, return true
        // This should return true - [1, 1, 2, 2, 3] and [1, 2, 3]
        return true;
    }

    public class CityArrayBagIterator implements Iterator<City>{

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public City next() {
            // TODO Auto-generated method stub
            return null;
        }

    }
}