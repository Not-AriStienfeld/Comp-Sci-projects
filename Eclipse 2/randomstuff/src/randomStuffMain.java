import java.util.Scanner;
public class randomStuffMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	}
	public static void newWavePrint(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j]%2 == 0) {
					System.out.print("New ");
				}else {
					System.out.print("Wave ");
				}
			}
			System.out.println("");
		}
	}
}
