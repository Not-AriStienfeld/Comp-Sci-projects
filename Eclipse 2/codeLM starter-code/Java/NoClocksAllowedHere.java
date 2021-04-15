import java.util.Scanner;

class NoClocksAllowedHere {
    static int noClocksAllowedHere(int firstHourGlass, int secondHourGlass, int timer) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstHourGlass = Integer.parseInt(s.nextLine());
        int secondHourGlass = Integer.parseInt(s.nextLine());
        int timer = Integer.parseInt(s.nextLine());

        int functionCallResult = noClocksAllowedHere(firstHourGlass, secondHourGlass, timer);
        System.out.println(functionCallResult);
    }
}