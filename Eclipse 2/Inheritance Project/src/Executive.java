//Project Name: Executive
//Project Description: executive extends the manager class by adding a title to the manager
//Date: Apr 14, 2021
//Written By: Ari Steinfeld
public class Executive extends Manager{
	//instance fields
	private String title;
	
	//constructors
	public Executive(String name, double salary, String department, String title) {
		super(name, salary, department);
		this.setTitle(title);
	}
	
	public Executive() {
		this("Ari", 1000000, "smart department", "Grand intelligence");
	}

	//getters
	public String getTitle() {
		return title;
	}

	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	//toString
	public String toString() {
		return ("I am " + getName() + ", and my title is: " + title + "! My salary is " + getSalary() + ", which is far higher than yours. My department is " + getDepartment() + ".");
	}
	
}
