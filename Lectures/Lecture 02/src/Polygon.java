public class Polygon {

	private int numVertices;
	private Point vertices[];

	public Polygon() {

		this.numVertices = 0;
		this.vertices = new Point[10];
	}

	public Polygon(int capacity) {
		this.numVertices = 0;
		this.vertices = new Point[capacity];

	}

	public int getNumVertices() {
		return this.numVertices;
	}

	public Point[] getVertices() {
		return this.vertices;
	}

	public Point getVertex(int pos) {

		return this.vertices[pos];

	}

	public void addVertex(Point p) {

		this.vertices[this.numVertices] = p;
		this.numVertices = this.numVertices + 1;
	}
	//
	// public Point getVertex(){

	// }

	public void draw() {

		String str = "";

		for (int i = 0; i < this.numVertices; i++)
			str += this.vertices[i] + "\n";

		System.out.println(str);
	}

	public String toString() {

		String output = "";

		for (int i = 0; i < this.numVertices; i++)
			output += this.vertices[i] + "\n";

		return output;
	}

	public double maxXCoordinate() {

		double max = -9999;

		if (this.vertices[0] != null) {
			max = this.vertices[0].getX();

			for (int i = 1; i < this.vertices.length; i++) {
				if (this.vertices[i] != null) {
					Point p = this.vertices[i];

					if (p.getX() > max)
						max = p.getX();
				}

			}
		}

		return max;
	}
}
