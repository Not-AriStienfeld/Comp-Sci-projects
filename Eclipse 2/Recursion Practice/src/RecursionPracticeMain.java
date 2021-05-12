
public class RecursionPracticeMain {

	public static void main(String[] args) {
		printx(5, 16499);

	}

	public static void printx(int x, int maxCount) {

		if (maxCount != 0) {
			System.out.println( x);

			printx(x, maxCount-1);
		}
	}

}
