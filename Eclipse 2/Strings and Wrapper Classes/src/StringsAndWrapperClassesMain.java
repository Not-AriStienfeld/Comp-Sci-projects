//Project Name: Strings and Wrapper Classes
//Project Description: Create 3 separate projects that all do different things using Strings.
//Date: Mar 2, 2021
//Written By: Ari Steinfeld
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;
public class StringsAndWrapperClassesMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//project one. read in a simple phrase asking what the user's phrase is, and turn it into a modified version of it.
		System.out.println("Please enter in a string: ");
		String input = s.nextLine();

		//turns the string into an array of chars to make it easier to replace individual letters
		char[] inputChar = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if ( inputChar[i] < 90 && inputChar[i] > 64) {
				inputChar[i] = (char) (inputChar[i] + 32);

			}
			else if ( inputChar[i] < 123 && inputChar[i] > 96) {
				inputChar[i] = (char) (inputChar[i] - 32);
			}
		}
		//turns the array of chars back into a string
		input = String.valueOf(inputChar);

		//replaces all spaces with a zero width joiner character
		input = input.replace(' ', '‍');
		//replaces all es with is
		input = input.replace('e', 'i');
		//replaces all Es with Os
		input = input.replace('E', 'O');
		int charCount = 0;
		//makes charCount equal to the sum of the ASCII values
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '‍') { 
				charCount += (int) input.charAt(i);
			}
		}
		input = input.concat( " "+ charCount);
		System.out.println(input);
		//PROJECT 2: replace all instances of "Noah Rubin" with "Dr. Rubin", and change all prices to be 10% higher.
		System.out.println("Noah, please enter your message: ");
		String noahRubin = s.nextLine();
		String price = noahRubin.substring(noahRubin.indexOf('$')+1, noahRubin.indexOf('.') +3);
		String secondPart = noahRubin.substring(noahRubin.indexOf('.') +3);
		noahRubin = noahRubin.replace("Noah Rubin", "Dr. Rubin");
		double newPrice =1.10 * Double.parseDouble(price);
		String firstPart = noahRubin.substring(0, noahRubin.indexOf('$')+1);
		System.out.println(firstPart + newPrice + secondPart);

		//PROJECT 3: get passed an unkown ammount of int in a string and get the mean, median, and mode
		System.out.println("Enter the numbers: ");
		String number = s.nextLine();
		String[] numberArr = number.split(" ");
		double[] numbers = new double[numberArr.length];

		int counter = 0;
		double mean = 0, median = 0;
		ArrayList <Integer> numsArrList = new ArrayList<>();
		ArrayList <Integer> counterList = new ArrayList<>();
		ArrayList <Integer> modeList = new ArrayList<>();
		boolean runRemove = false;
		Arrays.sort(numbers);
		for (int i = 0; i < numberArr.length; i++) {
			numbers[i] = (Double.parseDouble(numberArr[i]));
			numsArrList.add(Integer.parseInt(numberArr[i]));
		}
		for(int i = 0; i < numbers.length; i++) {
			counter++;
			mean+= numbers[i];

		}
		int mode = 0, counter3 = 0, firstFor, secondFor;
		int count = 0;
		for (int i = 0; i < numsArrList.size(); i++) {
			runRemove = false;
			mode = 0; counter3 = 0;
			for (firstFor = 0; firstFor < numsArrList.size(); ++firstFor) {
				count = 0;
				for (secondFor = 0; secondFor < numsArrList.size(); ++secondFor) {
					if (numsArrList.get(secondFor) == numsArrList.get(firstFor))
						++count;
				}

				if (count > counter3) {
					counter3 = count;
					mode = (int) numsArrList.get(firstFor);
				}
			}
			if (modeList.size() == 0) {
				modeList.add(mode);
				runRemove = true;
				counterList.add(count);
			} else if (count == counterList.get(0)) {
				modeList.add(mode);
				runRemove = true;
				counterList.add(count);
			}
			if (runRemove){
				for (int j = 0; j < numsArrList.size(); j++){
					if (numsArrList.get(j) == mode) {
						numsArrList.remove(j);
					}
				}
			}




		}
		median = numbers[(int)counter/2];
		mean = mean/counter;
		System.out.println("The mean is:  " + mean);
		System.out.println("The median is:  " + median);
		System.out.print("The mode is:  ");
		for (int i = 0; i < modeList.size(); i++) {
			System.out.print(modeList.get(i) + " ");
		}





	}

}
