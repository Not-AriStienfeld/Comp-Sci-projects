//Project Name: Algebraic Expression
//Project Description: Creates an algebraic expression by creating 2 "term" objects and plugging them into an expression.
//Date: Oct 13, 2020
//Written By: Ari Steinfeld

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Expression e = new Expression();

		//term one
		System.out.println("Please enter the coefficient and exponent for the first term:");
		e.getTermOne().setCoefficient(s.nextLong());
		e.getTermOne().setExponent(s.nextInt());

		//term two
		System.out.println("\n\nPlease enter the coefficient and exponent for the second term:");
		e.getTermTwo().setCoefficient(s.nextLong());
		e.getTermTwo().setExponent(s.nextInt());


		//change options for term 1
		System.out.println("\n\nWould you like to change the first term’s coefficient or exponent? Enter ‘c’ to change the \ncoefficient, ‘e’ to change the exponent, ‘b’ to change both and ‘n’ to change neither.");
		char option = s.next().charAt(0);
		if (option == 'C' || option == 'c' || option == 'b' || option == 'B') {
			System.out.println("\n\nWhat is the new Coefficient?");
			e.getTermOne().setCoefficient(s.nextLong());
		}if (option == 'e' || option == 'E' || option == 'b' || option == 'B') {
			System.out.println("\n\nWhat is the new exponent?");
			e.getTermOne().setExponent(s.nextInt());
		}

		//change options for term 2
		System.out.println("\n\nWould you like to change the second term’s coefficient or exponent? Enter ‘c’ to change the \ncoefficient, ‘e’ to change the exponent, ‘b’ to change both and ‘n’ to change neither.");
		option = s.next().charAt(0);
		if (option == 'C' || option == 'c' || option == 'b' || option == 'B') {
			System.out.println("\n\nWhat is the new Coefficient?");
			e.getTermTwo().setCoefficient(s.nextLong());
		}if (option == 'e' || option == 'E' || option == 'b' || option == 'B') {
			System.out.println("\n\nWhat is the new exponent?");
			e.getTermTwo().setExponent(s.nextInt());
		}

		//final stuff
		System.out.println("\n\n" + e.toString());
		System.out.println("\n\nPlease enter a value for x:");
		int x = s.nextInt();
		System.out.println(e.evaluate(x));





	}

}
