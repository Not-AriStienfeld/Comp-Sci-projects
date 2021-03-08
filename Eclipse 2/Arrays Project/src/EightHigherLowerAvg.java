//Project Name: Arrays Project
//Project Description: gets passed 8 numbers and finds the highest, lowest, and average of all 8 numbers
//Date: Nov 20, 2020
//Written By: Ari Steinfeld

import java.util.Scanner;

public class EightHigherLowerAvg {
	private double[] scores = new double[] {0,0,0,0,0,0,0,0};
	Scanner s = new Scanner(System.in);
	public EightHigherLowerAvg() {
		this(new double[] {0,0,0,0,0,0,0,0});
	}
	public EightHigherLowerAvg(double[] scores) {
		this.scores = scores;
	}
	
	//reads in 8 numbers and assigns them to the array
	public void getNums() {
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Please enter in score " + (i+1));
			scores[i] = s.nextDouble();
		}
	}
	
	//finds the average
	public double avg() {
		double total = 0;
		for (int i = 0; i <scores.length; i++) {
			total += scores[i];
		}
		
		return total/scores.length;
	}
	
	//finds the largest number
	public double largest() {
		double largest = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > largest) {
				largest = scores[i];
			}
		}
		return largest;
	}
	//finds the smallest number
		public double smallest() {
			double smallest = scores[0];
			for (int i = 0; i < scores.length; i++) {
				if (scores[i] < smallest) {
					smallest = scores[i];
				}
			}
			return smallest;
		}


}
