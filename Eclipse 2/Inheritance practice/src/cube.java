public class cube {
	//instance fields
	private double length;

	//constructors
	public cube(double length) {
		this.setLength(length);
	}
	public cube() {
		this(1);
	}
	
	//setters

	public void setLength(double length) {
		this.length = length;
	}
	
	//getters
	public double getLength() {
		return length;
	}

	public double getVolume() {
		return Math.pow(length, 3);
	}
	
	public double getSurfaceArea() {
		return 6 * length * length;
	}
	
	
	
}
