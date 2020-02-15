
public class PolygonDriver {

	public static void main(String[] args) {

		Polygon poly1 = new Polygon();
		Polygon poly2 = new Polygon(20);

		poly1.addVertex(new Point(10, 10));

		Point p = new Point(20, 20);
		poly1.addVertex(p);
		poly1.addVertex(new Point(30, 30));

		System.out.println(poly1);

		Point[] poly1Vertices = poly1.getVertices();

		// for (int i = 0; i < poly1Vertices.length; i++) {
		Point start = poly1Vertices[0];
		Point end = poly1Vertices[1];
		Line line1 = new Line(start, end);
		System.out.println("line 1 " + line1);

		Point p1 = poly1.getVertex(1);
		Point p2 = poly1.getVertex(2);
		Line line2 = new Line(p1, p2);
		System.out.println("line 2 " + line2);

		System.out.println(poly1.maxXCoordinate());

		if (poly2.getNumVertices() > 0)
			System.out.println(poly2.maxXCoordinate());

		// }

		System.out.println(poly1.getVertices());

		System.out.println("Testing Draw ");
		poly1.draw();
	}

}
