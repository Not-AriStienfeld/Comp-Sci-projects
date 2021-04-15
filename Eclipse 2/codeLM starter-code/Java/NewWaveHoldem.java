import java.util.Scanner;

class NewWaveHoldem {
    static String newWaveHoldem(String[] hand, String[] communityCards) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int handLength = Integer.parseInt(s.nextLine());
        String[] hand = new String[handLength];
        for (int i = 0; i < handLength; i++) {
            hand[i] = s.nextLine();
        }
        int communityCardsLength = Integer.parseInt(s.nextLine());
        String[] communityCards = new String[communityCardsLength];
        for (int i = 0; i < communityCardsLength; i++) {
            communityCards[i] = s.nextLine();
        }

        String functionCallResult = newWaveHoldem(hand, communityCards);
        System.out.println(functionCallResult);
    }
}