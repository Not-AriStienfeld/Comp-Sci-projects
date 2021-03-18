import java.util.ArrayList;
public class Digits
{ 
    private ArrayList<Integer> digitList;

    public Digits(int num){
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++){
            digitList.add(numStr.charAt(i) - '0');
        }
    }
    public boolean isStrictlyIncreasing(){
        boolean condition = true;
        for (int i = 0; i < digitList.size()-1; i++){
            if (digitList.get(i) < digitList.get(i+1)){
                condition = false;
            }
        }

        return condition;
    }
}