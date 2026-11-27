import java.util.Scanner;

public class CountNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        int count = 0;

        System.out.println("Enter 8 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] >= 10 && numbers[i] <= 20) {
                count++;
            }
        }

        System.out.println("Count: " + count);
        scanner.close();
    }
}