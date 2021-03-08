//Project Name: Rectangle
//Project Description: creates a rectangle that can be modified with setters and accessed with getters
//Date: Sep 29, 2020
//Written By: Ari Steinfeld
public class Rectangle {
	
	private double Length;
	private double width;
	
	
	//default constructor
	public Rectangle() {
		this(16,9);
	}
	
	//packed constructor
	public Rectangle(double Length, double width) {
		this.Length = Length;
		this.width = width;
	}
	
	
	//modifiers: getters
	public double getLength() {
		return Length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return Length * width;
	}
	
	public double getPerimeter() {
		return (2*Length) + (2*width);
	}
	
	
	//modifiers: setters
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double Length) {
		this.Length = Length;
	}
	
	//toString modifier
	public String toString() {
		return ("A rectangle with a Length of " + getLength() + " and a width of " + getWidth() + " has an area equal to " + getArea() + " and a perimeter equal to " + getPerimeter());
	}
	

}
