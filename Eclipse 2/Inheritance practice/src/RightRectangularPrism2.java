public class RightRectangularPrism2 extends cube {
	// 1. add two instance fields
	private double height;
	public double width;
	
	public RightRectangularPrism2() {
		this(1,1,1);
	}
	public RightRectangularPrism2(double length, double height, double width) {
		super(length);
		this.height = height;
		this.width = width;
		
	}
	
	//getters
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	
	//setters
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getVolume(){
		return getLength() * width * height;
	}
	public double getSurfaceArea() {
		return (width * height * 2) + (getLength() * height * 2) + (width * getLength() * 2);
	}
	
}
