//Project Name: Manager
//Project Description: extends employeee by adding a department
//Date: Apr 14, 2021
//Written By: Ari Steinfeld
public class Manager extends Employeee {
	//instance fields
	private String department;
	
	//constructors
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.setDepartment(department);
		
	}
	public Manager() {
		this("Ari", 1000000, "smart department");
	}
	
	//getters
	public String getDepartment() {
		return department;
	}
	
	//setters
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//toString
	public String toString() {
		return ("My name is " + getName() + " and my salary is "  + getSalary() + ". My department is " + department + ".");
	}
}
