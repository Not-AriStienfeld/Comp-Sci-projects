import java.util.Scanner;

class ClubCrazy {
    static String clubCrazy(String jackCards, String dianeCards) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String jackCards = s.nextLine();
        String dianeCards = s.nextLine();

        String functionCallResult = clubCrazy(jackCards, dianeCards);
        System.out.println(functionCallResult);
    }
}