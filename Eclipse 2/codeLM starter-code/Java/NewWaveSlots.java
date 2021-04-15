import java.util.Scanner;

class NewWaveSlots {
    static char[][] newWaveSlots(char[][] givenSlot) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int givenSlotRow = Integer.parseInt(s.nextLine());
        int givenSlotCol = Integer.parseInt(s.nextLine());
        char[][] givenSlot = new char[givenSlotRow][givenSlotCol];
        for (int i = 0; i < givenSlotRow; i++) {
            for (int j = 0; j < givenSlotCol; j++) {
                givenSlot[i][j] = s.nextLine().charAt(0);
            }
        }

        char[][] functionCallResult = newWaveSlots(givenSlot);
        for (int i = 0; i < functionCallResult.length; i++) {
            for (int j = 0; j < functionCallResult[i].length; j++) {
                System.out.print(functionCallResult[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}