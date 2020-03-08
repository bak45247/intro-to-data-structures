public class CityLinkedBagDriver{
    public static void main(String[] args){
        CityLinkedBag c = new CityLinkedBag();

        City d = new City("d", 1);
        City e = new City("e", 2);
        City f = new City("f", 3);
        City g = new City("g", 4);
        City h = new City("h", 5);
        City i = new City("i", 6);
        City j = new City("j", 7);

        c.add(d);
        c.add(e);
        c.add(f);
        c.add(2, g);
        c.add(2, h);
        c.add(i);
        c.add(j);

        c.display();
        System.out.println(c.size());

        c.remove(d);
        c.display();

        c.remove(3);
        c.display();

        c.removeLast();
        c.display();

        City k = new City("k", 8);
        City l = new City("l", 9);
        City m = new City("m", 5);
        City n = new City("n", 7);
        City o = new City("o", 2);
        City p = new City("p", 0);

        c.add(k);
        c.add(l);
        c.add(m);
        c.display();

        c.set(4, n);
        c.display();

        System.out.println(c.grab(2));
        System.out.println(c.grab(3));
        System.out.println(c.grab(1));

        System.out.println(c.totalValue());
        System.out.println(c.getMax());
        System.out.println(c.countRange(e, l));

        System.out.println("h: " + c.positionOf(h));

        CityNode less = c.lessThan(i);
        CityLinkedBag q = new CityLinkedBag();
        System.out.println("less than: ");

        while(less != null){
            q.add(less.getData());
            less = less.getLink();
        }

        q.display();
    }
}