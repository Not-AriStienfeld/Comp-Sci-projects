import java.util.ArrayList;

public class ArrayListName {

	public static void main(String[] args) {
		ArrayList <Student> students = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			students.add(new Student());
		}
		for(int i = 0; i < students.size(); i++) {
			if (students.get(i).getPSATScore()*1.2 < 1520) {
			students.get(i).setPSATScore( (int) ((int)students.get(i).getPSATScore()*1.2));
			} else {
				students.get(i).setPSATScore(1520);
			}
		}
		for(int i = 0; i < students.size(); i++) {
			if (students.get(i).getPSATScore() < 1000) {
				students.remove(i);
			}
		}
	}

}
