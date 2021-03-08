//Project Name: test sort 
//Project Description: tests a type of sorting found on stack overflow
//Date: Dec 13, 2020
//Written By: Ari Steinfeld
import java.util.Arrays;
public class testsort {
	public static void main(String[] args) {
		Employee[] numbers = {new Employee("Peter Gibbons", 54000),new Employee("Joanna", 26000),new Employee("Michael Bolton", 63000),new Employee(),new Employee("Samir Nagheenanajar", 32000),new Employee("Lawrence" , 23000),new Employee("Milton Waddams", 0),new Employee("Bill Lumbergh", 12000),new Employee("Tom Smykowski", 62000),new Employee("Bob Slydell", 75000), new Employee("Bob Porter", 72000)};
		double[] doubleArray = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			doubleArray[i] = numbers[i].getSalary();
		}
		Arrays.sort(doubleArray);
		for (double d: doubleArray){
		       System.out.println(d);
		    }
		
		
	}

}
