public class Circle implements Comparable<Circle>{

	private String color;
	private int radius;

	public Circle(String c, int r) {
		this.color = c;
		this.radius = r;
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public String toString() {
		String output = this.color + "\t" + this.radius;
		return output;
	}
	
	@Override
	public int compareTo(Circle otherCircle){
		
		int output = 0;
		
		if (this.color.equalsIgnoreCase(otherCircle.color)){
			
			if (this.radius > otherCircle.radius)
				output = 1;
		
			else 
				output = -1;
		
		}
		else if (this.radius > otherCircle.radius){
			output = 1;
		}
		else{
			output = -1;
		}
		
		return output;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}

}

