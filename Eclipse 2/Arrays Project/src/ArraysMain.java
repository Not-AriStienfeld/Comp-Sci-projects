//Project Name: Arrays Project
//Project Description: create 4 separate array projects and allow the user to access them all with input to choose which one
//Date: Nov 18, 2020
//Written By: Ari Steinfeld

import java.util.Scanner;

public class ArraysMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntReader ir = new IntReader();
		TenReal tr = new TenReal();
		EightHigherLowerAvg ehla = new EightHigherLowerAvg();
		Nims nim = new Nims();
		int condition = 9;

		while (condition != 0) {
			System.out.println("type 1 to sort 10 numbers\ntype 2 to find the average of 10 numbers\ntype 3 to find the lowest, highest, and average of 8 scores\ntype 4 to play nims\ntype 0 to end the loop");
			condition = s.nextInt();
			if (condition == 1) {

				ir.input();
				System.out.println("\n\nhere are the Evens: ");
				ir.getEvens();
				System.out.println("here are the Odds: ");
				ir.getOdds();
				System.out.println("here are the Negatives: ");
				ir.getNegatives();

			}else if (condition == 2) {
				tr.getTen();
				System.out.println("The average is " + tr.avg());
				tr.biggerThanAvg();

			}else if (condition == 3) {
				ehla.getNums();
				System.out.println("The average is " + ehla.avg());
				System.out.println("The largest is " + ehla.largest());
				System.out.println("The smallest is " + ehla.smallest() + "\n\n");

			}else if (condition == 4) {
				nim.game();
				System.out.println("\n\n");
			}


		}
	}

}
