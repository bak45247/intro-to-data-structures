import java.util.ArrayList;

public class IteratorDriver2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);	
		
		int sum = 0;
		for (Integer i: l1)
			sum = sum + i;
		
		ArrayList<String> l2 = new ArrayList<String>();
		
		l2.add("hello");
		l2.add("world");
		l2.add("hi");
		
		String concatAll = "";
		for (String s: l2)
			concatAll = concatAll+s;
		
		System.out.println(concatAll);
		
		ArrayList<Circle> l3 = new ArrayList<Circle>();
		
		l3.add(new Circle("Blue",10));
		l3.add(new Circle("red",20));
		l3.add(new Circle("green",30));
		
		double max = 0;
		for (Circle c: l3){
			if (c.getArea() > max)
				max = c.getArea();
		}
		
		System.out.println(max);

	}

}
