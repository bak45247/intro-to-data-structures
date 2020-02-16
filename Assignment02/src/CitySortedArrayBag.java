import java.util.Iterator;

public class CitySortedArrayBag implements Iterable<City>{

    /**
     * instance variables: numCities - int - number of cities in the bag, cities - City[] - the list of cities in the bag
     */
    private int numCities;
    private City[] cities;

    public CitySortedArrayBag(int maxCities){
        numCities = 0;
        cities = new City[maxCities];
    }

    
    /** 
     * @param name
     * @param population
     */
    public void add(String name, int population){
        City toAdd = new City(name, population);
        City holder = new City(name, population);

        for(int i = 0; i < numCities; i++){
            holder = cities[i]; // holder is the city at this index
            if(toAdd.compareTo(cities[i]) < 0){
                cities[i] = toAdd; // the city becomes what toAdd was
                toAdd = holder; // toAdd becomes the holder is
            }
            // Otherwise nothing happens
        }
        cities[numCities] = toAdd; // always adding at the end of the array, this will be the smallest city in the array
        numCities += 1;
    }

    
    /** 
     * @return int
     */
    public int size(){
        return numCities;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        String toReturn = "City\tPopulation\n --------------------\n";

        for(int i = 0; i < numCities; i++){
            toReturn += cities[i].toString() + "\n";
        }

        return toReturn;
    }

    
    /** 
     * @param city
     * @return int
     */
    public int indexOf(City city){
        for(int i = 0; i < numCities; i++){
            if(city.equals(cities[i]))
                return i; // always returns the first occurence of the city
        }
        return -1; // if it gets here, we didnt find the city in our list
    }

    
    /** 
     * @param city
     */
    public void remove(City city){
        for(int i = 0; i < numCities; i++){
            if(city.equals(cities[i])){
                cities[i] = cities[i + 1];
                for(int j = i + 1; j < numCities; j++){
                    if(j != numCities - 1)
                        cities[j] = cities[j + 1];
                    else
                        cities[j] = null;
                }
                numCities -= 1;
            }
        }
    }

    
    /** 
     * @param name
     * @return int
     */
    public int countOccurences(String name){
        int total = 0;

        for(int i = 0; i < numCities; i++){
            if(name.equalsIgnoreCase(cities[i].getName()))
                total += 1;
        }
        return total; // return the total, if we don't find any, it will still be 0
    }

    
    /** 
     * @param index
     * @return City
     */
    public City grab(int index){
        return cities[index];
    }

    
    /** 
     * @param oldCity
     * @param newCity
     * @return boolean
     */
    public boolean replace(City oldCity, City newCity){
        for(int i = 0; i < numCities; i++){
            if(oldCity.equals(cities[i])){
                this.remove(cities[i]);
                this.add(newCity.getName(), newCity.getPopulation());
                return true; // this means we found the city, added and resorted
            }
        }
        return false; // this means we never found the city
    }

    
    /** 
     * @param other
     * @return boolean
     */
    public boolean sameContents(CitySortedArrayBag other){
        City[] contentCheck = new City[numCities];

        for(int i = 0; i < numCities; i++){
            contentCheck[i] = cities[i]; // setting this index to the 'i' index of the cities array
            for(int j = 0; j < other.numCities; j++){
                if(contentCheck[i].equals(other.grab(i))){
                    break; // if the index matches, leave the inside loop
                }else if(j == other.numCities - 1){
                    return false; // getting here means we got through the inside loop AND the index we're at doesnt match the index we're at in the outside loop
                }
            }
        }

        return true; // getting here means we matched the contents of both bags at all indices
    }

    
    /** 
     * @return Iterator<City>
     */
    @Override
    public Iterator<City> iterator(){
        return new CityArrayBagIterator();
    }

    public class CityArrayBagIterator implements Iterator<City>{

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            if(cursor < numCities)
                return true;
            return false;
        }

        @Override
        public City next() {
            City output = cities[cursor];
            cursor += 1;
            return output;
        }

    }
}