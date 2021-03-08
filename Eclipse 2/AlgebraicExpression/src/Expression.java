//Class Name: Expression
//Class Description: takes 2 term objects and creates an expression using them
//Date: Oct 13, 2020
//Written By: Ari Steinfeld

public class Expression {

	private Term termOne = new Term();
	private Term termTwo = new Term();
	
	public Expression(){
		this(new Term(), new Term());
	}
	
	public Expression(Term termOne, Term termTwo) {
		this.termOne = termOne;
		this.termTwo = termTwo;
	}
	
	//getters
	public Term getTermOne() {
		return termOne;
	}
	
	public Term getTermTwo() {
		return termTwo;
	}
	
	//setters
	public void setTermOne(Term termOne) {
		this.termOne = termOne;
	}


	public void setTermTwo(Term termTwo) {
		this.termTwo = termTwo;
	}
	
	
	//special modifiers 
	
	
	//name: evaluate
	//description: solves the algebraic equation
	//inputs: int x, the value for what x should be in the equation
	//returns: the solved algebraic equation
	public String evaluate(int x) {
		return ("If x = " + x + ", " + getTermOne().toString() + " + " + getTermTwo().toString() + " = " + ((getTermOne().getCoefficient() * Math.pow(x, getTermOne().getExponent())) + (getTermTwo().getCoefficient() * Math.pow(x, getTermTwo().getExponent())))); //this is the longest single line that I have ever coded in java
	}
	
	
	//toString
	
	public String toString(){
		return ("Your expression is  " + getTermOne().toString() + "   +   " + getTermTwo().toString());
	}
	

}
