
public class Student {
	private String name;
	private int PSATScore;
	
	public Student(){
		name = new String();
		for (int i = 0; i<3; i++) {
			name += (char) ((int) (Math.random()* 26) + 97);
			
			//400-1520
			PSATScore = (int) ((Math.random() * 1121)+400);
		}
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getPSATScore() {
		return PSATScore;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPSATScore(int pSATScore) {
		PSATScore = pSATScore;
	}
	
	//toString
	public String toString() {
		return ("");
	}
}
