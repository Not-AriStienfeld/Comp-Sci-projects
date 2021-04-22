//Project Name:Employeee (I had to add the extra e or eclipse would get mad at me)
//Project Description: is an employee with a name and a salary
//Date: Apr 14, 2021
//Written By: Ari Steinfeld
public class Employeee {
	//instance fields
	private String name;
	private double salary;
	
	//constructors
	public Employeee(String name, double salary) {
		this.setName(name);
		this.setSalary(salary);
	}
	public Employeee() {
		this("Ari" , 100000);
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getPaid() {
		return name + " should get payed " + salary*40 + ".";
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
		return ("My name is " + name + ", and my salary is " + salary + ".");
	}
}
