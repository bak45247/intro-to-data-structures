import java.util.ArrayList;
import java.util.HashSet;

public class CollectionClassesDriver {

	public static void main(String[] args) {
		
		ArrayList<Circle> list1 = new ArrayList<Circle>();
		
		list1.add(new Circle("red",10));
		list1.add(new Circle("blue",20));
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(5);
		list2.add(10);
		System.out.println(list2);
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(10);
		h1.add(5);
		h1.add(10);
		
		System.out.println(h1);
		
		HashSet<Circle> h2 = new HashSet<Circle>();
		
		Circle c1 = new Circle("red",10);
		Circle c2 = new Circle("red",20);
		
		System.out.println(c1.compareTo(c2));
		
		
		h2.add(new Circle("red",10));
		h2.add(new Circle("blue",20));
		h2.add(new Circle("red",30));
		
		System.out.println(h2);
		
		
		
		
		
		

	}

}
