//Project Name: New Wave Arrays
//Project Description: creates an employee that has a name and a salary
//Date: Dec 8, 2020
//Written By: Ari Steinfeld
public class Employee {
	private String name;
	private double salary;

	//constructors
	public Employee() {
		this("Larry" , 1);
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	//getters
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}


	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	//toString
	public String toString() {
		return (name + " has a yearly salary of " + salary);
	}

}
