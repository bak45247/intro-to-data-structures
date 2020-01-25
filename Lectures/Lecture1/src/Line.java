
public class Line {

	private Point start;
	private Point end;

	public Line(double startX, double startY, double endX, double endY) {

		this.start = new Point(startX, startY);
		this.end = new Point(endX, endY);

	}

	public Line(Point start, Point end) {

		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {

		String output = "";

		output += this.start;
		output += "\t" + this.end;

		return output;
	}

	public double length(){
		// double diff1 = (this.start.getX() - this.end.getX()) * (this.start.getX() - this.end.getX());
		// double diff2 = (this.start.getY() - this.end.getY()) * (this.start.getY() - this.end.getY());
		// double sum = diff1 + diff2;
		// return Math.sqrt(sum);

		return Point.distance(this.start, this.end);
	}

	public Point midPoint(){
		return Point.midPoint(this.start, this.end);
	}

}