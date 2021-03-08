
public class product {

	private String name;
	private double cost;

	public product() {
		this("flex tape", 3.99);
	}
	public product(String name, double cost) {
		this.cost = cost;
		this.name = name;
	}
	
	//getters
	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;

	}
	
	//setters
	
	public void setName(String name) {
		this.name = name;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	//tostring
	public String toString() {
		return ("The " + name + " costs "  + cost + " USD");
	}

}
