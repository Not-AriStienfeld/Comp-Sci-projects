import java.util.Scanner;

class PokerTableTraversal {
    static int pokerTableTraversal(String[] tables) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tablesLength = Integer.parseInt(s.nextLine());
        String[] tables = new String[tablesLength];
        for (int i = 0; i < tablesLength; i++) {
            tables[i] = s.nextLine();
        }

        int functionCallResult = pokerTableTraversal(tables);
        System.out.println(functionCallResult);
    }
}