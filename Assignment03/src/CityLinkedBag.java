/**
 * head: CityNode
 * manyItems: int - Why the fuck is this not just size
 * size(): int - how many items
 * display(): void - prints the list
 * add(City): void - add a City
 * add(int, City): void @overload - add a City at a certain index
 * addLast(City): void - add a City to the end
 * remove(City): boolean - remove a city (true if worked)
 * remove(int): boolean @overload - remove CityNode at specified index (true if worked)
 * removeLast(): void - remove last Node
 * countRange(City, City): int - count Nodes between given start and end (inclusive)
 * grab(int): City - grab City at specifiec index
 * positionOf(City): int - find position of given city
 * set(int, City): void - would be better called "update"
 * totalValue(): int - add all the int data of the Cities
 * lessThan(City): CityNode - return linked list of CityNodes less than given City (inclusive)
 * getMax(): City - return "largest" City based on compareTo
 */

 public class CityLinkedBag {

    private CityNode head;
    private int manyItems;
 }