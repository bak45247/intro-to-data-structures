
public class Driver {
    public static void main(String[] args){

        CityBTLinkedBag test = new CityBTLinkedBag(new City("z", 12));

        City d = new City("d", 1);
        City e = new City("e", 2);
        City f = new City("f", 3);
        City g = new City("g", 4);
        City h = new City("h", 5);
        City i = new City("i", 6);
        City j = new City("j", 7);

        test.add(g);
        test.add(j);
        test.add(d);
        test.add(e);
        test.add(f);
        test.add(h);
        test.add(i);
        test.add(d);

        System.out.println(test.size());
        test.search("f");
        System.out.println(test.countOccurences(d));
        System.out.println(test.countRange(d, g));
        System.out.println(test.total());
        test.displayLowToHigh();

        test.remove(d);
        System.out.println(test.size());

    }


}