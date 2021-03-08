
public class triangle {
	private double base;
	private double height;
	
	public triangle() {
		this(1,1);
	}
	public triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//getters
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return (base * height)/2.0;
	}
	
	//setters
	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	//tostring
	public String toString() {
		return ("A triangle with a base of " + base + " and a height of " + height + " has an area of " + getArea() + ".");
	}
	

}
