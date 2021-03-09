import java.util.Scanner;
public class ArraydMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		double[] wowThatsBig = new double[100];
		
		for (int i = 0; i < wowThatsBig.length; i++) {
			wowThatsBig[i] = i*i;
		}
		
		double total = 0;
		for (int i = 0; i < wowThatsBig.length; i++) {
			total += wowThatsBig[i];
		}
		System.out.println(total/wowThatsBig.length);
		double max1 = 0;
		double max2 = wowThatsBig[0];
		for (int i = 0; i < wowThatsBig.length; i++) {
			max2 = wowThatsBig[i];
			if (max2 > max1) {
				max1 = max2;
			}
			
		}
		
		
		 System.out.println(max1 + " should be equal to " + wowThatsBig[99]);
		
		String[] randomWords = {"bob","word", "yellow", "flow","bird" };
		String together = "";
		for (int i = 0; i < randomWords.length; i++) {
			together+= randomWords[i];
		}
		System.out.println(together);
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("enter in a number:");
			numbers[i] = s.nextDouble();
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); 
		}
		
		
		int[] randomNumbers = new int[1000];
		for (int i = 0; i< randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 100) + 1;
		}
		//even
		System.out.println("Even");
		int evenSum = 0; int evenTotal = 0;
		for (int i = 0; i< randomNumbers.length; i++) {
			if ( randomNumbers[i]%2 == 0) {
				System.out.print(randomNumbers[i] + ", ");
				evenSum += randomNumbers[i];
				evenTotal++;
			}
		}
		System.out.println("\n\nOdd:");
		//odd
		int oddSum = 0; int oddTotal = 0;
		for (int i = 0; i< randomNumbers.length; i++) {
			if (randomNumbers[i]%2 != 0) {
				System.out.print(randomNumbers[i] + ", ");
				oddSum += randomNumbers[i];
				oddTotal++;
			}
		}
		System.out.println("\n\nThe even average is: " + (evenSum/evenTotal));
		System.out.println("The odd average is:  " + (oddSum/oddTotal));
	}

}
