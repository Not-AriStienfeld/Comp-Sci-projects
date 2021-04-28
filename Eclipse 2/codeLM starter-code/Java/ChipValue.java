import java.util.Scanner;

class ChipValue {
    static int chipValue(int redValue, int blackValue, int greenValue, int yellowValue, int whiteValue, int redAmount, int blackAmount, int greenAmount, int yellowAmount, int whiteAmount, int totalValueOfChips) {
        //figuring out if a chip is unknown
        int answer = 0;
        int total = 0;
        if(redValue == -1){
            total = (blackAmount*blackValue) + (greenAmount*greenValue)+ (yellowAmount*yellowValue) + (whiteAmount*whiteValue);
            answer = (totalValueOfChips - total)/redAmount;
        } else if(blackAmount == -1){
            total = (redAmount*redValue) + (greenAmount*greenValue)+ (yellowAmount*yellowValue) + (whiteAmount*whiteValue);
            answer = (totalValueOfChips - total)/blackAmount;
        } else if(greenValue == -1){
            total = (redAmount*redValue) + (blackAmount*blackValue)+ (yellowAmount*yellowValue) + (whiteAmount*whiteValue);
            answer = (totalValueOfChips - total)/greenAmount;
        }else if(yellowValue == -1){
            total = (blackAmount*blackValue) + (greenAmount*greenValue)+ (redAmount*redValue) + (whiteAmount*whiteValue);
            answer = (totalValueOfChips - total)/yellowAmount;
        }
        else if(whiteValue == -1){
            total = (blackAmount*blackValue) + (greenAmount*greenValue)+ (yellowAmount*yellowValue) + (redAmount*redValue);
            answer = (totalValueOfChips - total)/whiteAmount;
        }
        return answer;



    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int redValue = Integer.parseInt(s.nextLine());
        int blackValue = Integer.parseInt(s.nextLine());
        int greenValue = Integer.parseInt(s.nextLine());
        int yellowValue = Integer.parseInt(s.nextLine());
        int whiteValue = Integer.parseInt(s.nextLine());
        int redAmount = Integer.parseInt(s.nextLine());
        int blackAmount = Integer.parseInt(s.nextLine());
        int greenAmount = Integer.parseInt(s.nextLine());
        int yellowAmount = Integer.parseInt(s.nextLine());
        int whiteAmount = Integer.parseInt(s.nextLine());
        int totalValueOfChips = Integer.parseInt(s.nextLine());

        int functionCallResult = chipValue(redValue, blackValue, greenValue, yellowValue, whiteValue, redAmount, blackAmount, greenAmount, yellowAmount, whiteAmount, totalValueOfChips);
        System.out.println(functionCallResult);
    }
}