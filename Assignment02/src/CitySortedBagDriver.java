public class CitySortedBagDriver{
    public static void main(String[] args){
        City boston = new City("Boston", 500);
        City newYork = new City("New York", 750);
        City bostonTheSecond = new City("Boston", 234095);
        City philly = new City("Philadelphia", 432);
        City queens = new City("Queensborough", 7);

        if(boston.compareTo(bostonTheSecond) > 0)
            System.out.println(boston + " is larger \n\n");
        else
            System.out.println(bostonTheSecond + " Is larger\n\n");

        CitySortedArrayBag sortedCities = new CitySortedArrayBag(6);

        sortedCities.add(bostonTheSecond.getName(), bostonTheSecond.getPopulation());
        sortedCities.add(boston.getName(), boston.getPopulation());
        sortedCities.add(newYork.getName(), newYork.getPopulation());
        sortedCities.add(philly.getName(), philly.getPopulation());
        
        System.out.println(sortedCities);
        System.out.println(sortedCities.countOccurences("boston") + " is how many times boston is in the bag");

        sortedCities.remove(boston);

        System.out.println(sortedCities);

        System.out.println(sortedCities.indexOf(philly) + " is where Philadelphia is in the bag");
        System.out.println(sortedCities.size() + " the number of cities in the bag");

        if(sortedCities.replace(bostonTheSecond, queens))
            System.out.println("replace philadelphia with queens");
        else
            System.out.println("Couldnt find the city...");

        System.out.println(sortedCities.grab(2));
    }
}