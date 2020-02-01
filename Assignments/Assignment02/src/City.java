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

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int newPopulation) {
        population = newPopulation;
    }

    public boolean equals(City compare) {
        if (compare.name.equalsIgnoreCase(name) && compare.population == population)
            return true;
        return false;
    }

    public int compareTo(City compare) {
        // if they're equal we can just return 0 here
        if (equals(compare))
            return 0;

        if (name.compareTo(compare.name) > 0)
            return 1;
        else if (name.compareTo(compare.name) < 0)
            return -1;

        // If its here, compare returned 0
        if (population > compare.population)
            return 1;
        else
            return -1;
    }
}