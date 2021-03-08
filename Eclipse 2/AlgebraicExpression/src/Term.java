//Class Name: Term
//Written By: Ari Steinfeld
//Date: Oct 13, 2020
//Class Description: creates the term objects that can be used by the expression class. 


public class Term {
	
	//instance fields 
	private long coefficient; 
	private int exponent;
	
	public Term() {
		this(1,1);
	}
	
	public Term(long coefficient, int exponent) {
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	
	//getters
	
	public long getCoefficient() {
		return coefficient;
	}

	public int getExponent() {
		return exponent;
	}
	
	//setters
	
	public void setCoefficient(long coefficient) {
		this.coefficient = coefficient;
	}


	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
	//toString
	
	public String toString() {
		return ( this.coefficient + "x^" + this.exponent);
	}

}
