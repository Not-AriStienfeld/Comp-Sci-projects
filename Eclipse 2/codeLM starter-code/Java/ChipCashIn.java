import java.util.Scanner;
import java.util.ArrayList;
class ChipCashIn {
    static double chipCashIn(int totalChipValue) {
        ArrayList <Integer> nums = new ArrayList<>();
        
        String str = totalChipValue + "";
        for (int i = 0; i < str.length(); i++){
            nums.add(Integer.parseInt("" + str.charAt(i)));
        }
      
        double out = totalChipValue;
            //taxes the last 2 digits
            if (totalChipValue >= 100){
                out -= 0.21 * ((double)Integer.parseInt(str.charAt(nums.size()-2) +""+ (str.charAt(nums.size()-1))));
                
                
            }
            //taxes the first 2 digits
            if(totalChipValue >= 1000){
                out -= 0.42 * ((double)Integer.parseInt(str.charAt(0) + "" + str.charAt(1)));
                
                
                
            }

            //taxes odds
            if(totalChipValue >= 100000){
                String odds = "";
                for (int i = nums.size() -1; i >= 0; i--){
                    if(i%2 != 0){
                        odds = odds + nums.get(i);
                    }
                }
                out -= 0.84 * Integer.parseInt(odds);
                
            } 
            //taxes evens
            if(totalChipValue >= 10000){
                String evens = "";
                for (int i = 0; i < nums.size(); i++){
                    if(i%2 == 0){
                        evens = evens + nums.get(i);
                    }
                }
                out -= 0.63 * Integer.parseInt(evens);
                
               
            }
            //primes
            if (totalChipValue >= 1000000){
                String primes = "";
                for(int i = 0; i < nums.size(); i++){
                    if (nums.get(i) == 1 || nums.get(i) == 2|| nums.get(i) == 3|| nums.get(i) == 5|| nums.get(i) == 7);
                    primes = primes + nums.get(i);
                }
                out -= 0.21 * Integer.parseInt(primes);
                
            }


        return out;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalChipValue = Integer.parseInt(s.nextLine());

        double functionCallResult = chipCashIn(totalChipValue);
        System.out.println(functionCallResult);
    }
}