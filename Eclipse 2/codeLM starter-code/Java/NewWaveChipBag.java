import java.util.Scanner;

class NewWaveChipBag {
    static double newWaveChipBag(int weight, double newWaveSpecialValue) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int weight = Integer.parseInt(s.nextLine());
        double newWaveSpecialValue = Double.parseDouble(s.nextLine());

        double functionCallResult = newWaveChipBag(weight, newWaveSpecialValue);
        System.out.println(functionCallResult);
    }
}