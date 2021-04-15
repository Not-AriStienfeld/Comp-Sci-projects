import java.util.Scanner;

class Waves11 {
    static String waves11(int encryptionKey, String encryptedPassword) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int encryptionKey = Integer.parseInt(s.nextLine());
        String encryptedPassword = s.nextLine();

        String functionCallResult = waves11(encryptionKey, encryptedPassword);
        System.out.println(functionCallResult);
    }
}