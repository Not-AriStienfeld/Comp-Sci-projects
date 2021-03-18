
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
    	int numbers[] = {0, 1, 2};
    	double sum = 0;
    	int min = numbers[0];
    	int max = numbers[0];
    	for (int i = 0; i < numbers.length; i++) {
    		if (numbers[i] > max) {
    			max =numbers[i];
    		}
    		if (numbers[i] < min) {
    			min = numbers[i];
    		}
    	}
    	System.out.println("max: " + max);
    	System.out.println("min: " + min);
    	
    	String str = "hello";
    	int shift = 5;
    	char[] strArr = str.toCharArray(); 
    	for (int i = 0; i < strArr.length; i++) {
    		if (((int) strArr[i] +shift < 91 && (int) strArr[i] > 64) || ((int) strArr[i]+shift < 123 && (int) strArr[i] > 96)) {
    			strArr[i] = (char) (strArr[i] +shift);
    		}else {
    			strArr[i] = (char) (strArr[i] +shift -32);
    		}
    	}
    	
    }
}
