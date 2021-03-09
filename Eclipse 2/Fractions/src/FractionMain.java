//Name:Main
//Date: 9/16/2020
//Description: creates 3 different fractions and prints them all out
//Written By: Ari Steinfeld

import java.util.Scanner;

public class FractionMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Fraction one = new Fraction();
		Fraction two = new Fraction(5.1, 6.8);
		
		System.out.println("What would you like the Numerator to be?");
		double numerator = s.nextDouble();
		System.out.println("What would you like the Denominator to be?");
		double denominator = s.nextDouble();
		
		Fraction three = new Fraction(numerator, denominator);
		
		System.out.println("Fraction 1:  " + one.getNumerator() + "/" + one.getDenominator()  );
		System.out.println("Fraction 2:  " + two.getNumerator() + "/" + two.getDenominator());
		System.out.println("Fraction 3:  " + three.getNumerator() + "/" + three.getDenominator() );
	}

}
