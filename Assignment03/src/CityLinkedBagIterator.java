import java.util.Iterator;

/**
 * iterator class based on Lecture 7 code header: change CityLinkedBag to
 * implement Iterable<City>
 */

public class CityLinkedBagIterator implements Iterator<City> {

    private CityNode cursor;

    public CityLinkedBagIterator(CityNode head) {
        cursor = head;
    }

    @Override
    public boolean hasNext() {
        if (cursor != null)
            return true;
        return false;
    }

    @Override
    public City next() {
        City output = cursor.getData();
        cursor = cursor.getLink();
        return output;
    }
}