//Project Name: RightRectangularPrism
//Project Description: creates a right rectangular prism that can be accessed and modified via getters and setters.
//Date: Sep 29, 2020
//Written By: Ari Steinfeld
public class RightRectangularPrism {
	
	//instance fields
	private Rectangle base;
	private double height;
	
	//default constructor
	public RightRectangularPrism() {
		this(new Rectangle(), 1);
	}
	
	
	//packed constructor
	public RightRectangularPrism(Rectangle base, double height) {
		this.base = base;
		this.setHeight(height);
	}
	
	
	//modifiers: getters
	public Rectangle getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return base.getArea() * height;
	}
	
	
	public double getSurfaceArea(){
		return (base.getLength() * height * 2) + (base.getWidth() * base.getLength() * 2) + (base.getWidth() * height * 2);
	}


	
	//modifiers: setters
	public void setBase(Rectangle base) {
		this.base = base;
	}


	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	//modifiers: toString
	public String toString(){
		return ("The right rectangular prism has a length of " + base.getLength() + ", a width of "+ base.getWidth() + ", a height of " + height + ", a volume of " + getVolume() + ", and lastly, the surface area is " + getSurfaceArea());
	}
	
}
