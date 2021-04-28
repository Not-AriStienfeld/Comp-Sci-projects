import java.util.Scanner;

class Extraction {
    static int[][] extraction(char[][] casinoFloor) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int casinoFloorRow = Integer.parseInt(s.nextLine());
        int casinoFloorCol = Integer.parseInt(s.nextLine());
        char[][] casinoFloor = new char[casinoFloorRow][casinoFloorCol];
        for (int i = 0; i < casinoFloorRow; i++) {
            for (int j = 0; j < casinoFloorCol; j++) {
                casinoFloor[i][j] = s.nextLine().charAt(0);
            }
        }

        int[][] functionCallResult = extraction(casinoFloor);
        for (int i = 0; i < functionCallResult.length; i++) {
            for (int j = 0; j < functionCallResult[i].length; j++) {
                System.out.print(functionCallResult[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}