import java.util.Scanner;

class HowManyEngineersToChangeALightbulb {
    static boolean howManyEngineersToChangeALightbulb(int position) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int position = Integer.parseInt(s.nextLine());

        boolean functionCallResult = howManyEngineersToChangeALightbulb(position);
        System.out.println(functionCallResult);
    }
}