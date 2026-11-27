public class CopyEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 5, 2, 7, 4, 9, 6};
        int[] evenNumbers = new int[8];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[count] = numbers[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}