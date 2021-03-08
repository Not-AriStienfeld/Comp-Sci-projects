

import java.util.Scanner;
public class NewWaveMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employee[] employees = {new Employee("Peter Gibbons", 54000),new Employee("Joanna", 26000),new Employee("Michael Bolton", 63000),new Employee(),new Employee("Samir Nagheenanajar", 32000),new Employee("Lawrence" , 23000),new Employee("Milton Waddams", 0),new Employee("Bill Lumbergh", 12000),new Employee("Tom Smykowski", 62000),new Employee("Bob Slydell", 75000), new Employee("Bob Porter", 72000)};

		//finding the top most payed
		int mostPayed = 0;
		double largestSalary = employees[0].getSalary();
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() > largestSalary) {
				largestSalary = employees[i].getSalary();
				mostPayed = i;
			}
		}

		//finding the second most payed
		int secondMostPayed = 1;
		largestSalary = employees[1].getSalary();
		if (mostPayed == 1) {
			secondMostPayed = 0;
			largestSalary = employees[0].getSalary();
		}
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() > largestSalary && i != mostPayed) {
				largestSalary = employees[i].getSalary();
				secondMostPayed = i;
			}
		}

		//finding the third most payed
		int thirdMostPayed = 1;
		if (secondMostPayed != 1 && mostPayed != 1) {
			largestSalary = employees[1].getSalary();
		}
		else if (secondMostPayed != 2 && mostPayed != 2) {
			thirdMostPayed = 2;
			largestSalary = employees[2].getSalary();

		}else {
			thirdMostPayed = 3;
			largestSalary = employees[3].getSalary();

		}

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() > largestSalary && i != mostPayed && i != secondMostPayed) {
				largestSalary = employees[i].getSalary();
				thirdMostPayed = i;
			}
		}



		//printing it all out
		System.out.println("Here are the people you should fire: ");
		System.out.println(employees[mostPayed].toString());
		System.out.println(employees[secondMostPayed].toString());
		System.out.println(employees[thirdMostPayed].toString());
		
		//I am fully aware that this is an extremely inefficient way of finding out which employee to fire

	}

}
