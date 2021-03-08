//Project Name: Arrays project
//Project Description: reads in 10 integers, prints out the odd, the even, and the negative
//Date: Nov 18, 2020
//Written By: Ari Steinfeld

import java.util.Scanner;

public class IntReader {
	Scanner s = new Scanner(System.in);
	private int[] even;
	private int[] odd;
	private int[] negative;
	
	
	
	public IntReader() {
		this(new int[] {1,1,1,1,1,1,1,1,1,1,1}, new int[]{0,0,0,0,0,0,0,0,0,0}, new int[]{1,1,1,1,1,1,1,1,1,1});
	}
	public IntReader (int[] even, int[] odd, int[] negative) {
		this.even = even;
		this.odd = odd;
		this.negative = negative;
	}
	
	
	
	//gets and sorts 10 numbers
	public void input() {
		for (int i = 0; i < 10; i++) {
			System.out.println("enter a number: ");
			int tempNum = s.nextInt();
			if (tempNum<0) {
				this.negative[i] = tempNum;
			}if (tempNum%2 == 0) {
				this.even[i] = tempNum;
			}if (tempNum%2 != 0){
				this.odd[i] = tempNum;
			}
		}
	}
	
	//prints all the odds
	public void getOdds() {
		for (int i = 0; i < odd.length; i++) {
			if (odd[i] != 0) {
				System.out.print(odd[i] + ", ");
			}
		}
		System.out.println("\n");
	}
	
	//prints all the evens
	public void getEvens() {
		for (int i = 0; i < even.length; i++) {
			if (even[i] != 1) {
				System.out.print(even[i] + ", ");
			}
		}
		System.out.println("\n");
	}
	
	//prints all the negatives
	public void getNegatives() {
		for (int i = 0; i < negative.length; i++) {
			if (negative[i] != 1) {
				System.out.print(negative[i] + ", ");
			}
		}
		System.out.println("\n");
	}
}
