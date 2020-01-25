
public class Driver2 {

	public static void main(String[] args) {

		Line l1 = new Line(10, 10, 20, 20);

		System.out.println(l1);

		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		Point p3 = new Point(30, 30);

		Line l2 = new Line(p1, p3);

		System.out.println(l2);

		// add code to draw a line between the
		// mid points of l1 and l2

	}

}
