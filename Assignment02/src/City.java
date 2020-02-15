public class City implements Comparable<City> {
    /*
     * Instance Variables Name - String - Name of city, Population - int -
     * population of city
     */
    private String name;
    private int population;

    public City(String newName, int newPopulation) {
        setName(newName);
        setPopulation(newPopulation);
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * @param newName
     */
    public void setName(String newName) {
        name = newName;
    }

    
    /** 
     * @return int
     */
    public int getPopulation() {
        return population;
    }

    
    /** 
     * @param newPopulation
     */
    public void setPopulation(int newPopulation) {
        population = newPopulation;
    }

    
    /** 
     * @param compare
     * @return boolean
     */
    public boolean equals(City compare) {
        if (compare.name.equalsIgnoreCase(name) && compare.population == population)
            return true;
        return false;
    }

    
    /** 
     * @param compare
     * @return int
     */
    public int compareTo(City compare) {
        // if they're equal we can just return 0 here
        if (equals(compare))
            // If its here, compare returned 0
            if (population >= compare.population)
                return 1;
            else
                return -1;

        if (name.compareTo(compare.name) > 0)
            return 1;
        else
            return -1;

        
    }
}