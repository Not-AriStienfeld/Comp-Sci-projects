//Project Name: Array Project
//Project Description: reads in 10 real numbers then prints the average and all numbers above it.
//Date: Nov 18, 2020
//Written By: Ari Steinfeld

import java.util.Scanner; 
public class TenReal {
	Scanner s = new Scanner(System.in);
	public double[] tenNums = new double[]{0,0,0,0,0,0,0,0,0,0};
	
	public TenReal() {
		this(new double[]{0,0,0,0,0,0,0,0,0,0});
	}
	
	public TenReal(double[] tenNums) {
		this.tenNums = tenNums;
	}
	
	//reads in 10 real numbers and assigns them
	public void getTen() {
		
		for (int i = 0; i<tenNums.length;i++) {
			System.out.println("please enter numer " + (i+1));
			tenNums[i] = s.nextDouble();
		}
	}
	
	//gets the average
	public double avg() {
		double total = 0;
		for (int i = 0; i<tenNums.length;i++) {
			total+= tenNums[i];
		}
		return total/tenNums.length;
	}
	
	public void biggerThanAvg() {
		System.out.println("The numbers that are greater than the average are: ");
		for (int i = 0; i<tenNums.length;i++) {
			if (tenNums[i] > avg()) {
				System.out.print(tenNums[i] + ", ");
			}
		}
		System.out.println("\n\n");
	}
	
	
	
}
