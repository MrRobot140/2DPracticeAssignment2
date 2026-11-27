public class SumPositiveNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, -2, 0, 7, -4, 5, 8, -1, 2, -6};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}