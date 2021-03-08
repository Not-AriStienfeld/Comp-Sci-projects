//Project Name: Rectangle 
//Project Description: reates a rectangle that can be modified with setters and accessed with getters
//Date: Sep 29, 2020
//Written By: Ari Steinfeld
import java.util.Scanner;
public class RectangeWarmUpMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.println("please enter in a length");
		r.setLength(s.nextDouble());
		System.out.println("please enter in a width");
		r.setWidth(s.nextDouble());
		System.out.println("please enter in a height");
		double height = s.nextDouble();
		RightRectangularPrism rrp = new RightRectangularPrism(r, height);
		System.out.println("the volume of your right rectangular prism is " + rrp.getVolume());
		System.out.println("what do you want the new height to be?");
		rrp.setHeight(s.nextDouble());
		System.out.println("The area of the base is " + rrp.getBase().getArea());
		System.out.println("what do you want the new width of the base to be?");
		rrp.getBase().setWidth(s.nextDouble());
		System.out.println("The new width is " + rrp.getBase().getWidth() + "\n\n\n");
		
		System.out.println(rrp.toString() + "\n\n\n");
		
		
		
		//------------------------------------------------------------------------
		
		
		Rectangle one = new Rectangle();
		System.out.println("what would you like your Length to be?");
		one.setLength(s.nextDouble());
		System.out.println("what would you like your width to be?");
		one.setWidth(s.nextDouble());
		
		System.out.println(one.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
