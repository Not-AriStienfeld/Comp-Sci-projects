import java.util.Scanner;
import java.util.ArrayList;
public class InheritancePracticeMain {

	public static void main(String[] args) {
		ArrayList<cube> cubes = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			if((int)Math.random()*2 ==0) {
				cubes.add(new cube((int)(Math.random()*10) +1));
			}else {
				cubes.add(new RightRectangularPrism2((int)Math.random()*10  +1, (int)Math.random()*10 +1, (int)Math.random()*10 +1)    );
			}
		}
	}

}
