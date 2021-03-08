//Name: Fractions
//Date: 9/16/2020
//Description: Creates a fraction object
//Written By: Ari Steinfeld
public class Fraction {
	
	//instance fields
	private double numerator;
	private double denominator;
	
	
	//packed constructors
	public Fraction() {
		this(1.1,2.2);
		
	}
	
	public Fraction(double numerator, double denomenator) {
		this.denominator = denomenator;
		this.numerator = numerator;
	} 
	
	//getters
	public double getNumerator() {
		return this.numerator;
	}
	
	public double getDenominator() {
		return this.denominator;
	}
	
	
	
	//setters
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
}
