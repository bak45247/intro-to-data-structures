
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

}
